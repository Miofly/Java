package com.ssm.mapper;

import com.mio.pojo.MioLeftList;
import com.mio.pojo.MioLeftListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MioLeftListMapper {
    int countByExample(MioLeftListExample example);

    int deleteByExample(MioLeftListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MioLeftList record);

    int insertSelective(MioLeftList record);

    List<MioLeftList> selectByExample(MioLeftListExample example);

    List<MioLeftList> selectTree(MioLeftListExample example);

    MioLeftList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MioLeftList record, @Param("example") MioLeftListExample example);

    int updateByExample(@Param("record") MioLeftList record, @Param("example") MioLeftListExample example);

    int updateByPrimaryKeySelective(MioLeftList record);

    int updateByPrimaryKey(MioLeftList record);
}