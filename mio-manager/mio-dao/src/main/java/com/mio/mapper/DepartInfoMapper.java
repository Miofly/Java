package com.mio.mapper;

import com.mio.pojo.DepartInfo;
import com.mio.pojo.DepartInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartInfoMapper {
    int countByExample(DepartInfoExample example);

    int deleteByExample(DepartInfoExample example);

    int deleteByPrimaryKey(String departId);

    int insert(DepartInfo record);

    int insertSelective(DepartInfo record);

    List<DepartInfo> selectByExample(DepartInfoExample example);

    DepartInfo selectByPrimaryKey(String departId);

    int updateByExampleSelective(@Param("record") DepartInfo record, @Param("example") DepartInfoExample example);

    int updateByExample(@Param("record") DepartInfo record, @Param("example") DepartInfoExample example);

    int updateByPrimaryKeySelective(DepartInfo record);

    int updateByPrimaryKey(DepartInfo record);
}