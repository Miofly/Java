/*
package com.mio.search.controller;

import com.mio.global.Config;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.search.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

*/
/**
 * 索引库维护
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月11日下午2:50:45
 * @version 1.0
 *//*

@Controller
@RequestMapping("/manager")
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;

	*/
/**
	 * 导入商品数据到索引库
	 *//*

	@RequestMapping("/importall")
	public @ResponseBody
	SubmitResultInfo importAllItems()  throws Exception {
		 itemsService.importAllItems();
		 return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
}
*/
