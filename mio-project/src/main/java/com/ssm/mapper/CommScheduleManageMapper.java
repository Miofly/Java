package com.ssm.mapper;

import com.ssm.pojo.CommScheduleManage;
import com.ssm.pojo.CommScheduleManageExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface CommScheduleManageMapper {
    int countByExample(CommScheduleManageExample example);

    int deleteByExample(CommScheduleManageExample example);

    int deleteByPrimaryKey(BigDecimal schId);

    int insert(CommScheduleManage record);

    int insertSelective(CommScheduleManage record);

    List<CommScheduleManage> selectByExample(CommScheduleManageExample example);

    CommScheduleManage selectByPrimaryKey(BigDecimal schId);

    int updateByExampleSelective(@Param("record") CommScheduleManage record, @Param("example") CommScheduleManageExample example);

    int updateByExample(@Param("record") CommScheduleManage record, @Param("example") CommScheduleManageExample example);

    int updateByPrimaryKeySelective(CommScheduleManage record);

    int updateByPrimaryKey(CommScheduleManage record);
}