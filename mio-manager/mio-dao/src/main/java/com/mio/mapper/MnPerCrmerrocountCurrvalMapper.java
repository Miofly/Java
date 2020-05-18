package com.mio.mapper;

import com.mio.pojo.MnPerCrmerrocountCurrval;
import com.mio.pojo.MnPerCrmerrocountCurrvalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MnPerCrmerrocountCurrvalMapper {
    int countByExample(MnPerCrmerrocountCurrvalExample example);

    int deleteByExample(MnPerCrmerrocountCurrvalExample example);

    int insert(MnPerCrmerrocountCurrval record);

    int insertSelective(MnPerCrmerrocountCurrval record);

    List<MnPerCrmerrocountCurrval> selectByExample(MnPerCrmerrocountCurrvalExample example);

    int updateByExampleSelective(@Param("record") MnPerCrmerrocountCurrval record, @Param("example") MnPerCrmerrocountCurrvalExample example);

    int updateByExample(@Param("record") MnPerCrmerrocountCurrval record, @Param("example") MnPerCrmerrocountCurrvalExample example);
}