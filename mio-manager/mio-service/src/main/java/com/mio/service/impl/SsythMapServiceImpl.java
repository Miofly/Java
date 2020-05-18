package com.mio.service.impl;

import com.mio.mapper.SsythMapMapper;
import com.mio.pojo.vo.AlarmDistCustom;
import com.mio.pojo.vo.SsythMap;
import com.mio.pojo.vo.SsythSs;
import com.mio.service.SsythMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class SsythMapServiceImpl implements SsythMapService {

    @Autowired
    private SsythMapMapper ssythMapMapper;

    /*市区详细地名得分以及坐标*/
    public List<SsythMap> selectCityInfos(String bareaName)  throws Exception{
        return ssythMapMapper.selectCityInfos(bareaName);
    }

    /*省市得分坐标名称详细*/
    public List<SsythMap> selectCity()  throws Exception{
        return ssythMapMapper.selectCity();
    }
    /*市区名称坐标详细*/
    public List<SsythMap> selectCityInfo(String bareaName)  throws Exception{
        return ssythMapMapper.selectCityInfo(bareaName);
    }
    /*百度地图所需信息 营业厅名称坐标得分编码 需传入具体市区明细如济南市商河县*/
    public List<AlarmDistCustom> selectYytInfo(String distName) throws Exception{
        return ssythMapMapper.selectYytInfo(distName);
    }
    /*搜索展示*/
    public List<SsythSs> selectSS(String departName) throws Exception{
        return  ssythMapMapper.selectSS(departName);
    }
    /*当日业务量*/
    public int selectTdywl(String cityName) throws Exception{
        return ssythMapMapper.selectTdywl(cityName);
    }
    /*当日报错量*/
    public int selectTdbcl(String cityName) throws Exception{
        return ssythMapMapper.selectTdbcl(cityName);
    }
    /*终端信息*/
    public List<SsythMap> selectZdxx(String cityName) throws Exception{
        return ssythMapMapper.selectZdxx(cityName);
    }
    /*告警信息*/
    public List<SsythMap> selectGj(String cityName) throws Exception{
        return ssythMapMapper.selectGj(cityName);
    }
    /*告警信息用map返回*/
    public List<Map<String, BigDecimal>>selectGjs(String cityName)  throws Exception{
        return ssythMapMapper.selectGjs(cityName);
    }
    /*业务量图表*/
    public List<SsythMap> selectYwltb(String cityName) throws Exception{
        return ssythMapMapper.selectYwltb(cityName);
    }
    /*报错量图表*/
    public List<SsythMap> selectBcltb(String cityName) throws Exception{
        return ssythMapMapper.selectBcltb(cityName);
    }
    /*地市业务量排名*/
    public List<SsythMap> selectDsywpm() throws Exception{
        return ssythMapMapper.selectDsywpm();
    }
    /*地市报错量排名*/
    public List<SsythMap> selectDsbcpm() throws Exception{
        return ssythMapMapper.selectDsbcpm();
    }
    /*饼图*/
    public List<SsythMap> selectBt(String cityName) throws Exception{
        return ssythMapMapper.selectBt(cityName);
    }
}
