package com.ssm.service;

import com.mio.pojo.CommScheduleDetail;
import com.mio.pojo.CommScheduleDetailExample;
import com.mio.pojo.MnPerCrmerrocountCurrval;
import com.mio.pojo.vo.MioTreeListQueryVo;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import com.ssm.pojo.*;
import com.ssm.pojo.vo.CommScheduleDetailVo;
import com.ssm.pojo.vo.CommScheduleManageVo;
import com.ssm.pojo.vo.IviewTree;
import com.ssm.pojo.vo.TreeSelect;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ScheduleService {
    /*获取当月所有事件*/
    public List<CommScheduleDetailVo> selectSchedules(String createdUserid,String timeStr, String schTypename) throws  Exception;
    /*根据主事件ID获取事件详细步骤*/
    public List<CommScheduleDetail> selectAll(BigDecimal id) throws Exception;
    /*根据ID获取主事件详情*/
    public List<CommScheduleManageVo> selectEvent(BigDecimal schId) throws Exception;
    /*获取所有事件类型*/
    public List<DictSchtype> selectAllType() throws Exception;
    /*新增事件获取Id*/
    public int selectEventId() throws Exception;
    /*新增主事件信息*/
    public void insertEvent(CommScheduleManage commScheduleManage) throws Exception;
    /*根据主事件添加详细步骤*/
    public void insertSubEvent(CommScheduleDetail commScheduleDetail) throws Exception;
    /*修改主事件信息*/
    public void updateEvent(CommScheduleManage commScheduleManage) throws Exception;
    /*修改主事件详细步骤*/
    public void updateSubEvent(CommScheduleDetail commScheduleDetail) throws Exception;
    /*删除主事件*/
    public void delEvent(BigDecimal schId) throws Exception;
    /*删除步骤时间*/
    public void delSubEvent(CommScheduleDetail commScheduleDetail) throws Exception;
    /*树形表格*/
    List<IviewTree> getTreeList(String parentId) throws Exception;
    /*树形表格*/
    List<TreeSelect> getTreeSelList(String parentId) throws Exception;
    /*根据组Id获取组成员*/
    public List<Map<String, String>> selGroupById(String id) throws Exception;
    /*根据id获取人员信息 like*/
    public List<Map<String, String>> selectNameById(String id) throws Exception;
    /*根据id获取人员信息 list*/
    public List<CommUser> selectNameByIds(List<String> ids) throws Exception;
    /*根据组人员ID获取所属组*/
    public List<CommUserOrg> selectOrgById(String id) throws Exception;
    /*根据组id获取组名称*/
    public List<CommOrganization> selectOrgNameByIds(List<String> ids) throws Exception;
    /*加载整棵树*/
    public List<CommOrganization> selectTreeAll() throws Exception;
    /*节假日*/
    public List<DictSchholiday> selectDays(String monDay) throws Exception;
    /*测试分页表格数据*/
    public EUDataGridResult queryTestTable(int pageIndex, int pageSize) throws Exception;

}
