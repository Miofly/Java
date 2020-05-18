package com.mio.mapper;

import com.mio.pojo.AlarmDist;
import com.mio.pojo.AlarmDistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmDistMapper {
    int countByExample(AlarmDistExample example);

    int deleteByExample(AlarmDistExample example);

    int insert(AlarmDist record);

    int insertSelective(AlarmDist record);

    List<AlarmDist> selectByExample(AlarmDistExample example);

    int updateByExampleSelective(@Param("record") AlarmDist record, @Param("example") AlarmDistExample example);

    int updateByExample(@Param("record") AlarmDist record, @Param("example") AlarmDistExample example);
}