package com.ontheroad.controller.UserManage;

import cn.modoumama.page.PageObject;
import com.ontheroad.core.util.JSONUtils;
import com.ontheroad.entity.SysLog;
import com.ontheroad.service.SysLogService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/system/log")
public class LogManageController extends BaseController {
	Logger log = LoggerFactory.getLogger(LogManageController.class);
	@Autowired
	private SysLogService sysLogService;

	@RequestMapping(value = "init")
	public String init(HttpServletRequest request){
		return "Modal/task/userManage/system/system/log/init";
	}
	@RequestMapping(value = "list")
	@ResponseBody
	public void list(HttpServletRequest request,HttpServletResponse response,SysLog sLog) {
		log.debug("method: list() ");
		PageObject po = getPageObject(request,"LOG_TIME desc");
		po.getCondition().put("userName",sLog.getUserName());
		po.getCondition().put("userIp",sLog.getUserIp());
		po.getCondition().put("createTimeStart",request.getParameter("createTimeStart"));
		po.getCondition().put("createTimeEnd",request.getParameter("createTimeEnd"));
		writeToPage(JSONUtils.toJson(sysLogService.getGridDataModelByCondition(po)), response);
	}
}
