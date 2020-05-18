package com.ssm.mapper;

import java.util.List;

import com.mio.pojo.CommScheduleDetail;
import com.mio.pojo.CommScheduleDetailExample;
import com.ssm.pojo.vo.CommScheduleDetailVo;
import org.apache.ibatis.annotations.Param;

public interface CommScheduleDetailMapper {
    int countByExample(CommScheduleDetailExample example);

    int deleteByExample(CommScheduleDetailExample example);

    int insert(CommScheduleDetail record);

    int insertSelective(CommScheduleDetail record);

    List<CommScheduleDetail> selectByExample(CommScheduleDetailExample example);

    int updateByExampleSelective(@Param("record") CommScheduleDetail record, @Param("example") CommScheduleDetailExample example);

    int updateByExample(@Param("record") CommScheduleDetail record, @Param("example") CommScheduleDetailExample example);
}