<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport"> 
<base href="<%=basePath%>">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap.css">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			 <span class="label">文字标签</span>
			<table class="table">
				<thead>
					<tr>
					<th>
							教师地点
						</th>
						<th>
							教师编号
						</th>
						<th>
							刷新时间
						</th>
						<th>
							人数
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>
							北楼
						</td>
						<td>
							208
						</td>
				
						<td>
							2018-5-18
						</td>
						<td>
							2
						</td>
					</tr>
					<tr class="success">
						<td>
							北楼
						</td>
						<td>
							209
						</td>
						<td>
							01/04/2012
						</td>
						<td>
							5
						</td>
						
					</tr>
					<tr class="error">
						<td>
							北楼
						</td>
						<td>
							210
						</td>
						<td>
							02/04/2012
						</td>
						<td>
							1
						</td>
						
					</tr>
					<tr class="warning">
						<td>
							北楼
						</td>
						<td>
							212
						</td>
						<td>
							03/04/2012
						</td>
						<td>
							10
						</td>
						
					</tr>
					<tr class="info">
						<td>
							北楼
						</td>
						<td>
							213
						</td>
						<td>
							04/04/2012
						</td>
						<td>
							15
						</td>
						
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</div>



</body>
</html>