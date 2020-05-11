package com.ssm.mapper;

import com.mio.pojo.CommScheduleDetail;
import com.mio.pojo.CommScheduleDetailExample;
import com.ssm.pojo.CommOrganization;
import com.ssm.pojo.vo.CommScheduleDetailVo;
import com.ssm.pojo.vo.CommScheduleManageVo;
import org.apache.ibatis.annotations.Param;
import org.apache.solr.common.util.Hash;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CommScheduleDetailMapperCustom {
    /*查询当月所有事件*/
    List<CommScheduleDetailVo> selectSchedule(@Param(value = "createdUserid") String createdUserid,@Param(value = "timeStr") String timeStr,@Param(value = "schTypename") String schTypename);
    /*根据id查询事件，详细信息*/
    List<CommScheduleManageVo> selectEvent(BigDecimal schId);
    /*获取新增id*/
    int selectEventId();
    /*根据父节点获取子节点信息*/
    List<Map<String, String>> selGroupById(@Param(value="id") String id);
    /*搜索人员*/
    List<Map<String, String>> selectNameById(@Param(value="id") String id);
    /*加载整棵树*/
    List<CommOrganization>  selectTreeAll();
}