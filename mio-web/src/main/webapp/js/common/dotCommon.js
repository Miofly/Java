/*基本用法*/
var header={
        logo:"../../images/logo-white.png",
    },
    tmp=doT.template($("#headerTmp").html());//某些浏览器可能会取不到模板内容，可用$("#testTpl").text()
    $('#header').html(tmp(header));//数据渲染

var left=[
    {"url":getRootPath()+"/detail/index","icon":"icon-home","text":"主页","status":""},
    // {"url":getRootPath()+"/user-list","icon":"icon-th-large","text":"图标","status":""},
    {"url":getRootPath()+"/detail/tables","icon":"icon-th-large","text":"软件管理","status":""},
    {"url":getRootPath()+"/detail/sort","icon":"icon-th-large","text":"软件分类","status":""},
];

for(i=0;i<left.length;i++){
    if(pageName()==urlEnd(left[i].url)){
        left[i].status="active";
        tmp=doT.template($("#leftTmp").html());//某些浏览器可能会取不到模板内容，可用$("#testTpl").text()
        $('#left').html(tmp(left));//数据渲染
    }
    else{
        left[i].status="";
        tmp=doT.template($("#leftTmp").html());//某些浏览器可能会取不到模板内容，可用$("#testTpl").text()
        $('#left').html(tmp(left));//数据渲染
    }
}