package com.mio.mapper;

import com.mio.pojo.vo.MioLeftListCustom;
import com.mio.pojo.vo.MioLeftListQueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MioLeftListMapperCustom {

   /*树形节点表格分页及查询条件*/
   public List<MioLeftListCustom> selectTableList(MioLeftListQueryVo mioLeftListQueryVo) throws  Exception;


   public List<MioLeftListCustom> selectTableListExp(MioLeftListQueryVo mioLeftListQueryVo) throws  Exception;

   /*树形节点查询根据父节点ID查询*/
   public List<MioLeftListCustom> selectTree(Long parentId) throws  Exception;

   int updateTree(MioLeftListCustom mioLeftListCustom);
}