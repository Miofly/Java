package test;/*
package com.ssm.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.alibaba.fastjson.JSON;
import com.xzhang.model.InstmtQuartz;
import com.xzhang.service.IQuartzService;
import com.xzhang.util.QuartzManager;

*/
/**
* @Title: InstantiationTracingBeanPostProcessor.java
* @Package com.xzhang.controller
* @Description: TODO(所有定时任务的启动类:当spring启动的时候它就跟着启动)
* @author zx  
* @date 2016-8-22 下午4:28:24
*//*

public class InstantiationTracingBeanPostProcessor  {
	
	private static final Logger log = Logger.getLogger(InstantiationTracingBeanPostProcessor.class);

	private IQuartzService quartzService;
	public IQuartzService getQuartzService() {
		return quartzService;
	}
	public void setQuartzService(IQuartzService quartzService) {
		this.quartzService = quartzService;
	}
	

	*/
/* spring加载完就执行该方法：init-method="autoLoadTask" *//*

	public void autoLoadTask() {
		//获取到所有需要启动的quartz集合
		System.out.println("【系统启动】所有定时任务开启...");
		
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("enablestatus", InstmtQuartz.ENABLE_STATUS_YES);
		conditions.put("triggerstatus", "");
		List<InstmtQuartz> quartzList = quartzService.getInstmtQuartzList(conditions);
		if(null == quartzList)return;
		
		log.info("定时任务个数："+quartzList.size());
		for(int i=0;i<quartzList.size();i++){
			try {
				QuartzManager.addJob(quartzList.get(i).getJobname(), quartzList.get(i).getJobgroup(), 
						quartzList.get(i).getTriggername(), quartzList.get(i).getTriggergroup(), 
						Class.forName(quartzList.get(i).getClassname()), quartzList.get(i).getTriggercron());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}

}
*/
