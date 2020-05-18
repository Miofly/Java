package com.ssm.mapper;

import com.mio.pojo.LanInfo;
import com.mio.pojo.LanInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LanInfoMapper {
    int countByExample(LanInfoExample example);

    int deleteByExample(LanInfoExample example);

    int insert(LanInfo record);

    int insertSelective(LanInfo record);

    List<LanInfo> selectByExample(LanInfoExample example);

    int updateByExampleSelective(@Param("record") LanInfo record, @Param("example") LanInfoExample example);

    int updateByExample(@Param("record") LanInfo record, @Param("example") LanInfoExample example);
}