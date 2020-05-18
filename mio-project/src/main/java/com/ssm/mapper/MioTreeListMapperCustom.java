package com.ssm.mapper;

import com.mio.pojo.vo.MioTreeListCustom;
import com.mio.pojo.vo.MioTreeListQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MioTreeListMapperCustom {

   /*传入sql字符串*/
   public List<Map<String, Object>> selectPublicItemList(@Param(value = "sqlStr") String sqlStr);

   public List<MioTreeListCustom> selectTreeTable(MioTreeListQueryVo mioTreeListQueryVo) throws  Exception;

}