package com.ssm.mapper;

import java.util.List;

import com.mio.pojo.SoftwareRegeditupdate;
import com.mio.pojo.SoftwareRegeditupdateExample;
import org.apache.ibatis.annotations.Param;

public interface SoftwareRegeditupdateMapper {
    int countByExample(SoftwareRegeditupdateExample example);

    int deleteByExample(SoftwareRegeditupdateExample example);

    int insert(SoftwareRegeditupdate record);

    int insertSelective(SoftwareRegeditupdate record);

    List<SoftwareRegeditupdate> selectByExample(SoftwareRegeditupdateExample example);

    int updateByExampleSelective(@Param("record") SoftwareRegeditupdate record, @Param("example") SoftwareRegeditupdateExample example);

    int updateByExample(@Param("record") SoftwareRegeditupdate record, @Param("example") SoftwareRegeditupdateExample example);
}