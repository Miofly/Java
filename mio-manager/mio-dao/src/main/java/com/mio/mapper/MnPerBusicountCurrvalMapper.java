package com.mio.mapper;

import com.mio.pojo.MnPerBusicountCurrval;
import com.mio.pojo.MnPerBusicountCurrvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MnPerBusicountCurrvalMapper {
    int countByExample(MnPerBusicountCurrvalExample example);

    int deleteByExample(MnPerBusicountCurrvalExample example);

    int insert(MnPerBusicountCurrval record);

    int insertSelective(MnPerBusicountCurrval record);

    List<MnPerBusicountCurrval> selectByExample(MnPerBusicountCurrvalExample example);

    int updateByExampleSelective(@Param("record") MnPerBusicountCurrval record, @Param("example") MnPerBusicountCurrvalExample example);

    int updateByExample(@Param("record") MnPerBusicountCurrval record, @Param("example") MnPerBusicountCurrvalExample example);
}