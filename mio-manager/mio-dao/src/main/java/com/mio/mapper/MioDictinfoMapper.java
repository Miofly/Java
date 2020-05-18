package com.mio.mapper;

import com.mio.pojo.MioDictinfo;
import com.mio.pojo.MioDictinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MioDictinfoMapper {
    int countByExample(MioDictinfoExample example);

    int deleteByExample(MioDictinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(MioDictinfo record);

    int insertSelective(MioDictinfo record);

    List<MioDictinfo> selectByExample(MioDictinfoExample example);

    MioDictinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MioDictinfo record, @Param("example") MioDictinfoExample example);

    int updateByExample(@Param("record") MioDictinfo record, @Param("example") MioDictinfoExample example);

    int updateByPrimaryKeySelective(MioDictinfo record);

    int updateByPrimaryKey(MioDictinfo record);
}