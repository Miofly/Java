package com.ssm.controller;

import com.mio.pojo.MioTreeList;
import com.mio.pojo.vo.*;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import com.ssm.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/common")
public class CommonController {

    @Autowired
    private CommonService commonService;

    /*传入sql字符串*/
    @RequestMapping("/sqlStr")
    @ResponseBody
    public List<Map<String, Object>> test1(String sql) throws Exception {
        return commonService.superManagerSelect(sql);
    }

    /*mysql树形列表 逆向工程单表查询*/
    @RequestMapping("/treeList")
    @ResponseBody
    public List<EUTreeNode> getTreeList(@RequestParam(value = "id", defaultValue = "0") Long parentId) throws Exception {
        List<EUTreeNode> list = commonService.getTreeList(parentId);
        return list;
    }

    /*表格 逆向工程单表查询*/
    @RequestMapping("/tableList")
    @ResponseBody
    public EUDataGridResult getTreeList(Integer pageIndex, Integer pageSize) throws Exception {
        EUDataGridResult result = commonService.queryTableList(pageIndex, pageSize);
        return result;
    }


    /*表格 逆向工程单表查询*/
    @RequestMapping("/tableLists")
    @ResponseBody
    public EUDataGridResult getTreeLists(MioTreeListQueryVo mioTreeListQueryVo, Integer pageIndex, Integer pageSize) throws Exception {
        EUDataGridResult result = commonService.queryTableLists(mioTreeListQueryVo, pageIndex, pageSize);
        return result;
    }

    @RequestMapping("/miotest")
    @ResponseBody
    public List<MioTreeList> getTreeListtest(Long parentId) throws Exception {
        List<MioTreeList> result = commonService.getTreeListtest(parentId);
        return result;
    }

    @RequestMapping("/info")
    @ResponseBody
    public List<InfoCustom> selectInfo(InfoQueryVo infoQueryVo) throws Exception {
        List<InfoCustom> result = commonService.selectInfo(infoQueryVo);
        return result;
    }

    @RequestMapping("/infos")
    @ResponseBody
    public List<InfosCustom> selectInfo(InfosQueryVo infosQueryVo) throws Exception {
        List<InfosCustom> result = commonService.selectInfos(infosQueryVo);
        return result;
    }

    @RequestMapping("/infoss")
    @ResponseBody
    public List<InfosCustom> selectInfos(String departName) throws Exception {
        List<InfosCustom> result = commonService.selectInfoss(departName);
        return result;
    }

    /*表格 逆向工程单表查询*/
    @RequestMapping("/infosss")
    @ResponseBody
    public EUDataGridResult selectInfoss(String departNames, Integer pageIndex, Integer pageSize) throws Exception {
        EUDataGridResult result = commonService.selectInfosss(departNames, pageIndex, pageSize);
        return result;
    }

}
