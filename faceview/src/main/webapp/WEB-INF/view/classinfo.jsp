<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<!-- <meta http-equiv="refresh" content="3"> -->
<base href="<%=basePath%>">
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap.css">
<title>Insert title here</title>

<style type="text/css">
	.bian{
		border: white solid 1px;
		text-align: center
	}


</style>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		setInterval(function(){
			$.ajax({
				type:"get",
				url:"http://100.64.135.0:8080/classinfo/classinfo/getClasses",
				success:function(data){
					var json = eval(data);
					var ht = "";
					$('.table tr').not(':first').empty();
					$.each(json,function(index){
						var className = json[index].className;
						var attendanceCnt = json[index].attendanceCnt;
						var seatCnt = json[index].seatCnt;
						var classPercent = (attendanceCnt/seatCnt*100).toFixed(2);
						ht = "<tr class='info' ><td class='bian'>" + className + "</td><td class='bian'>" + classPercent + "%</td><td class='bian'>" + attendanceCnt + "</td><td class='bian'>" + seatCnt + "</td></tr>";
						$('.table tbody').append(ht);
					});
				}
			});
		},5000);
	});


</script>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			 <span class="label">教室入座情况</span>
			<table class="table" >
					<tr class="success">
						<th class="bian">
							教室地点
						</th>
						<th class="bian">
							入座率
						</th>
						<th class="bian">
							已坐人数
						</th>
						<th class="bian">
							座位数
						</th>
					</tr>
					<c:forEach var="classAttendances" items="${requestScope.classAttendances}">
						<tr class="info" >
						<td class="bian">
							${classAttendances.className}
						</td>
						<td class="bian">
						<fmt:formatNumber type="number" value="${classAttendances.attendanceCnt/classAttendances.seatCnt*100 } " maxFractionDigits="2"/>%
						</td>
						<td class="bian">
							${classAttendances.attendanceCnt}
						</td>
						<td class="bian">
							${classAttendances.seatCnt}
						</td>
						</tr>
					</c:forEach>
					
			</table>
		</div>
	</div>
</div>



</body>
</html>