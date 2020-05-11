package com.ssm.mapper;

import com.ssm.pojo.SoftwareFilecheckinfo;
import com.ssm.pojo.SoftwareFilecheckinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareFilecheckinfoMapper {
    int countByExample(SoftwareFilecheckinfoExample example);

    int deleteByExample(SoftwareFilecheckinfoExample example);

    int insert(SoftwareFilecheckinfo record);

    int insertSelective(SoftwareFilecheckinfo record);

    List<SoftwareFilecheckinfo> selectByExample(SoftwareFilecheckinfoExample example);

    int updateByExampleSelective(@Param("record") SoftwareFilecheckinfo record, @Param("example") SoftwareFilecheckinfoExample example);

    int updateByExample(@Param("record") SoftwareFilecheckinfo record, @Param("example") SoftwareFilecheckinfoExample example);
}