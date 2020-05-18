package com.ssm.mapper;

import com.mio.pojo.MioDicttype;
import com.mio.pojo.MioDicttypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MioDicttypeMapper {
    int countByExample(MioDicttypeExample example);

    int deleteByExample(MioDicttypeExample example);

    int deleteByPrimaryKey(String typecode);

    int insert(MioDicttype record);

    int insertSelective(MioDicttype record);

    List<MioDicttype> selectByExample(MioDicttypeExample example);

    MioDicttype selectByPrimaryKey(String typecode);

    int updateByExampleSelective(@Param("record") MioDicttype record, @Param("example") MioDicttypeExample example);

    int updateByExample(@Param("record") MioDicttype record, @Param("example") MioDicttypeExample example);

    int updateByPrimaryKeySelective(MioDicttype record);

    int updateByPrimaryKey(MioDicttype record);
}