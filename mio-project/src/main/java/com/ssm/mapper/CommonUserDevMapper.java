package com.ssm.mapper;

import com.ssm.pojo.CommonUserDev;
import com.ssm.pojo.CommonUserDevExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonUserDevMapper {
    int countByExample(CommonUserDevExample example);

    int deleteByExample(CommonUserDevExample example);

    int insert(CommonUserDev record);

    int insertSelective(CommonUserDev record);

    List<CommonUserDev> selectByExample(CommonUserDevExample example);

    int updateByExampleSelective(@Param("record") CommonUserDev record, @Param("example") CommonUserDevExample example);

    int updateByExample(@Param("record") CommonUserDev record, @Param("example") CommonUserDevExample example);

}