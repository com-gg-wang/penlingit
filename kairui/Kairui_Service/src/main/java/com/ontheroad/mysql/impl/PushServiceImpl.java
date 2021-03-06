package com.ontheroad.mysql.impl;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVPush;
import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.SendCallback;
import com.ontheroad.service.PushService;
@Service
public class PushServiceImpl implements PushService {
	private final static Logger logger=LoggerFactory.getLogger(PushServiceImpl.class);
	@Override
	public void pushInstallationId(Integer userId,com.alibaba.fastjson.JSONObject json) {
		AVOSCloud.initialize("EKDyDJR6JNNjJe2L9bwAbAIa-gzGzoHsz","Syi5KsGmQuLpXDxODzvQlhKk","1SOIwMs1CONX2GVybAyKoTsK");
		AVOSCloud.setDebugLogEnabled(true);
		AVPush push = new AVPush();
		push.setData(json);
	    push.setCloudQuery("select * from _Installation where userId =" + userId );
	    push.setProductionMode(false);
	    push.sendInBackground(new SendCallback() {
	      @Override
	      public void done(AVException e) {
	    	  if(e==null){
		    		logger.info("单个推送成功");
		    	}else{
		    		logger.info("单个推送失败");
		    	}
	      }
	    });
	}
		public static void main(String[] args) {
			com.alibaba.fastjson.JSONObject js=new com.alibaba.fastjson.JSONObject();
			js.put("alert", "111");
			js.put("action", "com.avos.UPDATE_STATUS");
			new PushServiceImpl().pushInstallationId(26,js);
		}
}
