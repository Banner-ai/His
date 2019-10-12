<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/common.js"></script>

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<form action="<c:url value='/Role/edit.do'/>" method="post" class="definewidth m20" >
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">角色名称</td>
        <td><input type="text" name="title" value="管理员"/></td>
    </tr>
    <tr>
        <td class="tableleft">状态</td>
        <td>
            <input type="radio" name="status" value="1" checked /> 启用
           <input type="radio" name="status" value="0"  /> 禁用
        </td>
    </tr>
    <tr>
        <td class="tableleft">权限</td>
        <td>
		<ul><label class='checkbox inline'><input type='checkbox' checked name='group[]' value='' />挂号信息管理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox'  checked name='group[]' value='' />门诊医生管理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />药品管理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />住院办理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />收费项目登记</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />在院发药</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />住院结算</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' checked  name='group[]' value='' />月营业额统计</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />年营业额统计</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />用户管理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />角色管理</label></ul> 
                <ul><label class='checkbox inline'><input type='checkbox' name='group[]' value='' />资源管理</label></ul> 
		</td>
    </tr>
    <tr>
        <td class="tableleft"></td>
        <td>
            <button type="submit" class="btn btn-primary" type="button">更新</button> 
            &nbsp;&nbsp;
            <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
        </td>
    </tr>
</table>
</form>
                                                                                            
</body>
</html>
<script>
    $(function () {
        $(':checkbox[name="group[]"]').click(function () {
            $(':checkbox', $(this).closest('li')).prop('checked', this.checked);
        });

		$('#backid').click(function(){
				window.location.href="<c:url value='/Role/index.do'/>";
		 });

    });
</script>