package com.mio.controller;


import com.mio.global.Config;
import com.mio.pojo.MioDictinfo;
import com.mio.pojo.MioLeftList;
import com.mio.pojo.vo.MioLeftListCustom;
import com.mio.pojo.vo.MioLeftListQueryVo;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.service.SystemConfigService;
import com.mio.service.UserService;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
    private SystemConfigService systemConfigService;

	/*树形节点表格分页及查询条件*/
	@RequestMapping("/tableList")
	@ResponseBody
	public EUDataGridResult getTreeList(MioLeftListQueryVo mioLeftListQueryVo, Integer pageIndex, Integer pageSize) throws Exception{
		EUDataGridResult result = userService.findTableList(mioLeftListQueryVo,pageIndex,pageSize);
		return result;
	}

	/*单个删除*/
	@RequestMapping("/delRow")
	public @ResponseBody
    SubmitResultInfo delRow(Long id) throws Exception{
		userService.delRow(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	/*批量单个删除*/
	@RequestMapping("/delRows")
	public @ResponseBody
    SubmitResultInfo delRows(String id) throws Exception{
		/*mapper里需要传入List<Long>类型*/
		List<Long> ids = new ArrayList<Long>();

		String[]  idStr = new String[]{};
		/*split() 方法根据匹配给定的正则表达式来拆分字符串。*/
		idStr = id.split(",");

		/*把Sting类型转换成Long类型*/
		/*
		for(String s:v){
			System.out.println(s);
		}
		s表示的其实就是v中得任意一个元素，v可以是数组，也可以是集合，
		如list或set。这种语句叫做foreach语句。其实就是Iterator迭代器的简化，
		意思就是循环的从v中拿出一个元素s进行操作
		 */
		for (String idd :idStr) {
			/*Long.valueOf(这里有参数)，是将参数转换成long的包装类——Long*/
			ids.add(Long.valueOf(idd));
		}

		userService.delRows(ids);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}

	/*查询某个用户信息*/
	@RequestMapping("/showTreebyId")
	public String showTreeId(Model model, MioLeftListQueryVo mioLeftListQueryVo) throws Exception{
		MioLeftListCustom mioLeftListCustom = userService.findTreeId(mioLeftListQueryVo);
		model.addAttribute("mioLeftListCustom",mioLeftListCustom);

		List<MioDictinfo> tests = systemConfigService.findDictinfoByType("001");
		model.addAttribute("tests", tests);
		return "/tableEdit";
	}

	/*修改用户提交*/
	@RequestMapping("/editTreeById")
	public @ResponseBody
    SubmitResultInfo editTreeById(MioLeftListQueryVo mioLeftListQueryVo) throws Exception{
		userService.updateTreeById(mioLeftListQueryVo.getMioLeftListCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	// 查询页面
	@RequestMapping("/tet")
	public String querygysypml(Model model) throws Exception {
		// 药品类别
		List<MioDictinfo> tests = systemConfigService.findDictinfoByType("001");
		model.addAttribute("tests", tests);

		return "/treetable";
	}

	@RequestMapping("/tets")
	@ResponseBody
	public List<MioDictinfo> querygysypml1(Model model) throws Exception {
		// 药品类别
		List<MioDictinfo> tests = systemConfigService.findDictinfoByType("001");
		return tests;
	}

	@RequestMapping("/uptrees")
	public @ResponseBody
	SubmitResultInfo edittrees(String data)throws Exception{
		JSONArray rows = new JSONArray();
		/*转换为json数组*/
		rows = JSONArray.fromObject(data);
		for(int i=0;i<rows.size();i++){
			Object o = rows.get(i);
			/*单个json对象转换 */
			JSONObject jsonObject2=JSONObject.fromObject(o);
			/*从JSONObject 对象转换为 JAVA 对象。*/
			MioLeftListCustom row = (MioLeftListCustom)JSONObject.toBean(jsonObject2,MioLeftListCustom.class);
			userService.updateTreesnew(row);
		}
		return  ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}



	@RequestMapping("/testaaa")
	public @ResponseBody
	SubmitResultInfo edits(String data)throws Exception{
		JSONArray rows = new JSONArray();
		/*转换为json数组*/
		rows = JSONArray.fromObject(data);
		for(int i=0;i<rows.size();i++){
			Object o = rows.get(i);
			/*单个json对象转换 */
			JSONObject jsonObject2=JSONObject.fromObject(o);
			/*从JSONObject 对象转换为 JAVA 对象。*/
			MioLeftList row = (MioLeftList)JSONObject.toBean(jsonObject2,MioLeftList.class);
			userService.updateTrees(row);
		}
		return  ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}


    @RequestMapping("/myadds")
    public @ResponseBody
    SubmitResultInfo adds(String data)throws Exception{
        JSONArray rows = new JSONArray();
        rows = JSONArray.fromObject(data);
        for(int i=0;i<rows.size();i++){
            Object o = rows.get(i);
            JSONObject jsonObject2=JSONObject.fromObject(o);
            MioLeftList row = (MioLeftList)JSONObject.toBean(jsonObject2,MioLeftList.class);
            System.out.println(row);
            userService.insertTree(row);
        }
        return  ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }









	/*树形控件*/
	@RequestMapping("/list")
	@ResponseBody
	public List<EUTreeNode> getContentCatList(@RequestParam(value="id", defaultValue="0")Long parentId) throws Exception{
		List<EUTreeNode> list = userService.getCategoryList(parentId);
		return list;
	}


	/*添加用户页面*/
	@RequestMapping("/addsysuser")
	public String addsysuser(Model model)throws Exception{
		int a = 0/10;
		return "old/addsysuser";
	}




}

