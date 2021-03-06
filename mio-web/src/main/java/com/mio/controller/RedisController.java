package com.mio.controller;

import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 缓存同步Controller
 * <p>Title: RedisController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月9日下午3:47:18
 * @version 1.0
 */
@Controller
@RequestMapping("/cache/sync")
public class RedisController {

	@Autowired
	private RedisService redisService;
	
	@RequestMapping("/content/{contentCid}")
	@ResponseBody
	public SubmitResultInfo contentCacheSync(@PathVariable Long contentCid)  throws Exception{
		redisService.syncContent(contentCid);
		return  ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
}
