package com.mio.mapper;

import com.mio.pojo.CommonUser;
import com.mio.pojo.CommonUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonUserMapper {
    int countByExample(CommonUserExample example);

    int deleteByExample(CommonUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommonUser record);

    int insertSelective(CommonUser record);

    List<CommonUser> selectByExample(CommonUserExample example);

    CommonUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommonUser record, @Param("example") CommonUserExample example);

    int updateByExample(@Param("record") CommonUser record, @Param("example") CommonUserExample example);

    int updateByPrimaryKeySelective(CommonUser record);

    int updateByPrimaryKey(CommonUser record);
}