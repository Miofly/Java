package com.mio.service;

import com.mio.pojo.SoftwareBaseinfo;
import com.mio.util.EUDataGridResult;

import java.util.List;

public interface SoftService {

    public EUDataGridResult selectSoftInfos(String type, int pageIndex, int pageSize) throws Exception;

    public void addSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception;

    public void addRel(int id,String type)  throws Exception;

    public void upSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception;

    public SoftwareBaseinfo queryById(int id)  throws Exception;

    public void upSoftRel(int id,String type)  throws Exception;

    public void delSoft(int id)  throws Exception;
    public void delSoftRel(int id)  throws Exception;


//    public List<SoftwareTab> selectTypeName() throws Exception;
//    public List<SoftwareTab> selectTypeNameA() throws Exception;
//    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception;
//    public List<SoftwareTab> selectTypeNameC(String tabCode) throws Exception;
//

    public int selectMaxId() throws Exception;
}
