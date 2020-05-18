package com.ssm.mapper;

import java.util.List;

import com.mio.pojo.SoftwareRegeditupdateDetail;
import com.mio.pojo.SoftwareRegeditupdateDetailExample;
import org.apache.ibatis.annotations.Param;

public interface SoftwareRegeditupdateDetailMapper {
    int countByExample(SoftwareRegeditupdateDetailExample example);

    int deleteByExample(SoftwareRegeditupdateDetailExample example);

    int insert(SoftwareRegeditupdateDetail record);

    int insertSelective(SoftwareRegeditupdateDetail record);

    List<SoftwareRegeditupdateDetail> selectByExample(SoftwareRegeditupdateDetailExample example);

    int updateByExampleSelective(@Param("record") SoftwareRegeditupdateDetail record, @Param("example") SoftwareRegeditupdateDetailExample example);

    int updateByExample(@Param("record") SoftwareRegeditupdateDetail record, @Param("example") SoftwareRegeditupdateDetailExample example);
}