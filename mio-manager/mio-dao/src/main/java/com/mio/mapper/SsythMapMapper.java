package com.mio.mapper;

import com.mio.pojo.vo.AlarmDistCustom;
import com.mio.pojo.vo.SsythMap;
import com.mio.pojo.vo.SsythSs;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SsythMapMapper {

    /*市区详细地名得分以及坐标*/
    List<SsythMap> selectCityInfos(String bareaName);
    /*市区名称坐标详细*/
    List<SsythMap> selectCityInfo(String bareaName);
    /*搜索展示*/
    List<SsythSs> selectSS(String departName);
    /*百度地图所需信息 营业厅名称坐标得分编码 需传入具体市区明细如济南市商河县*/
    List<AlarmDistCustom> selectYytInfo(String distName);
    /*省市得分坐标名称详细*/
    List<SsythMap> selectCity();
    /*当日业务量*/
    int selectTdywl(String cityName);
    /*当日报错量*/
    int selectTdbcl(String cityName);
    /*终端信息*/
    List<SsythMap> selectZdxx(@Param(value = "cityName") String cityName);
    /*告警信息*/
    List<SsythMap> selectGj(@Param(value = "cityName") String cityName);
    /*告警信息用map返回*/
    List<Map<String, BigDecimal>> selectGjs(@Param(value = "cityName") String cityName);
    /*业务量图表*/
    List<SsythMap> selectYwltb(String cityName);
    /*报错量图表*/
    List<SsythMap> selectBcltb(String cityName);
    /*地市业务量排名*/
    List<SsythMap> selectDsywpm();
    /*地市报错量排名*/
    List<SsythMap> selectDsbcpm();
    /*饼图*/
    List<SsythMap> selectBt(String cityName);
}
