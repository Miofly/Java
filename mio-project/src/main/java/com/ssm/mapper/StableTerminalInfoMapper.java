package com.ssm.mapper;

import com.mio.pojo.StableTerminalInfo;
import com.mio.pojo.StableTerminalInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StableTerminalInfoMapper {
    int countByExample(StableTerminalInfoExample example);

    int deleteByExample(StableTerminalInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StableTerminalInfo record);

    int insertSelective(StableTerminalInfo record);

    List<StableTerminalInfo> selectByExample(StableTerminalInfoExample example);

    StableTerminalInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StableTerminalInfo record, @Param("example") StableTerminalInfoExample example);

    int updateByExample(@Param("record") StableTerminalInfo record, @Param("example") StableTerminalInfoExample example);

    int updateByPrimaryKeySelective(StableTerminalInfo record);

    int updateByPrimaryKey(StableTerminalInfo record);
}