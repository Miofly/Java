package com.ssm.controller;

import com.mio.global.Config;
import com.mio.pojo.CommScheduleDetail;
import com.mio.result.ResultUtil;
import com.mio.result.SubmitResultInfo;
import com.mio.util.EUDataGridResult;
import com.ssm.pojo.*;
import com.ssm.pojo.vo.CommScheduleDetailVo;
import com.ssm.pojo.vo.CommScheduleManageVo;
import com.ssm.pojo.vo.IviewTree;
import com.ssm.pojo.vo.TreeSelect;
import com.ssm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sche")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    /*获取当月所有事件*/
    @RequestMapping("/sche")
    @ResponseBody
    public List<CommScheduleDetailVo> selectSchedules(String createdUserid, String timeStr, String schTypename) throws Exception {
        List<CommScheduleDetailVo> result = scheduleService.selectSchedules(createdUserid, timeStr, schTypename);
        return result;
    }

    /*根据主事件ID获取事件详细步骤*/
    @RequestMapping("/mge")
    @ResponseBody
    public List<CommScheduleDetail> selectAll(BigDecimal id) throws Exception {
        List<CommScheduleDetail> result = scheduleService.selectAll(id);
        return result;
    }

    /*根据ID查询主事件*/
    @RequestMapping("/event")
    @ResponseBody
    public List<CommScheduleManageVo> selectEvent(BigDecimal schId) throws Exception {
        List<CommScheduleManageVo> result = scheduleService.selectEvent(schId);
        return result;
    }

    /*获取所有事件类型*/
    @RequestMapping("/type")
    @ResponseBody
    public List<DictSchtype> selectAllType() throws Exception {
        List<DictSchtype> result = scheduleService.selectAllType();
        return result;
    }

    /*获取新增id*/
    /*获取所有事件类型*/
    @RequestMapping("/eid")
    @ResponseBody
    public int selectEventId() throws Exception {
        return scheduleService.selectEventId();
    }

    public CommScheduleManage test(@RequestBody CommScheduleManage commScheduleManage) {
        return commScheduleManage;
    }

    /*新增主事件信息*/
    @RequestMapping("/insertEvt")
    @ResponseBody
    public SubmitResultInfo insertEvent(@RequestBody CommScheduleManage commScheduleManage) throws Exception {
       /* JSONArray rows = new JSONArray();
        rows = JSONArray.fromObject(data);
        for(int i=0;i<rows.size();i++){
            Object o = rows.get(i);
            JSONObject jsonObject2=JSONObject.fromObject(o);
            MioLeftList row = (MioLeftList)JSONObject.toBean(jsonObject2,MioLeftList.class);
            System.out.println(row);
            userService.insertTree(row);
        }*/
        scheduleService.insertEvent(commScheduleManage);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*根据主事件添加详细步骤*/
    @RequestMapping("/insertSubEvt")
    @ResponseBody
    public SubmitResultInfo insertSubEvt(@RequestBody CommScheduleDetail[] commScheduleDetail) throws Exception {
//        for(int i=0;i<commScheduleDetail.size())
//        System.out.println(commScheduleDetail);

        for (CommScheduleDetail scheduleDetail : commScheduleDetail) {
            scheduleDetail.setResField1("no");
            scheduleService.insertSubEvent(scheduleDetail);
        }
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*更新主事件*/
    @RequestMapping("/upEvent")
    @ResponseBody
    public SubmitResultInfo updateEvent(@RequestBody CommScheduleManage commScheduleManage) throws Exception {
        scheduleService.updateEvent(commScheduleManage);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*更新详细事件*/
    @RequestMapping("/upSubEvent")
    @ResponseBody
    public SubmitResultInfo updateSubEvent(@RequestBody CommScheduleDetail[] commScheduleDetail) throws Exception {

        for (CommScheduleDetail scheduleDetail : commScheduleDetail) {
            scheduleService.updateSubEvent(scheduleDetail);
        }
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }


    /*删除主事件*/
    @RequestMapping("/delEvent")
    @ResponseBody
    public SubmitResultInfo delEvent(BigDecimal schId) throws Exception {
        scheduleService.delEvent(schId);
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*删除详细事件*/
    @RequestMapping("/delSubEvent")
    @ResponseBody
    public SubmitResultInfo delSubEvent(@RequestBody CommScheduleDetail[] commScheduleDetail) throws Exception {

        for (CommScheduleDetail scheduleDetail : commScheduleDetail) {
            scheduleService.delSubEvent(scheduleDetail);
        }
        return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
    }

    /*mysql树形列表 逆向工程单表查询*/
    @RequestMapping("/treeList")
    @ResponseBody
    public List<IviewTree> getTreeList(@RequestParam(value = "id", defaultValue = "0") String parentId) throws Exception {
//        List<String> idss = Arrays.asList(ids.split(","));
        List<IviewTree> list = scheduleService.getTreeList(parentId);
        return list;
    }

    /*mysql树形列表 逆向工程单表查询*/
    @RequestMapping("/treeSelList")
    @ResponseBody
    public List<TreeSelect> getTreeSelList(@RequestParam(value = "id", defaultValue = "0") String parentId) throws Exception {
        List<TreeSelect> list = scheduleService.getTreeSelList(parentId);
        return list;
    }

    /*根据组ID查询组成员*/
    @RequestMapping("/groupId")
    @ResponseBody
    public List<Map<String, String>> selGroupById(String id) throws Exception {
        List<Map<String, String>> list = scheduleService.selGroupById(id);
        return list;
    }

    /*根据传入的人员id列表查询人员名册*/
    @RequestMapping("/name")
    @ResponseBody
    public List<CommUser> selectNameByIds(String ids) throws Exception {
        List<String> idss = Arrays.asList(ids.split(","));
        List<CommUser> list = scheduleService.selectNameByIds(idss);
        return list;
    }

    /*查询单个人员名称*/
    @RequestMapping("/id")
    @ResponseBody
    public List<Map<String, String>> selectNameById(String id) throws Exception {
        return scheduleService.selectNameById(id);
    }

    /*根据人员ID获取所属组*/
    @RequestMapping("/groupName")
    @ResponseBody
    public List<CommUserOrg> selectOrgById(String id) throws Exception {
        List<CommUserOrg> list = scheduleService.selectOrgById(id);
        return list;
    }

    /*根据组id获取组名称*/
    @RequestMapping("/orgName")
    @ResponseBody
    public List<CommOrganization> selectOrgNameByIds(String ids) throws Exception {
        List<String> idss = Arrays.asList(ids.split(","));
        List<CommOrganization> list = scheduleService.selectOrgNameByIds(idss);
        return list;
    }

    /*树形*/
    @RequestMapping("/treeAll")
    @ResponseBody
    public List<CommOrganization> selectTreeAll() throws Exception {
        return scheduleService.selectTreeAll();
    }

    /*节假日*/
    @RequestMapping("/hday")
    @ResponseBody
    public List<DictSchholiday> selectDays(String monDay) throws Exception {
        return scheduleService.selectDays(monDay);
    }

    /*测试表格分页数据*/
    @RequestMapping("/testData")
    @ResponseBody
    public EUDataGridResult queryTestTable(int pageIndex, int pageSize) throws Exception {
        EUDataGridResult result = scheduleService.queryTestTable(pageIndex, pageSize);
        return result;
    }
}
