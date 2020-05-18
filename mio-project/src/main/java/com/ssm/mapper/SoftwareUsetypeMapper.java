package com.ssm.mapper;

import com.mio.pojo.SoftwareUsetype;
import com.mio.pojo.SoftwareUsetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SoftwareUsetypeMapper {
    int countByExample(SoftwareUsetypeExample example);

    int deleteByExample(SoftwareUsetypeExample example);

    int deleteByPrimaryKey(String code);

    int insert(SoftwareUsetype record);

    int insertSelective(SoftwareUsetype record);

    List<SoftwareUsetype> selectByExample(SoftwareUsetypeExample example);

    SoftwareUsetype selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") SoftwareUsetype record, @Param("example") SoftwareUsetypeExample example);

    int updateByExample(@Param("record") SoftwareUsetype record, @Param("example") SoftwareUsetypeExample example);

    int updateByPrimaryKeySelective(SoftwareUsetype record);

    int updateByPrimaryKey(SoftwareUsetype record);
}