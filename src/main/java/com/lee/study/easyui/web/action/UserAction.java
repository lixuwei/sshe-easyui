package com.lee.study.easyui.web.action;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.lee.study.easyui.domain.Tuser;
import com.lee.study.easyui.exception.TuserException;
import com.lee.study.easyui.service.TuserService;

@ParentPackage("base")
public class UserAction {
	
	@Resource
	private TuserService tuserService;
	
	public void setTuserService(TuserService tuserService) {
		this.tuserService = tuserService;
	}
	private static final Logger logger = Logger.getLogger("userAction");
	@Action(value="user")
	public void test(){
		Tuser user = new Tuser();
		user.setId(UUID.randomUUID().toString());
		user.setName("lee2");
		user.setPwd("sdfs");
		user.setCreatedatetime(new Date());
		try {
			tuserService.save(user);
		} catch (TuserException e) {
			e.printStackTrace();
		}
		
		logger.info("保存成功");
	}
}
