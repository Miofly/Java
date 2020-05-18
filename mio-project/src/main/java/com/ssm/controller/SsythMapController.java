package com.ssm.controller;

import com.mio.pojo.vo.AlarmDistCustom;
import com.mio.pojo.vo.SsythMap;
import com.mio.pojo.vo.SsythSs;
import com.ssm.service.SsythMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/map")
public class SsythMapController {
    @Autowired
    private SsythMapService ssythMapService;

    /*市区详细地名得分以及坐标*/
    @RequestMapping("/citys")
    @ResponseBody
    public List<SsythMap> selectCityInfos(String bareaName) throws Exception {
        List<SsythMap> result = ssythMapService.selectCityInfos(bareaName);
        return result;
    }

    /*省市得分坐标名称详细*/
    @RequestMapping("/city")
    @ResponseBody
    public List<SsythMap> selectCity() throws Exception {
        List<SsythMap> result = ssythMapService.selectCity();
        return result;
    }

    /*市区名称坐标详细*/
    @RequestMapping("/citysx")
    @ResponseBody
    public List<SsythMap> selectCityX(String bareaName) throws Exception {
        List<SsythMap> result = ssythMapService.selectCityInfo(bareaName);
        return result;
    }

    /*百度地图所需信息 营业厅名称坐标得分编码 需传入具体市区明细如济南市商河县*/
    @RequestMapping("/cityx")
    @ResponseBody
    public List<AlarmDistCustom> selectYytInfo(String distName) throws Exception {
        List<AlarmDistCustom> result = ssythMapService.selectYytInfo(distName);
        return result;
    }

    /*搜索展示*/
    @RequestMapping("/ss")
    @ResponseBody
    public List<SsythSs> selectSS(String departName) throws Exception {
        List<SsythSs> result = ssythMapService.selectSS(departName);
        return result;
    }

    /*当日业务量*/
    @RequestMapping("/tdywl")
    @ResponseBody
    public int selectTdywl(String cityName) throws Exception {
        return ssythMapService.selectTdywl(cityName);
    }

    /*当日报错量*/
    @RequestMapping("/tdbcl")
    @ResponseBody
    public int selectTdbcl(String cityName) throws Exception {
        return ssythMapService.selectTdbcl(cityName);
    }

    /*终端信息*/
    @RequestMapping("/zdxx")
    @ResponseBody
    public List<SsythMap> selectZdxx(String cityName) throws Exception {
        List<SsythMap> result = ssythMapService.selectZdxx(cityName);
        return result;
    }

    /*告警信息*/
    @RequestMapping("/gj")
    @ResponseBody
    public List<SsythMap> selectGj(String cityName) throws Exception {
        List<SsythMap> result = ssythMapService.selectGj(cityName);
        return result;
    }

    /*告警信息用map返回*/
    @RequestMapping("/gjs")
    @ResponseBody
    public List<Map<String, BigDecimal>> selectGjs(String cityName) throws Exception {
        List<Map<String, BigDecimal>> result = ssythMapService.selectGjs(cityName);
        return result;
    }

    /*业务量图表*/
    @RequestMapping("/ywltb")
    @ResponseBody
    public List<SsythMap> selectYwltb(String cityName) throws Exception {
        List<SsythMap> result = ssythMapService.selectYwltb(cityName);
        return result;
    }

    /*报错量图表*/
    @RequestMapping("/bcltb")
    @ResponseBody
    public List<SsythMap> selectBcltb(String cityName) throws Exception {
        List<SsythMap> result = ssythMapService.selectBcltb(cityName);
        return result;
    }

    /*地市业务量排名*/
    @RequestMapping("/dsywpm")
    @ResponseBody
    public List<SsythMap> selectDsywpm() throws Exception {
        List<SsythMap> result = ssythMapService.selectDsywpm();
        return result;
    }

    /*地市报错量排名*/
    @RequestMapping("/dsbcpm")
    @ResponseBody
    public List<SsythMap> selectDsbcpm() throws Exception {
        List<SsythMap> result = ssythMapService.selectDsbcpm();
        return result;
    }

    /*饼图*/
    @RequestMapping("/bt")
    @ResponseBody
    public List<SsythMap> selectBt(String cityName) throws Exception {
        List<SsythMap> result = ssythMapService.selectBt(cityName);
        return result;
    }


}