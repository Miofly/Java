package com.ssm.mapper;

import com.mio.pojo.SoftwareDownloadinfo;
import com.mio.pojo.SoftwareDownloadinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SoftwareDownloadinfoMapper {
    int countByExample(SoftwareDownloadinfoExample example);

    int deleteByExample(SoftwareDownloadinfoExample example);

    int insert(SoftwareDownloadinfo record);

    int insertSelective(SoftwareDownloadinfo record);

    List<SoftwareDownloadinfo> selectByExample(SoftwareDownloadinfoExample example);

    int updateByExampleSelective(@Param("record") SoftwareDownloadinfo record, @Param("example") SoftwareDownloadinfoExample example);

    int updateByExample(@Param("record") SoftwareDownloadinfo record, @Param("example") SoftwareDownloadinfoExample example);
}