package com.mio.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mio.mapper.SoftwareBaseinfoMapper;
import com.mio.mapper.SoftwareTabMapper;
import com.mio.mapper.SoftwareTabRelMapper;
import com.mio.pojo.*;
import com.mio.service.SoftService;
import com.mio.util.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SoftServiceImpl implements SoftService {


    @Autowired
    private SoftwareBaseinfoMapper softwareBaseinfoMapper;
    @Autowired
    private SoftwareTabRelMapper softwareTabRelMapper;
    @Autowired
    private SoftwareTabMapper softwareTabMapper;

    public EUDataGridResult selectSoftInfos(String type,int pageIndex, int pageSize) throws Exception{

        if (type!=null&&type!=""){
            PageHelper.startPage(pageIndex+1,pageSize);

            SoftwareBaseinfoExample example = new SoftwareBaseinfoExample();

            SoftwareBaseinfoExample.Criteria criteria = example.createCriteria();
            criteria.andUseTypeEqualTo(type);

            List<SoftwareBaseinfo> list = softwareBaseinfoMapper.selectInfos(example);

            PageHelper.startPage(pageIndex+1,pageSize);
            EUDataGridResult result = new EUDataGridResult();
            result.setData(list);
            /*分页处理*/
            PageInfo<SoftwareBaseinfo> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            return  result;
        }else{
            PageHelper.startPage(pageIndex+1,pageSize);

            SoftwareBaseinfoExample example = new SoftwareBaseinfoExample();

            List<SoftwareBaseinfo> list = softwareBaseinfoMapper.selectInfos(example);

            PageHelper.startPage(pageIndex+1,pageSize);
            EUDataGridResult result = new EUDataGridResult();
            result.setData(list);
            /*分页处理*/
            PageInfo<SoftwareBaseinfo> pageInfo = new PageInfo<>(list);
            result.setTotal(pageInfo.getTotal());
            return  result;
        }


    }

    public void addSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception{

        softwareBaseinfo.setCreatedTime(new Date());
        softwareBaseinfo.setPackagePath("http://10.19.193.132/DownloaderServer/downloadFile/");
        softwareBaseinfoMapper.insertSelective(softwareBaseinfo);
    }


    public void addRel(int id,String type)  throws Exception{
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
    public SoftwareBaseinfo queryById(int id)  throws Exception{
        return softwareBaseinfoMapper.selectByPrimaryKey(id);
    }

    public void upSoft(SoftwareBaseinfo softwareBaseinfo)  throws Exception{
        softwareBaseinfoMapper.updateByPrimaryKeySelective(softwareBaseinfo);
    }

    public void upSoftRel(int id,String type)  throws Exception{
        SoftwareTabRelExample example = new SoftwareTabRelExample();
        SoftwareTabRelExample.Criteria criteria = example.createCriteria();
        criteria.andSoftwareIdEqualTo(id);
        criteria.andTabCodeNotEqualTo("all");

        SoftwareTabRel softwareTabRel = new SoftwareTabRel();
        softwareTabRel.setTabCode(type);

        softwareTabRelMapper.updateByExampleSelective(softwareTabRel,example);

    }

    public void delSoft(int id)  throws Exception{
        softwareBaseinfoMapper.deleteByPrimaryKey(id);
    }
    public void delSoftRel(int id)  throws Exception{
        SoftwareTabRelExample example = new SoftwareTabRelExample();
        SoftwareTabRelExample.Criteria criteria = example.createCriteria();
        criteria.andSoftwareIdEqualTo(id);
//        SoftwareTabRel softwareTabRel = new SoftwareTabRel();
        softwareTabRelMapper.deleteByExample(example);
    }

    public List<SoftwareTab> selectTypeName() throws Exception{
        return softwareTabMapper.selectTypeName();
    }

    public List<SoftwareTab> selectTypeNameA() throws Exception{
        return softwareTabMapper.selectTypeNameA();
    }
    public List<SoftwareTab> selectTypeNameB(String tabCode) throws Exception{
        return softwareTabMapper.selectTypeNameB(tabCode);

    }
    public List<SoftwareTab> selectTypeNameC(String tabCode) throws Exception{
        return softwareTabMapper.selectTypeNameC(tabCode);

    }

    public int selectMaxId() throws Exception{
        return softwareBaseinfoMapper.selectMaxId();
    }
}
