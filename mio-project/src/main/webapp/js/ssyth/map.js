/*地图配置*/
/*标题，数据，地图名称，区域背景颜色'rgba(0,0,0,0.3)'*/
function mapOpt(title,data,mapname,areabg){
    /*给气泡大小定义的常量*/
    var max = 480, min = 9;
    var maxSize4Pin = 100, minSize4Pin = 20;
    option = {
        /*标题*/
        title:{text:title,x:'center',y:'25px',textAlign:'left',
            textStyle:{color: 'white',fontStyle: 'normal',fontWeight: '100',
                fontFamily: 'Microsoft YaHei',fontSize: '18'}},
        /*地图的整体设置*/
        geo: {/*是否显示地理坐标系组件*/
            show: true,
            map: mapname,
            roam: false,/*是否开启鼠标缩放和平移漫游*/
            // zoom:1,/*地图大小缩放*/
            // scaleLimit:{min:0.5,max:1.5},/*滚轮缩放的极限控制*/
            // aspectScale:0.75,/*地图的长宽比例*/
            // left:100,
            // top:60,/*地图位置的控制*/
            /*地图颜色*/
            itemStyle: {
                normal: {
                    /*地图边框颜色*/borderColor: 'white',borderWidth:1,borderType:'solid',/*dotted dashed*/
                    /*地图整体模糊效果*/
                    shadowColor: 'rgba(255,255,255,0.7)',shadowBlur: 110,/*模糊程度*/
                    // shadowOffsetX: 10,shadowOffsetY: -10,/*模糊距离控制*/
                    opacity:1,/*图形通明度*/
                },
                emphasis: {/*定义区域划过时颜色*/areaColor: 'rgba(255,255,255,0.6)',},},
            /*文字颜色*/
            label: {normal: {show: true,textStyle:{color: 'white',fontSize: 14,}},
                emphasis: {show: true,textStyle:{color: 'black',fontSize: 14,}}},
        },
        /*滑动提示的设置*/
        tooltip: {show:true,trigger: 'item',/*滑动提示框*/
            /*提示框背景色*/backgroundColor:'#3e4145',/*设置padding值*/padding:[5,10,5,10],
            /*borderColor:'blue',borderWidth:0,边框设置*/
            /*文字设置*/
            textStyle:{color:'white',fontSize:14,fontWeight:'normal'},
            formatter: function (result){
                return result.data.name+'<br />数据:'+result.data.value[2];
            }},

        series : [
            /*地图控制*/
            {type: 'map',map: mapname,geoIndex:0,data: data,
                /*地图背景色根据数据变化*/
                itemStyle: {
                    normal: {
                        color: function (params) {
                            /*获取分数*/
                            var index_num = params.data.value[2];

                            /*根据分数控制颜色*/
                            for (var i = 0; i < data.length; i++) {
                                if (index_num>=60) {return areabg}
                                if (index_num<60) {return 'rgba(255,0,0,0.8)';}
                            }},
                    },}},
            /*气泡的设置*/
            {type: 'scatter',coordinateSystem: 'geo',
                data: data,
                symbol: 'pin',/*图表的样式*/
                symbolSize:function (val) {
                    var a = (maxSize4Pin - minSize4Pin) / (max - min);
                    var b = minSize4Pin - a*min;b = maxSize4Pin - a*max;
                    /*气泡大小*/
                    /*判断数据的类型*//*console.log(typeof val[2])*/;
                    /*判断类型为number时数据的长度*//*console.log(val[2].toString().length);*/
                    /*根据数据的大小以及长度进行判读定义图标大小*/
                    /* if(val[2]<=60&&val[2].toString().length>4){
                         return a*5*val[2]+b
                     }else if(val[2]==0){
                         return a*15+30
                     }else if(val[2]<=10){
                         return a*15*val[2]+b
                     }else{
                         return a*3*val[2]+b;
                     }*/

                    return 70
                },/*定义图标(箭头图标)的大小*/
                label: {normal: {show: true,
                        textStyle: {color: '#fff'/*箭头里文字颜色*/,fontSize: 13,}}},
                itemStyle: {normal: {/*大箭头颜色*/
                        color: function (params) {
                            /*根据数据定义大箭头颜色*/
                            var index_num =  params.data.value[2];
                            for (var i = 0; i < data.length; i++) {
                                if (index_num>=90) {return 'rgba(33,163,23,1)';}
                                if(index_num>80){return '#f26522';}
                                if(index_num>70){return '#ed1941';}
                                if(index_num>60){return '#ef4136';}
                                if(index_num>0){return 'red'}}}}},
            },
            /*小圆圈颜色*/
            {
                type: 'effectScatter',
                coordinateSystem: 'geo',/*使用的坐标系地理坐标系*/
                data: data,
                /*标记的图形*/symbol:'circle',/*'circle', 'rect', 'roundRect', 'triangle', 'diamond', 'pin', 'arrow', 'none'*/
                /*根据数据判断标记的大小*/
                symbolSize: function (val)
                {
                    if(val[2]<=60&&val[2].toString().length>4){
                        return val[2]/5
                    }else if(val[2]==0){
                        return 5
                    }else if(val[2]<=10){
                        return val[2]/8
                    }else{
                        return val[2]/7;}
                },
                showEffectOn: 'render',
                // symbolOffset:['100%', '50%'],/*气泡位置调整*/
                /*涟漪特效配置*/
                rippleEffect: {brushType: 'stroke'/*波纹方式fill*/,scale:4,/*比例*/period:5/*周期*/},
                hoverAnimation: true,
                /*颜色的控制*/
                itemStyle: {normal: {
                        color: function (params) {
                            var index_num = params.data.value[2];
                            for (var i = 0; i < data.length; i++) {
                                if (index_num>=90) {return 'rgba(33,163,23,1)';}
                                if(index_num>80){return '#f26522';}
                                if(index_num>70){return '#ed1941';}
                                if(index_num>60){return '#ef4136';}
                                if(index_num>0){return 'red'}}},
                    }}}
        ]
    };
}

/*echarts省级地图*/
/*省级地图数据*/
function ProMap(){
    ajaxPostPre(getRootPath()+"/map/city",proMapck);
}

/*省级地图数据回调函数*/
function proMapck(result) {
    successFun(result);
};

/*省级地图*/
/*定义全局变量方便销毁dom*/
var chartPro;
function successFun(result){
    //echarts地图省市级别定义
    $.get(getRootPath()+'/js/ssyth/json/sd.json', function (mapJson) {
        //注册可用的地图
        echarts.registerMap('shandong', mapJson);
        disposeChart(chartPro);
        //在id为mainMap的dom元素中显示地图
        chartPro = echarts.init(document.getElementById('pro_map'));
        /*定义一串数组*/
        var ssyth_name =[]; var ssyth_mapx =[];
        var ssyth_mapy =[]; var ssyth_mapscore =[];
        /*取出数组里数据*/
        $.each(result,function(i,data){
            var NAME = data["bareaName"];var MAPX = data["x"];
            var MAPY = data["y"];var MAPSCORE = data["distSroce"];
            ssyth_name.push(NAME);ssyth_mapx.push(MAPX);
            ssyth_mapy.push(MAPY);ssyth_mapscore.push(MAPSCORE);
        });

        /*定义echarts地图数据格式*/
        var proData=[];
        for(i=0;i<ssyth_name.length;i++){
            proData.push(
                {
                    name:ssyth_name[i],
                    value:[ssyth_mapx[i],ssyth_mapy[i],ssyth_mapscore[i]]
                }
            )
        }

        /*省级图表定义*/
        mapOpt(null,proData,'shandong','rgba(0,0,0,0.3)');

        /*定义图表，数据重新载入*/
        chartPro.setOption(option,true);

        $(window).resize(function () {
            if($('#pro_map').is(':visible')){
                chartPro.resize()
            }
        });
        /*点击市，进入市的详细地图*/
        chartPro.on('click', function (result) {
            // clearInterval(proTime);
            disposeChart(chartPro);
            /*17地市名称*/
            selectCity = result.name;
            $('#pro_map').css('display','none');/*隐藏省级*/
            $('#retPro').css('display','block');/*返回按钮*/
            $('#city_map').css('display','block');/*显示市级*/
            /*市级地图显示echarts*/
            mapShow(selectCity,'city_map');

        });
    });
}

/*加载市县级地图以及百度地图*/
function mapShow(selectCityname,ele){
    /*当日业务量*/
    drywl(selectCityname);
    /*当日报错量*/
    drbcl(selectCityname);
    // 终端信息
    zdxx(selectCityname);
    /*业务量排名*/
    ywltb(selectCityname);
    /*报错量排名*/
    bcltb(selectCityname);
    /*饼图*/
    bt(selectCityname);
    gj(selectCityname);
    /*市级地图数据*/
    ajaxPostPre(getRootPath()+'/map/citys',cityDatack,{bareaName:selectCityname});
    /*市级地图回调函数*/
    function cityDatack(result){
        jzqx(result,selectCityname,ele);
    }
}
/*加载市级地图*/
var myChartDistrict;
function jzqx(result,selectCityname,ele){
    disposeChart(myChartDistrict);
    myChartDistrict = echarts.init(document.getElementById(ele));//在id为mainMap的dom元素中显示地图
    var ssyth_name1 =[];var ssyth_mapx1 =[];var ssyth_mapy1 =[];var ssyth_mapscore1 =[];
    $.each(result,function(i,dataBean){
        var NAME = dataBean["bareaName"];var MAPX = dataBean["x"];
        var MAPY = dataBean["y"];var MAPSCORE = dataBean["distSroce"];
        ssyth_name1.push(NAME);ssyth_mapx1.push(MAPX);
        ssyth_mapy1.push(MAPY);ssyth_mapscore1.push(MAPSCORE);
    });
    /*定义echarts地图数据格式*/
    var mydata1=[];
    for(i=0;i<ssyth_name1.length;i++){
        mydata1.push(
            {
                name:ssyth_name1[i],
                value:[ssyth_mapx1[i],ssyth_mapy1[i],ssyth_mapscore1[i]]
            }
        )
    }
    if(selectCityname=='东营市'){selectCitynames='dy'};
    if(selectCityname=='临沂市'){selectCitynames='ly'};
    if(selectCityname=='威海市'){selectCitynames='wh'};
    if(selectCityname=='德州市'){selectCitynames='dz'};
    if(selectCityname=='日照市'){selectCitynames='rz'};
    if(selectCityname=='枣庄市'){selectCitynames='zz'};
    if(selectCityname=='泰安市'){selectCitynames='ta'};
    if(selectCityname=='济南市'){selectCitynames='jn'};
    if(selectCityname=='济宁市'){selectCitynames='jns'};
    if(selectCityname=='淄博市'){selectCitynames='zb'};
    if(selectCityname=='滨州市'){selectCitynames='bz'};
    if(selectCityname=='潍坊市'){selectCitynames='wf'};
    if(selectCityname=='烟台市'){selectCitynames='yt'};
    if(selectCityname=='聊城市'){selectCitynames='lc'};
    if(selectCityname=='莱芜市'){selectCitynames='lw'};
    if(selectCityname=='菏泽市'){selectCitynames='hz'};
    if(selectCityname=='青岛市'){selectCitynames='qd'};
    /*获取市县级的地图json数据*/
    $.get(getRootPath()+'/js/ssyth/json/sd/'+selectCitynames+'.json', function (Districtmap) {

        /*市县级地图的定义*/
        echarts.registerMap(selectCityname, Districtmap);
        /*调用地图配置*/
        $('.cityName').html(selectCityname+'数据总览');
        // mapOpt(selectCityname+'数据总览',mydata1,selectCityname,'rgba(255,255,255,0.1)');
        mapOpt(null,mydata1,selectCityname,'rgba(255,255,255,0.1)');
        /*重置地图加载*/
        myChartDistrict.setOption(option, true);

        $(window).resize(function () {
            if($('#city_map').is(':visible')){
                myChartDistrict.resize()
            }
        });

        myChartDistrict.on('click',function(rel){
            /*模块隐藏显示*/
            $('#pro_map').css('display','none');
            $('#city_map').css('display','none');
            $('#retPro').css('display','none');
            $('#retCity').css('display','block');
            $('#main').css('display','none');
            $('#map_demo').css('display','block');
            if(myChartDistrict != null && myChartDistrict != "" && myChartDistrict != undefined) {
                myChartDistrict.dispose();
            }
            /*调用百度地图，传入市级名称*/
            cityname = rel.name;
            /*百度地图调用函数*/
            baiduMapData(selectCityname,cityname);
        })
    });
}

/*百度地图*/
function baiduMapData(selectCityname,cityname){
    /*地域名称*/
    $('.cityName').html(cityname+'数据总览');
    $('.cityName').attr("city", selectCityname);
    // zdxx(selectCityname+cityname);
    /*中心点坐标，以及区县名称*/
    ajaxPostPre(getRootPath()+"/map/citysx",bdMapCenterCk,{bareaName:cityname});
    function bdMapCenterCk(result){
        baiduMap(result,selectCityname,cityname)
    }
}

/*百度地图参数配置*/
function baiduMap(result,selectCityname,cityname) {
    var zbName = [];
    var zbX=[];
    var zbY=[];
    $.each(result,function(i,data){
        var BAREA_NAME = data["bareaName"];
        var X = data["x"];
        var Y = data["y"];

        zbName.push(BAREA_NAME);
        zbX.push(X);
        zbY.push(Y);
    });

    var map = new BMap.Map("map_demo",{minZoom:8,maxZoom:16});/*地图的最大最小级别*/
    var point = new BMap.Point(zbX,zbY);            // 设置中心点坐标
    map.centerAndZoom(point, 9);                    // 地图级别。
    map.enableScrollWheelZoom();                    // 启用滚轮放大缩小。
    map.enableKeyboard();                           // 启用键盘操作。
    map.addControl(new BMap.NavigationControl());   // 左上角，添加默认缩放平移控件
    //右上角，仅包含平移和缩放按钮
    map.addControl(new BMap.NavigationControl({anchor: BMAP_ANCHOR_TOP_RIGHT, type: BMAP_NAVIGATION_CONTROL_SMALL}));
    /*营业厅的坐标以及分数数据*/
    ajaxPostPre(getRootPath()+"/map/cityx",YytDataCk,{distName:selectCityname+cityname});
    function YytDataCk(result) {
        jzsj(map,result)
    }
}

/*百度地图各营业厅的坐标，分数以及名称*/
function jzsj(map,result) {
    var depart = [];
    var longitude=[];
    var latitude=[];
    var sroce=[];
    var departID = [];
    $.each(result, function (i, data) {
        var DEPART = data["distName"];
        var LONGITUDE = data["longitude"];
        var LATITUDE = data["latitude"];
        var SROCE = data["distSroce"];
        var DEPARTID = data["inId"];
        depart.push(DEPART);
        longitude.push(LONGITUDE);
        latitude.push(LATITUDE);
        sroce.push(SROCE);
        departID.push(DEPARTID);

    });
    /*取数数据*/
    for(i=0;i<depart.length;i++){
        var newpoint = new BMap.Point(longitude[i],latitude[i]);	//设置新的坐标点
        var newlabtitle = depart[i];
        var newlabtitle1 = sroce[i];
        var newdepartID = departID[i];
        var label = new BMap.Label(newlabtitle,{offset:new BMap.Size(10,-18),position:newpoint});  // 创建文本标注对象

        /*bootstrap的lable属性会冲突，需注释bootstrap的style*/
        /*增加标注*/
        label.setStyle({
            color : "black",fontSize : "12px",height : "18px",marginLeft:"-50px",
            fontWeight:"normal",lineHeight:"8px",
            fontFamily:"FangSong",border:"1px",
            borderRadius:'10px',transition:"0.37s",
            background:'transparent',textAlign:"center",
            padding:"5px 10px",cursor: "pointer",zIndex:1
        });
        /*增加监听*/
        label.addEventListener("mouseover", function(){
            this.setStyle({
                background:'rgba(67,138,202,0.7)',color:'white'
            });
        });
        label.addEventListener("mouseout", function(){
            this.setStyle({
                background:'transparent',color:'black'
            });

        });
        /*添加到地图上*/
        map.addOverlay(label);

        var label1 = new BMap.Label(newlabtitle1,{offset:new BMap.Size(10,-18),position:newpoint});  // 创建文本标注对象

        label1.addEventListener("click", function(e){
            window.open("http://10.19.193.135:8080/ssyth/jsp/busi002/busiIndex.jsp?departId="+e.currentTarget.departID+"")
        });

        label1.departID = newdepartID;
        label1.setStyle({
            color : "white",fontSize : "15px",marginLeft:"0px",fontWeight:"normal",lineHeight:"58px",
            fontFamily:"Times New Roman,Georgia,Serif",marginTop:"-70px",paddingTop:"-70px",
            textIndent:"11px",cursor: "pointer",width:"55px",height:"70px",
            background:"url("+getRootPath()+"/images/pingreen.png) 0 0 no-repeat",border:"none",
        });
        if(newlabtitle1<90){
            label1.setStyle({
                background:"url("+getRootPath()+"/images/pinred.png) 0 0 no-repeat"
            });
        }

        if(newlabtitle1.toString().length==5){
            label1.setStyle({
                textIndent:"4px",fontSize : "13px",
            });
        }
        if(newlabtitle1.toString().length==4){
            label1.setStyle({
                textIndent:"7px",
            });
        }
        if(newlabtitle1.toString().length==3){
            label1.setStyle({
                textIndent:"7px",
            });
        }
        if(newlabtitle1.toString().length==1){
            label1.setStyle({
                textIndent:"15px",
            });
        }
        map.addOverlay(label1);
    }
}

/*返回省级地图*/
function goBackProeMap(){
    /*当日业务量*/
    drywl('山东省');
    /*当日报错量*/
    drbcl('山东省');
    // 终端信息
    zdxx();
    gj();
    /*业务量排名*/
    ywltb('山东省');
    /*报错量排名*/
    bcltb('山东省');
    /*饼图*/
    bt('山东省');
    disposeChart(myChartDistrict);
    $('#pro_map').css('display','block');
    $('#city_map').css('display','none');
    $('#retPro').css('display','none');
    ProMap();
    // proTime = setInterval(function(){ProMap();}, 30000)
}

/*返回市级地图*/
function goBackCityMap(){
    $('#retPro').css('display','block');
    $('#pro_map').css('display','none');
    $('#city_map').css('display','block');
    $('#retCity').css('display','none');
    $('#map_demo').css('display','none');
    $('#main').css('display','block');
    disposeChart(myChartDistrict);
    mapShow($('.cityName').attr("city"),'city_map');
    $('.cityName').html('');
}

/*当日业务量*/
function drywl(cityname){
    ajaxPostPre(getRootPath()+"/map/tdywl",drywlCk,{cityName:cityname})
    function drywlCk(result) {

        $('#drywl').html(result);
    }
}

/*当日报错量*/
function drbcl(cityname){
    ajaxPostPre(getRootPath()+"/map/tdbcl",drbclCk,{cityName:cityname});
    function drbclCk(result){
        $('#drbcl').html(result);
    }
}

/*终端信息*/
function zdxx(cityname){
    ajaxPostPre(getRootPath()+"/map/zdxx",zdxxCk,{cityName:cityname});
    function zdxxCk(result){
        $('#zdxx').html(result[0].oll+'/'+result[0].zl);
    }
}

/*告警*/
function gj(cityname){
  $('.mio-scrollNewPar').html('');

  ajaxPostPre(getRootPath()+"/map/gjs",gjCk,{cityName:cityname});
    function gjCk(result){
      /*循环给ul加li*/
      var str = "";
      $('.mio-scrollNewPar').html('<ul class="mio-scrollNews" style="font-size: 10px;position: absolute"></ul>');
      for(i=0;i<result.length;i++){
        str += '<li sz='+result[i].IS_NEW+'>'+result[i].ALARM_CONTENT+'</li>'
        $('.mio-scrollNewPar ul').html(str)
      }
      if($('#pro_map').css('display')=='block'){
        ScrollUl('scrollGj', $('#scrollGj ul li').length, 1000, 200);
      }
      for(i=0;i<$('.mio-scrollNewPar li').length;i++){
        console.log($('.mio-scrollNewPar li').length);
        if($('.mio-scrollNewPar li').eq(i).attr('sz')==1){
          $('.mio-scrollNewPar li').eq(i).css('color','red')
        }
      }
    }

}

/*业务量图表*/
function ywltb(cityname){
    var ywdata = [];
    var ywtime = [];
    ajaxPostPre(getRootPath()+"/map/ywltb",ywltbCk,{cityName:cityname});
    function ywltbCk(result){
        $.each(result,function(i,data){
            var ywsdata = data['busicount'];
            var ywstime = data['time'];

            ywstimes=ywstime.replace(/:00:00/g,"");
            ywdata.push(parseInt(ywsdata));
            ywtime.push(ywstimes);
        });
        splineChart($('#container'),'业务量',ywtime,ywdata);
    }
}

/*报错量图表*/
function bcltb(cityname){
    var bcdata = [];
    var bctime = [];
    ajaxPostPre(getRootPath()+"/map/bcltb",bcltbCk,{cityName:cityname});
    function bcltbCk(result) {
        $.each(result,function(i,data){
            var bcsdata = data['busicount'];
            var bcstime = data['time'];

            bctimes=bcstime.replace(/:00:00/g,"");
            bcdata.push(parseInt(bcsdata));
            bctime.push(bctimes);

        });
        splineChart($('#container1'),'报错量',bctime,bcdata);
    }
}

/*地市业务量排名*/
function dsywpm(){
    ajaxPostPre(getRootPath()+"/map/dsywpm",dsywpmCk);
    function dsywpmCk(result){
      $('#dsywpm').html('');
        $.each(result,function(i,data){
            var NAME = data["cityName"];
            var VALUE = data["busicount"];
            $('#dsywpm').append('<tr><td>'+NAME+'</td><td style="font-family: STXihei">'+VALUE+'</td></tr>');
        });
    }
}

/*地市报错量排名*/
function dsbcpm(){
    ajaxPostPre(getRootPath()+"/map/dsbcpm",dsbcpmCk);
    function dsbcpmCk(result){
        $('#dsbcpm').html('');
        $.each(result,function(i,data){
            var NAME = data["cityName"];
            var VALUE = data["busicount"];
            $('#dsbcpm').append('<tr><td>'+NAME+'</td><td style="font-family: STXihei">'+VALUE+'</td></tr>');
        });
    }
}

/*饼图*/
function bt(cityname){
    var piedata = [];
    ajaxPostPre(getRootPath()+"/map/bt",btCk,{cityName:cityname});
    function btCk(result){
        $.each(result,function(i,data){
            var NAME = data["name"];
            var VALUE = data["busicount"];

            var d1={};
            d1.name=NAME+"["+VALUE+"]";
            d1.y=parseInt(VALUE);

            piedata.push(d1);
            pieChart($('#container3'),piedata);

        });
    }
}

/*搜索定位数据*/
function ssInput(){
    $("#search_text").keyup(function (event) {
            /*只要输入先清空上一次的列表*/
            $('#auto_div').html('');
            var old_value;
            if ($("#search_text").val() != '') {
                old_value = $("#search_text").val();
            } else {
                /*使数据库查询不到数据即可*/
                old_value = 'ddddd'
            }
            ajaxPostPre(getRootPath()+"/map/ss",ssInputCk,{departName:old_value});
            function ssInputCk(result){
                bdata(result);
            }
        }
    );
}

/*搜索列表的设置*/
function bdata(result) {

    var depart1 = [];
    var longitude1 = [];
    var latitude1 = [];
    var area = [];
    var lanName = [];

    $.each(result, function (i, dataBean) {
        var DEPART = dataBean["departName"];
        var LONGITUDE = dataBean["longitude"];
        var LATITUDE = dataBean["latitude"];
        depart1.push(DEPART);
        longitude1.push(LONGITUDE);
        latitude1.push(LATITUDE);
        //搜索框中列表的信息
        $('#auto_div').append('<li style="cursor:pointer" city="' + dataBean.city + '" area="' + dataBean.area + '" ' +
            'cityname="' + dataBean.cityName + '" ' +
            'class="listli" x="' + dataBean.longitude + '" y="' + dataBean.latitude + '">' + dataBean.departName + '</li>')
    });

    $("#auto_div").slideDown(300);//只要输入就显示列表框

    /*添加滚动条及高度,根据li数量判断*/
    if ($('#auto_div li').length > 21) {
        $('#auto_div').css('overflow-y', 'scroll');
        $('#auto_div').height(525);
    } else if($('#auto_div li').length < 5){
        $('#auto_div').css('overflow-y', 'hidden');
        $('#auto_div').css('overflow', 'hidden');
        $('#auto_div').height(0);
        $('#auto_div').height(($('#auto_div li').length) * 30)
    }
    else {
        $('#auto_div').css('overflow-y', 'hidden');
        $('#auto_div').css('overflow', 'hidden');
        $('#auto_div').height(0);
        $('#auto_div').height(($('#auto_div li').length + 5) * 30)
    }

    //模糊匹配，将所有匹配项显示
    for (var i = 0; i < $(".listli").length; i++) {
        if ($(".listli").eq(i).text().indexOf($("#search_text").val()) >= 0) {
            $(".listli").eq(i).css('display', 'block');
        }
    }

    //点击获取所需参数，数据加载到输入框
    $(".listli").click(function () {
        $("#search_text").val($(this).text());
        $("#search_text").attr("x", $(this).attr("x"));
        $("#search_text").attr("y", $(this).attr("y"));
        $("#search_text").attr("cityname", $(this).attr("cityname"));
        $("#search_text").attr("area", $(this).attr("area"));
        $("#search_text").attr("city", $(this).attr("city"));

    });

    /*点击外部隐藏列表框*/
    $('body').click(function (e) {
        var target = $(e.target);
        if(!target.is('#search_text')){
            if($('#auto_div').is(':visible')){
                $('#auto_div').css('display', 'none');
            }
        }

    })

    /*滑入颜色*/
    $(".listli").hover(function () {
        $(this).css('background-color', 'white').css('color', 'black');
    }, function () {
        $(this).css('background-color', 'rgba(0,0,0,0.5)').css('color', 'white');
    });
}

/*点击搜索*/
function ssClick(){
    $('.search-icon').click(function () {
        /*进入百度地图*/
        if ($('.search-input').val().length != 0 && $('.search-input').attr("area") == 'depart') {

            $('#pro_map').css('display', 'none');
            $('#city_map').css('display', 'none');
            $('#retCity').css('display', 'block');
            $('#retPro').css('display', 'none');
            $('#map_demo').css('display', 'block');
            $('#main').css('display', 'none');
            var cityname = $('.search-input').attr("cityname");
            var city = $('.search-input').attr("city");

            /*当日业务量*/
            drywl(cityname);
            /*当日报错量*/
            drbcl(cityname);
            // 终端信息
            zdxx(cityname);
            /*业务量排名*/
            ywltb(cityname);
            /*报错量排名*/
            bcltb(cityname);
            /*饼图*/
            bt(cityname);
            gj(cityname);
            baiduMapData(cityname,city);

        }
        /*市级地图搜索echarts*/
        else if ($('.search-input').val().length != 0 && $('.search-input').attr("area") == 'area') {

            $('.cityName').html('');
            $('#map_demo').css('display', 'none');
            $('#pro_map').css('display', 'none');
            $('#city_map').css('display', 'block');
            $('#main').css('display','block');
            $('#retPro').css('display', 'block');
            $('#retCity').css('display', 'none');
            var cname = $('.search-input').attr("cityname");

            mapShow(cname,'city_map');

        }
    })

}

/*获取焦点时隐藏显示*/
function ssFrameYX(){
    $("#search_text").focus(function () {
        if($('#auto_div li').length==0){
            $('#auto_div').css('border','none')
        }else{
            $('#auto_div').show()
        }
    });
}