package com.mio.mapper;

import com.mio.pojo.SoftwareTabRel;
import com.mio.pojo.SoftwareTabRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareTabRelMapper {
    int countByExample(SoftwareTabRelExample example);

    int deleteByExample(SoftwareTabRelExample example);

    int insert(SoftwareTabRel record);

    int insertSelective(SoftwareTabRel record);

    List<SoftwareTabRel> selectByExample(SoftwareTabRelExample example);

    int updateByExampleSelective(@Param("record") SoftwareTabRel record, @Param("example") SoftwareTabRelExample example);

    int updateByExample(@Param("record") SoftwareTabRel record, @Param("example") SoftwareTabRelExample example);
}