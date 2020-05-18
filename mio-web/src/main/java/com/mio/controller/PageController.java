package com.mio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}

	@RequestMapping("/common/{page}")
	public String common(@PathVariable String page) {
		return "/common/"+page+"";
	}

	@RequestMapping("/common/user/{page}")
	public String commonUser(@PathVariable String page) {
		return "/common/user/"+page+"";
	}

	@RequestMapping("/st/{page}")
	public String st(@PathVariable String page) {
		return "/st/"+page+"";
	}

	@RequestMapping("/detail/{page}")
	public String detail(@PathVariable String page) {
		return "/detail/"+page+"";
	}

	@RequestMapping("/test/{page}")
	public String test(@PathVariable String page) {
		return "/test/"+page+"";
	}
//	@RequestMapping("/{page}")
//	public String showPage1(@PathVariable String page) {
//		return page;
//	}
/*	@RequestMapping("/publicTable")
	public String showIndex1() {
		return "/public/tablelists";
	}

	@RequestMapping("/myinfos")
	public String showIndex2() {
		return "/public/infotable";
	}*/
}
