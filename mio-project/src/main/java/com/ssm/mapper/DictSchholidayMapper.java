package com.ssm.mapper;

import com.ssm.pojo.DictSchholiday;
import com.ssm.pojo.DictSchholidayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictSchholidayMapper {
    int countByExample(DictSchholidayExample example);

    int deleteByExample(DictSchholidayExample example);

    int insert(DictSchholiday record);

    int insertSelective(DictSchholiday record);

    List<DictSchholiday> selectByExample(DictSchholidayExample example);

    int updateByExampleSelective(@Param("record") DictSchholiday record, @Param("example") DictSchholidayExample example);

    int updateByExample(@Param("record") DictSchholiday record, @Param("example") DictSchholidayExample example);
}