package com.ssm.mapper;

import com.mio.pojo.MioTreeList;
import com.mio.pojo.MioTreeListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MioTreeListMapper {
    int countByExample(MioTreeListExample example);

    int deleteByExample(MioTreeListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MioTreeList record);

    int insertSelective(MioTreeList record);

    List<MioTreeList> selectByExample(MioTreeListExample example);

    MioTreeList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MioTreeList record, @Param("example") MioTreeListExample example);

    int updateByExample(@Param("record") MioTreeList record, @Param("example") MioTreeListExample example);

    int updateByPrimaryKeySelective(MioTreeList record);

    int updateByPrimaryKey(MioTreeList record);
}