//package com.mio.mapper;
//
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface SoftwareTabMapper {
//    int countByExample(SoftwareTabExample example);
//
//    int deleteByExample(SoftwareTabExample example);
//
//    int insert(SoftwareTab record);
//
//    int insertSelective(SoftwareTab record);
//
//    List<SoftwareTab> selectByExample(SoftwareTabExample example);
//
//    List<SoftwareTab> selectTypeName();
//    List<SoftwareTab> selectTypeNameA();
//    List<SoftwareTab> selectTypeNameB(String tabCode);
//    List<SoftwareTab> selectTypeNameC(String tabCode);
//
//    int updateByExampleSelective(@Param("record") SoftwareTab record, @Param("example") SoftwareTabExample example);
//
//    int updateByExample(@Param("record") SoftwareTab record, @Param("example") SoftwareTabExample example);
//}