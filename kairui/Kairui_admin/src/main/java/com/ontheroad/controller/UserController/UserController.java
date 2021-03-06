package com.ontheroad.controller.UserController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ontheroad.core.util.Md5Util;
import com.ontheroad.core.util.SessionUtil;
import com.ontheroad.entity.TsMenu;
import com.ontheroad.entity.TsUser;
import com.ontheroad.mysql.entity.TbEula;
import com.ontheroad.service.UserService;
import com.ontheroad.service.AppService.AppUserService;
import com.ontheroad.utils.MapUtil;
import com.ontheroad.utils.WebUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private AppUserService appUserService;
	
	/**
	 * 
	* 
	* @Description: 登录
	* @param user
	* @return    
	* String    
	* @throws 
	* @author 胡俊
	* @email 510830970@qq.com
	 */
	@ResponseBody
	@RequestMapping("/login")
	public Map<Object, Object> login(TsUser user, HttpServletRequest request){
		TsUser user2=userService.login(user);
		if(user2==null){
			return MapUtil.getFailureJson("用户名或者密码错误");
		}
		//存session
		request.getSession().setAttribute("user", user2);
		return MapUtil.getSuccessJson();
	}
	/**
	 * 用户拥有菜单
	 * @param user
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getMenuByUser")
	public Map<Object, Object> getMenuByUser(HttpServletRequest request){
		TsUser user=SessionUtil.getUser(request);
		List<TsMenu> ls=userService.getMenu(user);
		//将用户菜单拼接成前端需要的json
		JSONArray result=new JSONArray();
		for (TsMenu m : ls) {
			if(m.getMenuType()==3)continue;
			JSONObject json=new JSONObject();
			json.put("menuName", m.getMenuName());
			json.put("sysMenuList", userService.getMenusUserByParentId(user.getUserId(), m.getMenuId()));
			result.add(json);
		}
		return MapUtil.getSuccessJson(result);
	}
	
	/**
	 * 登出
	 * @param user
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/logOut")
	public Map<Object, Object> logOut(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return MapUtil.getSuccessJson();
	}
	
	/**
	 * 修改密码
	 * @param user
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/updateUserPwd")
	public Map<Object, Object> updateUserPwd(HttpServletRequest request,String password,String newPwd){
		TsUser user=SessionUtil.getUser(request);
		String dbpwd= Md5Util.makeMd5Sum(password.getBytes()).toUpperCase();
		if(!user.getUserPwd().equals(dbpwd)){
			return MapUtil.getFailureJson("原密码错误");
		}
		newPwd = Md5Util.makeMd5Sum(newPwd.getBytes()).toUpperCase();
		user.setUserPwd(newPwd);
		userService.updateUser(user);
		return MapUtil.getSuccessJson();
	}
	
	/**
	 * 添加或更新用户协议
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addOrUpdateEula")
	public Map<Object, Object> addOrUpdateEula(HttpServletRequest request,TbEula eula){
		eula.setAddress("https://sec.ldzhn.com/view/Modal/task/userManage/system/yhxy/show.html");
		appUserService.updateOrAddEula(eula);
		return MapUtil.getSuccessJson();
	}
	
	/**
	 * 查询用户协议
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/selectEula")
	public Map<Object, Object> selectEula(HttpServletRequest request){
		return MapUtil.getSuccessJson(appUserService.getEula());
	}
	
	/**
	 * 查询用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getUserInfo")
	public Map<Object, Object> getUserInfo(HttpServletRequest request){
		TsUser user=SessionUtil.getUser(request);
		return MapUtil.getSuccessJson(user);
	}
	/**
	 * 获取当前用户是否具有某审核权限
	 * @param user
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAccess")
	public Map<Object, Object> getAccess(HttpServletRequest request,String menuName){
		TsUser user=SessionUtil.getUser(request);
		return MapUtil.getSuccessJson(userService.getAccess(menuName, user.getUserId()));
	}
}
