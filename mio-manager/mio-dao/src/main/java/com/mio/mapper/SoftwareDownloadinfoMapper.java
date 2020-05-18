package com.mio.mapper;

import com.mio.pojo.SoftwareDownloadinfo;
import com.mio.pojo.SoftwareDownloadinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftwareDownloadinfoMapper {
    int countByExample(SoftwareDownloadinfoExample example);

    int deleteByExample(SoftwareDownloadinfoExample example);

    int insert(SoftwareDownloadinfo record);

    int insertSelective(SoftwareDownloadinfo record);

    List<SoftwareDownloadinfo> selectByExample(SoftwareDownloadinfoExample example);

    int updateByExampleSelective(@Param("record") SoftwareDownloadinfo record, @Param("example") SoftwareDownloadinfoExample example);

    int updateByExample(@Param("record") SoftwareDownloadinfo record, @Param("example") SoftwareDownloadinfoExample example);
}