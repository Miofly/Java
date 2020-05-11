package com.ssm.mapper;

import com.mio.pojo.vo.Software;
import com.ssm.pojo.SoftwareTab;
import com.ssm.pojo.SoftwareTabExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SoftwareTabMapper {
    int countByExample(SoftwareTabExample example);

    int selectOrder();

    int deleteByExample(SoftwareTabExample example);

    int insert(SoftwareTab record);

    int insertSelective(SoftwareTab record);

    List<SoftwareTab> selectByExample(SoftwareTabExample example);

    List<SoftwareTab> selectTypeName();

    List<SoftwareTab> selectTypeNameA();
    List<SoftwareTab> selectTypeNameB(String tabCode);
    List<SoftwareTab> selectTypeNameC(String tabCode);

    int updateByExampleSelective(@Param("record") SoftwareTab record, @Param("example") SoftwareTabExample example);

    int updateByExample(@Param("record") SoftwareTab record, @Param("example") SoftwareTabExample example);

    List<Map<String, Long>> selectStRank(@Param(value = "beginTime") String beginTime, @Param(value = "endTime") String endTime, @Param(value = "tabName") String tabName, @Param(value = "region") String region);
    List<Software> selectStRanks(@Param(value = "beginTime") String beginTime, @Param(value = "endTime") String endTime, @Param(value = "tabName") String tabName, @Param(value = "region") String region);
    List<Software> selectStRanksdc(@Param(value = "beginTime") String beginTime, @Param(value = "endTime") String endTime, @Param(value = "tabName") String tabName, @Param(value = "region") String region);
    List<Software> selectStDownSl(@Param(value = "beginTime") String beginTime, @Param(value = "endTime") String endTime, @Param(value = "tabName") String tabName, @Param(value = "region") String region);
    List<Software> selectStQsu(@Param(value = "beginTime") String beginTime, @Param(value = "endTime") String endTime, @Param(value = "tabName") String tabName, @Param(value = "region") String region);
}