package com.ssm.mapper;

import com.mio.pojo.MnPerCrmerrocountCurrval;
import com.mio.pojo.MnPerCrmerrocountCurrvalExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MnPerCrmerrocountCurrvalMapper {
    int countByExample(MnPerCrmerrocountCurrvalExample example);

    int deleteByExample(MnPerCrmerrocountCurrvalExample example);

    int insert(MnPerCrmerrocountCurrval record);

    int insertSelective(MnPerCrmerrocountCurrval record);

    List<MnPerCrmerrocountCurrval> selectByExample(MnPerCrmerrocountCurrvalExample example);

    int updateByExampleSelective(@Param("record") MnPerCrmerrocountCurrval record, @Param("example") MnPerCrmerrocountCurrvalExample example);

    int updateByExample(@Param("record") MnPerCrmerrocountCurrval record, @Param("example") MnPerCrmerrocountCurrvalExample example);
}