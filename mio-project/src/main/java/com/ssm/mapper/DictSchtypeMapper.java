package com.ssm.mapper;

import com.ssm.pojo.DictSchtype;
import com.ssm.pojo.DictSchtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictSchtypeMapper {
    int countByExample(DictSchtypeExample example);

    int deleteByExample(DictSchtypeExample example);

    int insert(DictSchtype record);

    int insertSelective(DictSchtype record);

    List<DictSchtype> selectByExample(DictSchtypeExample example);

    int updateByExampleSelective(@Param("record") DictSchtype record, @Param("example") DictSchtypeExample example);

    int updateByExample(@Param("record") DictSchtype record, @Param("example") DictSchtypeExample example);
}