package com.mio.search.controller;

import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.search.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RegitsterController {
	
	@Autowired
	private RegisterService registerService;

	@RequestMapping("/page/register")
	public String showRegister() {
		return "register";
	}
	
	@RequestMapping("/user/check/{param}/{type}")
	public @ResponseBody
    SubmitResultInfo checkData(@PathVariable String param, @PathVariable Integer type) throws Exception{
	    registerService.checkData(param, type);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 200, null));
	}
	
	/*@RequestMapping(value="/user/register", method=RequestMethod.POST)
	@ResponseBody
	public E3Result register(TbUser user) {
		E3Result e3Result = registerService.register(user);
		return e3Result;
	}*/
}
