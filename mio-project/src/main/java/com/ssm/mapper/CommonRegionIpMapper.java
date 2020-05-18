package com.ssm.mapper;

import java.util.List;

import com.mio.pojo.CommonRegionIp;
import com.mio.pojo.CommonRegionIpExample;
import org.apache.ibatis.annotations.Param;

public interface CommonRegionIpMapper {
    int countByExample(CommonRegionIpExample example);

    int deleteByExample(CommonRegionIpExample example);

    int insert(CommonRegionIp record);

    int insertSelective(CommonRegionIp record);

    List<CommonRegionIp> selectByExample(CommonRegionIpExample example);

    int updateByExampleSelective(@Param("record") CommonRegionIp record, @Param("example") CommonRegionIpExample example);

    int updateByExample(@Param("record") CommonRegionIp record, @Param("example") CommonRegionIpExample example);
}