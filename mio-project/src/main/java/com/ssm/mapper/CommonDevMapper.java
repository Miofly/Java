package com.ssm.mapper;

import com.ssm.pojo.CommonDev;
import com.ssm.pojo.CommonDevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonDevMapper {
    int countByExample(CommonDevExample example);

    int deleteByExample(CommonDevExample example);

    int insert(CommonDev record);

    int insertSelective(CommonDev record);

    List<CommonDev> selectByExample(CommonDevExample example);

    int updateByExampleSelective(@Param("record") CommonDev record, @Param("example") CommonDevExample example);

    int updateByExample(@Param("record") CommonDev record, @Param("example") CommonDevExample example);
}