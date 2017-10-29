package com.ontheroad.controller;

import com.ontheroad.entity.Login;
import com.ontheroad.pojo.Admin.Admin;
import com.ontheroad.pojo.Admin.AdminLogin;
import com.ontheroad.service.AdminService.AdminService;
import com.ontheroad.service.DeviceService.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DeviceService deviceService;

    /**
     * 登录转发
     * @return
     */
    @RequestMapping("/login")
    public String index() {
        return "index";
    }

    @RequestMapping("/device/devices")
    public String devices() {
        return "admin/device/devices";
    }
   
    /**
     * 
    * 
    * @Description: 设备列表
    * @return    
    * Map<Object,Object>    
    * @throws 
    * @author 胡俊
    * @email 510830970@qq.com
     */
    @RequestMapping(value = "/device/devicelist", method = RequestMethod.POST)
    @ResponseBody
    public Map<Object, Object> devicelist() {
    	Map<Object, Object> map= deviceService.getAllDevices();
    	return map;
    }
}
