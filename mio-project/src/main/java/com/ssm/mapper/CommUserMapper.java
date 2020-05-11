package com.ssm.mapper;

import com.ssm.pojo.CommUser;
import com.ssm.pojo.CommUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommUserMapper {
    int countByExample(CommUserExample example);

    int deleteByExample(CommUserExample example);

    int insert(CommUser record);

    int insertSelective(CommUser record);

    List<CommUser> selectByExample(CommUserExample example);

    int updateByExampleSelective(@Param("record") CommUser record, @Param("example") CommUserExample example);

    int updateByExample(@Param("record") CommUser record, @Param("example") CommUserExample example);
}