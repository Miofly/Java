package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mio.pojo.*;
import com.mio.pojo.vo.Software;
import com.mio.result.SimpleResult;
import com.mio.util.EUDataGridResult;
import com.ssm.mapper.*;
import com.ssm.pojo.SoftwareFilecheckinfo;
import com.ssm.pojo.SoftwareTab;
import com.ssm.pojo.SoftwareTabExample;
import com.ssm.service.SoftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class SoftServiceImpl implements SoftService {


    @Autowired
    private SoftwareBaseinfoMapper softwareBaseinfoMapper;
    @Autowired
    private SoftwareTabRelMapper softwareTabRelMapper;
    @Autowired
    private SoftwareTabMapper softwareTabMapper;
    @Autowired
    private SoftwareRegeditupdateMapper softwareRegeditupdateMapper;
    @Autowired
    private SoftwareRegeditupdateDetailMapper softwareRegeditupdateDetailMapper;
    @Autowired
    private CommonRegionIpMapper commonRegionIpMapper;
    @Autowired
    private SoftwareFilecheckinfoMapper softwareFilecheckinfoMapper;

    public EUDataGridResult selectSoftInfos(String type, int pageIndex, int pageSize) throws Exception {

        if (type != null && type != "") {
            PageHelper.startPage(pageIndex + 1, pageSize);

            SoftwareBaseinfoExample example = new SoftwareBaseinfoExample();
            SoftwareBaseinfoExample.Criteria criteria = example.createCriteria();
            criteria.andUseTypeEqualTo(type);

            List<SoftwareBaseinfo> list = softwareBaseinfoMapper.selectInfos(example);

            EUDataGridResult result = new EUDataGridResult();
            result.setData(list);
            /*分页处理*/

            PageInfo<SoftwareBaseinfo> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            PageHelper.clearPage();
            return result;
        } else {
            PageHelper.startPage(pageIndex + 1, pageSize);

            SoftwareBaseinfoExample example = new SoftwareBaseinfoExample();

            List<SoftwareBaseinfo> list = softwareBaseinfoMapper.selectInfos(example);
            EUDataGridResult result = new EUDataGridResult();
            result.setData(list);

            /*分页处理*/

            PageInfo<SoftwareBaseinfo> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            PageHelper.clearPage();
            return result;
        }


    }

    public void addSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception {

        softwareBaseinfo.setCreatedTime(new Date());
        softwareBaseinfo.setPackagePath("http://10.19.193.132/DownloaderServer/downloadFile/");
        softwareBaseinfoMapper.insertSelective(softwareBaseinfo);
    }


    public void addRel(int id, String type) throws Exception {
        SoftwareTabRel softwareTabRel = new SoftwareTabRel();

        softwareTabRel.setSoftwareId(id);
        softwareTabRel.setTabCode(type);
        softwareTabRel.setOrders(3);
        softwareTabRelMapper.insert(softwareTabRel);

        softwareTabRel.setSoftwareId(id);
        softwareTabRel.setTabCode("all");
        softwareTabRel.setOrders(1);
        softwareTabRelMapper.insert(softwareTabRel);

    }

    public SoftwareBaseinfo queryById(int id) throws Exception {
        return softwareBaseinfoMapper.selectByPrimaryKey(id);
    }

    public void upSoft(SoftwareBaseinfo softwareBaseinfo) throws Exception {
        softwareBaseinfoMapper.updateByPrimaryKeySelective(softwareBaseinfo);
    }

    public void upSoftRel(int id, String type) throws Exception {
        SoftwareTabRelExample example = new SoftwareTabRelExample();
        SoftwareTabRelExample.Criteria criteria = example.createCriteria();
        criteria.andSoftwareIdEqualTo(id);
        criteria.andTabCodeNotEqualTo("all");

        SoftwareTabRel softwareTabRel = new SoftwareTabRel();
        softwareTabRel.setTabCode(type);

        softwareTabRelMapper.updateByExampleSelective(softwareTabRel, example);

    }

    public void delSoft(int id) throws Exception {
        softwareBaseinfoMapper.deleteByPrimaryKey(id);
    }

    public void delSoftRel(int id) throws Exception {
        SoftwareTabRelExample example = new SoftwareTabRelExample();
        SoftwareTabRelExample.Criteria criteria = example.createCriteria();
        criteria.andSoftwareIdEqualTo(id);
//        SoftwareTabRel softwareTabRel = new SoftwareTabRel();
        softwareTabRelMapper.deleteByExample(example);
    }

    public List<SoftwareTab> selectTypeName() throws Exception {
        return softwareTabMapper.selectTypeName();
    }

    public SimpleResult selectTypeNames() throws Exception {
        return SimpleResult.ok(softwareTabMapper.selectTypeName());
    }

    public List<SoftwareTab> selectTypeNameA() throws Exception {
        return softwareTabMapper.selectTypeNameA();
    }

    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception {
        return softwareTabMapper.selectTypeNameB(tabCode);

    }

    public List<SoftwareTab> selectTypeNameC(String tabCode) throws Exception {
        return softwareTabMapper.selectTypeNameC(tabCode);

    }

    public int selectMaxId() throws Exception {
        return softwareBaseinfoMapper.selectMaxId();
    }

    public List<Map<String, Long>> selectStRank(String beginTime, String endTime, String tabName, String region) throws Exception {
        return softwareTabMapper.selectStRank(beginTime, endTime, tabName, region);
    }

    public List<Software> selectStRanks(String beginTime, String endTime, String tabName, String region) throws Exception {
        return softwareTabMapper.selectStRanks(beginTime, endTime, tabName, region);
    }

    public List<Software> selectStRanksdc(String beginTime, String endTime, String tabName, String region) throws Exception {
        return softwareTabMapper.selectStRanksdc(beginTime, endTime, tabName, region);
    }

    public List<Software> selectStDownSl(String beginTime, String endTime, String tabName, String region) throws Exception {
        return softwareTabMapper.selectStDownSl(beginTime, endTime, tabName, region);
    }

    public List<Software> selectStQsu(String beginTime, String endTime, String tabName, String region) throws Exception {
        return softwareTabMapper.selectStQsu(beginTime, endTime, tabName, region);
    }

    /*地市类型*/
    public List<CommonRegionIp> selectAll() throws Exception {
        CommonRegionIpExample example = new CommonRegionIpExample();
        return commonRegionIpMapper.selectByExample(example);
    }

    /*80端口两个接口*/
    public SimpleResult selectRegedit() throws Exception {
        SoftwareRegeditupdateExample example = new SoftwareRegeditupdateExample();
        SoftwareRegeditupdateExample.Criteria criteria = example.createCriteria();
        return SimpleResult.ok(softwareRegeditupdateMapper.selectByExample(example));
    }

    public SimpleResult selectRegeditDetail(Integer stepId) throws Exception {
        SoftwareRegeditupdateDetailExample example = new SoftwareRegeditupdateDetailExample();
        SoftwareRegeditupdateDetailExample.Criteria criteria = example.createCriteria();
        criteria.andStepIdEqualTo(stepId);

        return SimpleResult.ok(softwareRegeditupdateDetailMapper.selectByExample(example));
    }

    public void insertSoftInfos(SoftwareFilecheckinfo softwareFilecheckinfo) throws Exception {
        softwareFilecheckinfoMapper.insert(softwareFilecheckinfo);
    }

    public void addSort(SoftwareTab softwareTab) throws Exception {
        softwareTab.setTabCode(UUID.randomUUID().toString().replace("-", "").toLowerCase());
        Integer orderId = softwareTabMapper.selectOrder();
        softwareTab.setTabOrder(orderId+1);
        softwareTab.setTabName(softwareTab.getTabName());
        softwareTab.setTabDesc(softwareTab.getTabDesc());
        softwareTab.setTabStatus(softwareTab.getTabStatus());
        softwareTabMapper.insert(softwareTab);
    }

    public List<SoftwareTab> selectTab() throws Exception {
        SoftwareTabExample example = new SoftwareTabExample();
        example.setOrderByClause("tab_order");
//        SoftwareTabExample.Criteria criteria = example.createCriteria();
//        criteria.set.order
        return softwareTabMapper.selectByExample(example);
    }

    public List<SoftwareTab> queryByTabCode(String tabCode) throws Exception {
        SoftwareTabExample example = new SoftwareTabExample();
        SoftwareTabExample.Criteria criteria = example.createCriteria();
        criteria.andTabCodeEqualTo(tabCode);
        return softwareTabMapper.selectByExample(example);
    }

    public void upTab(SoftwareTab softwareTab) throws Exception {
        SoftwareTabExample example = new SoftwareTabExample();
        SoftwareTabExample.Criteria criteria = example.createCriteria();
        criteria.andTabCodeEqualTo(softwareTab.getTabCode());
        softwareTabMapper.updateByExampleSelective(softwareTab, example);
    }


}
