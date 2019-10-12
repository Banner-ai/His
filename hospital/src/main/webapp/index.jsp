<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  <title>xx市第二人民医院信息管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
	
</head>
<body>
<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">程小凤</span>
	
	<a href="/chinapost/index.php?m=Public&a=logout" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">医院管理系统</div></li>

		</ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">
    </ul>
</div>
<script type="text/javascript" src="assets/js/jquery-1.6.js"></script>
<script type="text/javascript" src="assets/js/bui.js"></script>
<script type="text/javascript" src="assets/js/common/main-min.js"></script>
<script type="text/javascript" src="assets/js/config-min.js"></script>
<script>
	
    BUI.use('common/main',function(){
        var config = [
			{id:'1',menu:[
				
		{text:'快速通道',items:[
		
		{id:'2',text:'挂号信息管理',href:'${pageContext.request.contextPath}/registration/index.do'},
		{id:'3',text:'门诊医生管理',href:'${pageContext.request.contextPath}/doctor/index.do'},
		{id:'4',text:'药品管理',href:'${pageContext.request.contextPath}/medicine/index.do'},
		{id:'5',text:'住院办理',href:'${pageContext.request.contextPath}/hospital/index.do'},
		{id:'6',text:'收费项目登记',href:'${pageContext.request.contextPath}/hospital/charge.do'},
		{id:'7',text:'在院发药',href:'${pageContext.request.contextPath}/hospital/dispensing.do'},
		{id:'8',text:'住院结算',href:'${pageContext.request.contextPath}/hospital/account.do'},
		
		<c:choose>
			<c:when test="${r.role_name == '系统管理员' }" >
		
				{id:'9',text:'月营业额统计',href:''},
				{id:'10',text:'年营业额统计',href:''},
			
				{id:'11',text:'用户管理',href:'${pageContext.request.contextPath}/User/index.do'},
				{id:'12',text:'角色管理',href:'${pageContext.request.contextPath}/Role/index.do'},
				{id:'13',text:'资源管理',href:'${pageContext.request.contextPath}/resource/index.do'},
				{id:'14',text:'密码设置',href:'${pageContext.request.contextPath}/password/index.do'}
			</c:when>
			<c:when test="${r.role_name == '院长' }">
				{id:'9',text:'月营业额统计',href:''},
				{id:'10',text:'年营业额统计',href:''},
		
			</c:when>
		</c:choose>
		
		
		]}

			
			]}
		
		];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
                                                                                            
</body>
</html>