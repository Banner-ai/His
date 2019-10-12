<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更改药品---2015</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/Js/ckeditor/ckeditor.js"></script>
 

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
    <script type="text/javascript">
    $(function () {       
		$('#backid').click(function(){
				window.location.href="<c:url value='/medicine/index.do'/>";
		 });
    });
    </script>
</head>
<body>
<form action="<c:url value='/medicine/edit.do' />" method="post" class="definewidth m20">
<input type="hidden" name="num" value="${d.drug_num}" />
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">药品编号</td>
        <td><input type="text" name="drug_num" value="${d.drug_num}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">图片</td>
        <td><input type="file" name="drug_url" value="${d.drug_url}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">进价</td>
        <td><input type="text" name="purchas_price" value="${d.purchas_price}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">售价</td>
        <td><input type="text" name="sale_price" value="${d.sale_price}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品名称</td>
        <td><input type="text" name="drug_name" value="${d.drug_name}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">药品类型</td>
        <td><input type="radio" name="drug_type" value="1" checked/>中药
        	&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="drug_type" value="2"/>西药
        	&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="drug_type" value="3"/>处方药
        	&nbsp;&nbsp;&nbsp;
        	<input type="radio" name="drug_type" value="4"/>非处方药
        </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">简单描述</td>
        <td><input type="text" name="simple_detail" value="${d.simple_detail}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">生产日期</td>
        <td><input type="text" name="prodeced_date" value="${d.prodeced_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">过期日期</td>
        <td><input type="text" name="expiration_date" value="${d.expiration_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">保质期</td>
        <td><input type="text" name="quality_date" value="${d.quality_date}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">详细描述</td>
        <td><textarea name="detail" value="${d.detail}"></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">生产厂商</td>
        <td><textarea name="manufacture" value="${d.manufacture}"></textarea></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">服用说明</td>
        <td><input type="text" name="use_infor" value="${d.use_infor}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">总的进货量</td>
        <td><input type="text" name="total_stock" value="${d.total_stock}"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">剩余量</td>
        <td><input type="text" name="surplus" value="${d.surplus}"/></td>
    </tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td><textarea name="noted" value="${d.noted}"></textarea></td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="submit" class="btn btn-primary"  type="button" >保存</button> 
				&nbsp;&nbsp;
				<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>

</body>
</html>