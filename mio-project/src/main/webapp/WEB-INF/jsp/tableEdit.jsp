<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
    <%@include file="common.jsp"%>
    <style>
        .mio-lable{width: 110px;display: inline;float: left;text-align: right;line-height: 40px;margin-right: 5px}
        .mio-lable label{display: block}
        .mio-lableinp{display: inline;float: left}
    </style>
</head>
<body>
    <form id="editTreeById" class="mio-yyframe" action="/user/editTreeById" style="position: relative;width: 900px;margin: 30px auto;padding: 30px">
        <div style="display: inline">
            <div>
                <div class="mio-lable">
                    <label>id：</label>
                </div>
                <div class="mio-lableinp" >
                        <input type="text" class="mio-inp " placeholder="请输入" name="mioLeftListCustom.id" value="${mioLeftListCustom.id}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>

                <div class="mio-lable">
                    <label>父id：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text"  class="mio-inp" placeholder="请输入" name="mioLeftListCustom.parentId" value="${mioLeftListCustom.parentId}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
            </div>

            <div style="margin-top: 10px;float: left">
                <div class="mio-lable">
                    <label>名称：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text"  class="mio-inp" placeholder="请输入" name="mioLeftListCustom.name" value="${mioLeftListCustom.name}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
                <div class="mio-lable">
                    <label>是否为父节点：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text"  class="mio-inp" placeholder="请输入" name="mioLeftListCustom.isParent" value="${mioLeftListCustom.isParent}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
            </div>

            <div style="margin-top: 10px;float: left">
                <div class="mio-lable">
                    <label>状态：</label>
                </div>
                <div class="mio-lableinp">
                    <select class="selectBox" name="mioLeftListCustom.status" value="${mioLeftListCustom.status}"
                            style="width: 262px;margin-left: -2px" data-placeholder="请选择">
                        <option value="">请选择</option>
                        <c:forEach items="${tests}" var="infos">
                            <option value="${infos.dictcode}">${infos.info}</option>
                        </c:forEach>
                    </select>
                </div>
                <%--<div class="mio-lableinp">
                    <input type="text"  class="mio-inp" placeholder="请输入" "/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>--%>
                <div class="mio-lable" style="margin-right: 7px">
                    <label>地址：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text"  class="mio-inp" placeholder="请输入" name="mioLeftListCustom.url" value="${mioLeftListCustom.url}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
            </div>

            <div style="margin-top: 10px;float: left">
                <div class="mio-lable">
                    <label>创建时间：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text" readonly disabled class="mio-inp createtime" placeholder="请输入"  name="mioLeftListCustom.created" value="${mioLeftListCustom.created}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
                <div class="mio-lable">
                    <label>更新时间：</label>
                </div>
                <div class="mio-lableinp">
                    <input type="text"  class="mio-inp updatetime" placeholder="请输入"  name="mioLeftListCustom.updated" value="${mioLeftListCustom.updated}"/>
                    <span class="glyphicon glyphicon-remove small mio-remove"></span>
                </div>
            </div>


        </div>


        <div style="position: absolute;bottom: 110px;left: 400px">
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-undo" style="color: white;margin-right: -23px"></i>
                <input style="width: 60px;padding-left: 15px" type="reset" value="重置"  class="mio-btn-blue">
            </div>
            <div style="float: left;margin-left: 10px;margin-top:5px">
                <i class="fa fa-save" style="color: white;margin-right: -23px"></i>
                <input onclick="edittree()" style="width: 60px;padding-left: 15px;" type="button" value="保存"  class="mio-btn-blue">
            </div>
        </div>

    </form>
    <script>
        /*边框阴影*/
        inputBorder($('.mio-inp'));



        $('.selectBox').on('change', function(e, params) {

        });
        /*清除内容*/
        remove($('#t1'));
        remove($('#t2'));
        selectChosen($('.selectBox'));
        $('.createtime').val(todate($('.createtime').val(), "-", true));
        $('.updatetime').val(todate($('.updatetime').val(), "-", true));

        function edittree(){
            jquerySubByFId('editTreeById',callback,null,'json');
        }
        function callback(result){
            console.log(result);
            mntip(result.commonResultInfo.message,'info');
            if (result.commonResultInfo.message == '操作成功') {
                setTimeout(function(){
                    window.CloseOwnerWindow();/*关闭有父页面的窗口*/

                }, 1500);
            }

        }
        console.log($('.selectBox').val());
        console.log($('.chosen-container .chosen-single span').html());
        if($('.selectBox').attr('value')==0){
            $('.chosen-container .chosen-single span').html('禁用');
        }
        if($('.selectBox').attr('value')==1){
            $('.chosen-container .chosen-single span').html('使用');
        }
    </script>
</body>
</html>
