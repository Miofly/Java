package com.ssm.service;

import com.mio.pojo.*;
import com.mio.pojo.vo.Software;
import com.mio.result.SimpleResult;
import com.mio.result.SubmitResultInfo;
import com.mio.util.EUDataGridResult;
import com.ssm.pojo.SoftwareFilecheckinfo;
import com.ssm.pojo.SoftwareTab;

import java.util.List;
import java.util.Map;

public interface SoftService {


    public EUDataGridResult selectSoftInfos(String type, int pageIndex, int pageSize) throws Exception;

    public void addSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception;

    public void addRel(int id, String type) throws Exception;

    public void upSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception;

    public SoftwareBaseinfo queryById(int id) throws Exception;

    public void upSoftRel(int id, String type) throws Exception;

    public void delSoft(int id) throws Exception;

    public void delSoftRel(int id) throws Exception;


    public List<SoftwareTab> selectTypeName() throws Exception;

    public SimpleResult selectTypeNames() throws Exception;

    public List<SoftwareTab> selectTypeNameA() throws Exception;

    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception;

    public List<SoftwareTab> selectTypeNameC(String tabCode) throws Exception;


    public int selectMaxId() throws Exception;

    public List<Map<String, Long>> selectStRank(String beginTime, String endTime, String tabName, String region) throws Exception;

    List<Software> selectStRanks(String beginTime, String endTime, String tabName, String region) throws Exception;

    List<Software> selectStRanksdc(String beginTime, String endTime, String tabName, String region) throws Exception;

    List<Software> selectStDownSl(String beginTime, String endTime, String tabName, String region) throws Exception;

    List<Software> selectStQsu(String beginTime, String endTime, String tabName, String region) throws Exception;


    /*地市类型*/
    public List<CommonRegionIp> selectAll() throws Exception;

    //  两个接口
    public SimpleResult selectRegedit() throws Exception;

    public SimpleResult selectRegeditDetail(Integer stepId) throws Exception;

    public void insertSoftInfos(SoftwareFilecheckinfo softwareFilecheckinfo) throws Exception;

    public void addSort(SoftwareTab softwareTab) throws Exception;

    public void upTab(SoftwareTab softwareTab) throws Exception;

    public List<SoftwareTab> selectTab() throws Exception;

    public List<SoftwareTab> queryByTabCode(String tabCode) throws Exception;

}