package com.ssm.mapper;

import com.mio.pojo.SoftwareBaseinfo;
import com.mio.pojo.SoftwareBaseinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SoftwareBaseinfoMapper {
    int countByExample(SoftwareBaseinfoExample example);

    int deleteByExample(SoftwareBaseinfoExample example);

    int deleteByPrimaryKey(int id);
//    int deleteByPrimaryKey(SoftwareBaseinfoKey key);

    int insert(SoftwareBaseinfo record);

    int insertSelective(SoftwareBaseinfo record);

    List<SoftwareBaseinfo> selectByExample(SoftwareBaseinfoExample example);

    List<SoftwareBaseinfo> selectInfos(SoftwareBaseinfoExample example);

    SoftwareBaseinfo selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") SoftwareBaseinfo record, @Param("example") SoftwareBaseinfoExample example);

    int updateByExample(@Param("record") SoftwareBaseinfo record, @Param("example") SoftwareBaseinfoExample example);

    int updateByPrimaryKeySelective(SoftwareBaseinfo record);

    int updateByPrimaryKey(SoftwareBaseinfo record);

    int selectMaxId();
}