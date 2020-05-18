package com.ssm.mapper;

import com.ssm.pojo.CommonClientroleMenu;
import com.ssm.pojo.CommonClientroleMenuExample;
import com.ssm.pojo.CommonClientroleMenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonClientroleMenuMapper {
    int countByExample(CommonClientroleMenuExample example);

    int deleteByExample(CommonClientroleMenuExample example);

    int deleteByPrimaryKey(CommonClientroleMenuKey key);

    int insert(CommonClientroleMenu record);

    int insertSelective(CommonClientroleMenu record);

    List<CommonClientroleMenu> selectByExample(CommonClientroleMenuExample example);

    CommonClientroleMenu selectByPrimaryKey(CommonClientroleMenuKey key);

    int updateByExampleSelective(@Param("record") CommonClientroleMenu record, @Param("example") CommonClientroleMenuExample example);

    int updateByExample(@Param("record") CommonClientroleMenu record, @Param("example") CommonClientroleMenuExample example);

    int updateByPrimaryKeySelective(CommonClientroleMenu record);

    int updateByPrimaryKey(CommonClientroleMenu record);
}