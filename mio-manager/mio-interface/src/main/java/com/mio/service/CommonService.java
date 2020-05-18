package com.mio.service;

import com.mio.pojo.MioTreeList;
import com.mio.pojo.vo.*;
import com.mio.util.EUDataGridResult;
import com.mio.util.EUTreeNode;

import java.util.List;
import java.util.Map;

public interface CommonService {

    /*传入sql字符串*/
    public List<Map<String, Object>>  superManagerSelect(String value) throws Exception;

    /*树形列表mysql 逆向工程单表查询*/
    List<EUTreeNode> getTreeList(Long parentId) throws Exception;

    /*表格 逆向工程单表查询*/
    EUDataGridResult queryTableList(int pageIndex, int pageSize) throws Exception;

    /*表格 逆向工程单表查询*/
    EUDataGridResult queryTableLists(MioTreeListQueryVo mioTreeListQueryVo, int pageIndex, int pageSize) throws Exception;

    public List<MioTreeList> getTreeListtest(Long parentId) throws Exception;

    public List<InfoCustom> selectInfo(InfoQueryVo infoQueryVo) throws  Exception;

    public List<InfosCustom> selectInfos(InfosQueryVo infosQueryVo) throws  Exception;

    public List<InfosCustom> selectInfoss(String departName) throws  Exception;

    EUDataGridResult selectInfosss(String departNames, int pageIndex, int pageSize) throws Exception;

}
