package com.ssm.mapper;

import com.ssm.pojo.CommonUserClientrole;
import com.ssm.pojo.CommonUserClientroleExample;
import com.ssm.pojo.CommonUserClientroleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonUserClientroleMapper {
    int countByExample(CommonUserClientroleExample example);

    int deleteByExample(CommonUserClientroleExample example);

    int deleteByPrimaryKey(CommonUserClientroleKey key);

    int insert(CommonUserClientrole record);

    int insertSelective(CommonUserClientrole record);

    List<CommonUserClientrole> selectByExample(CommonUserClientroleExample example);

    CommonUserClientrole selectByPrimaryKey(CommonUserClientroleKey key);

    int updateByExampleSelective(@Param("record") CommonUserClientrole record, @Param("example") CommonUserClientroleExample example);

    int updateByExample(@Param("record") CommonUserClientrole record, @Param("example") CommonUserClientroleExample example);

    int updateByPrimaryKeySelective(CommonUserClientrole record);

    int updateByPrimaryKey(CommonUserClientrole record);
}