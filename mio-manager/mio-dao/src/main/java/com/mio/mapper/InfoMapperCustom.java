package com.mio.mapper;

import com.mio.pojo.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoMapperCustom {

   /*树形节点表格分页及查询条件*/
   public List<InfoCustom> selectInfo(InfoQueryVo infoQueryVo) throws  Exception;
   public List<InfosCustom> selectInfos(InfosQueryVo infosQueryVo) throws  Exception;
   public List<InfosCustom> selectInfoss(@Param(value = "departName") String departName) throws  Exception;
   public List<InfosCustom> selectInfosss(@Param(value = "departNames") String departNames) throws  Exception;



}