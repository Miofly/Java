package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mio.pojo.*;

import com.mio.pojo.vo.MioTreeListCustom;
import com.mio.util.DateUtil;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;
import com.ssm.mapper.*;
import com.ssm.pojo.*;
import com.ssm.pojo.vo.CommScheduleDetailVo;
import com.ssm.pojo.vo.CommScheduleManageVo;
import com.ssm.pojo.vo.IviewTree;
import com.ssm.pojo.vo.TreeSelect;
import com.ssm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private CommScheduleDetailMapper commScheduleDetailMapper;

    @Autowired
    private CommScheduleDetailMapperCustom commScheduleDetailMapperCustom;

    @Autowired
    private CommScheduleManageMapper commScheduleManageMapper;

    @Autowired
    private DictSchtypeMapper dictSchtypeMapper;

    @Autowired
    private CommOrganizationMapper commOrganizationMapper;

    @Autowired
    private CommUserMapper commUserMapper;

    @Autowired
    private CommUserOrgMapper commUserOrgMapper;

    @Autowired
    private DictSchholidayMapper dictSchholidayMapper;

    @Autowired
    private MnPerCrmerrocountCurrvalMapper mnPerCrmerrocountCurrvalMapper;

    /*获取当月所有事件*/
    public List<CommScheduleDetailVo> selectSchedules(String createdUserid, String timeStr, String schTypename) throws Exception {
        return commScheduleDetailMapperCustom.selectSchedule(createdUserid, timeStr, schTypename);
    }

    /*根据主事件ID获取事件详细步骤*/
    public List<CommScheduleDetail> selectAll(BigDecimal id) throws Exception {
        CommScheduleDetailExample example = new CommScheduleDetailExample();
        CommScheduleDetailExample.Criteria criteria = example.createCriteria();
        criteria.andSchIdEqualTo(id);
        return commScheduleDetailMapper.selectByExample(example);
    }

    /*根据ID查询主事件*/
    public List<CommScheduleManageVo> selectEvent(BigDecimal schId) throws Exception {
        return commScheduleDetailMapperCustom.selectEvent(schId);
    }

    /*获取所有事件类型*/
    public List<DictSchtype> selectAllType() throws Exception {
        DictSchtypeExample example = new DictSchtypeExample();
        return dictSchtypeMapper.selectByExample(example);
    }

    /*新增事件获取Id*/
    public int selectEventId() throws Exception {
        return commScheduleDetailMapperCustom.selectEventId();
    }

    /*新增主事件信息*/
    public void insertEvent(CommScheduleManage commScheduleManage) throws Exception {
        commScheduleManageMapper.insertSelective(commScheduleManage);
    }

    /*根据主事件添加详细步骤*/
    public void insertSubEvent(CommScheduleDetail commScheduleDetail) throws Exception {
        commScheduleDetail.setCreatedUserid("root");
        commScheduleDetail.setDetailState("1");
        commScheduleDetailMapper.insertSelective(commScheduleDetail);
    }

    /*修改主事件信息*/
    public void updateEvent(CommScheduleManage commScheduleManage) throws Exception {
        CommScheduleManageExample example = new CommScheduleManageExample();
        CommScheduleManageExample.Criteria criteria = example.createCriteria();
        criteria.andSchIdEqualTo(commScheduleManage.getSchId());
        commScheduleManageMapper.updateByExampleSelective(commScheduleManage, example);
    }

    /*修改主事件添加详细步骤*/
    public void updateSubEvent(CommScheduleDetail commScheduleDetail) throws Exception {

        CommScheduleDetailExample example = new CommScheduleDetailExample();
        CommScheduleDetailExample.Criteria criteria = example.createCriteria();
        criteria.andSchIdEqualTo(commScheduleDetail.getSchId());
        criteria.andDetailIdEqualTo(commScheduleDetail.getDetailId());

        commScheduleDetail.setCreatedUserid("root");
        commScheduleDetail.setDetailState("1");
        commScheduleDetailMapper.updateByExampleSelective(commScheduleDetail, example);
    }


    /*删除主事件*/
    public void delEvent(BigDecimal schId) throws Exception {
        commScheduleManageMapper.deleteByPrimaryKey(schId);
    }

    /*删除主事件添加详细步骤*/
    public void delSubEvent(CommScheduleDetail commScheduleDetail) throws Exception {

        CommScheduleDetailExample example = new CommScheduleDetailExample();
        CommScheduleDetailExample.Criteria criteria = example.createCriteria();

        criteria.andDetailIdEqualTo(commScheduleDetail.getDetailId());
        criteria.andSchIdEqualTo(commScheduleDetail.getSchId());

        commScheduleDetailMapper.deleteByExample(example);
    }

    /*树形表格*/
    public List<IviewTree> getTreeList(String parentId) throws Exception {

        CommOrganizationExample example = new CommOrganizationExample();
        CommOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andParentidEqualTo(parentId);
        List<CommOrganization> list = commOrganizationMapper.selectByExample(example);
        List<IviewTree> resultList = new ArrayList<>();

        for (CommOrganization commOrganization : list) {
            //创建一个节点
            IviewTree node = new IviewTree();
            node.setId(commOrganization.getId());
//            node.setChecked(idss.indexOf(commOrganization.getId())!=-1);
            node.setChecked(false);
            node.setTitle(commOrganization.getName());
            node.setLoading(commOrganization.getStandby1().equals("1") ? false : true);
            node.setChildren(new String[0]);
            resultList.add(node);
        }
        return resultList;
    }

    public List<TreeSelect> getTreeSelList(String parentId) throws Exception {

        CommOrganizationExample example = new CommOrganizationExample();
        CommOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andParentidEqualTo(parentId);
        List<CommOrganization> list = commOrganizationMapper.selectByExample(example);
        List<TreeSelect> resultList = new ArrayList<>();


        for (CommOrganization commOrganization : list) {
            //创建一个节点
            TreeSelect node = new TreeSelect();
            node.setId(commOrganization.getId());

            node.setLabel(commOrganization.getName());
            node.setChildren(null);
            resultList.add(node);
        }
        return resultList;
    }

    /*根据组Id获取组成员*/
    public List<Map<String, String>> selGroupById(String id) throws Exception {
        return commScheduleDetailMapperCustom.selGroupById(id);
    }

    /*根据id获取人员信息 like*/
    public List<Map<String, String>> selectNameById(String id) throws Exception {
        return commScheduleDetailMapperCustom.selectNameById(id);
    }

    /*根据id获取人员信息 list*/
    public List<CommUser> selectNameByIds(List<String> ids) throws Exception {
        CommUserExample example = new CommUserExample();
        CommUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        List<CommUser> list = commUserMapper.selectByExample(example);
        return list;
    }

    /*根据人员ID获取所属组*/
    public List<CommUserOrg> selectOrgById(String id) throws Exception {
        CommUserOrgExample example = new CommUserOrgExample();
        CommUserOrgExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(id);
        List<CommUserOrg> list = commUserOrgMapper.selectByExample(example);
        return list;
    }

    /*根据组id获取组名称*/
    public List<CommOrganization> selectOrgNameByIds(List<String> ids) throws Exception {
        CommOrganizationExample example = new CommOrganizationExample();
        CommOrganizationExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        List<CommOrganization> list = commOrganizationMapper.selectByExample(example);
        return list;
    }

    /*加载整棵树*/
    public List<CommOrganization> selectTreeAll() throws Exception {
        return commScheduleDetailMapperCustom.selectTreeAll();
    }

    /*节假日*/
    public List<DictSchholiday> selectDays(String monDay) throws Exception {
        DictSchholidayExample example = new DictSchholidayExample();
        DictSchholidayExample.Criteria criteria = example.createCriteria();
        criteria.andHolidayDateLike('%' + monDay + '%');
        return dictSchholidayMapper.selectByExample(example);
    }

    /*测试分页表格数据*/
    public EUDataGridResult queryTestTable(int pageIndex, int pageSize) throws Exception {

        /*起始页，显示条数*/
        PageHelper.startPage(pageIndex, pageSize);
        MnPerCrmerrocountCurrvalExample example = new MnPerCrmerrocountCurrvalExample();
        List<MnPerCrmerrocountCurrval> list = mnPerCrmerrocountCurrvalMapper.selectByExample(example);

        EUDataGridResult result = new EUDataGridResult();
        result.setData(list);
        /*分页处理*/
        PageInfo<MnPerCrmerrocountCurrval> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

}
