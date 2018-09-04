<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>

<html>
<head> 
<meta charset="UTF-8"> 
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport"> 
<meta content="yes" name="apple-mobile-web-app-capable"> 
<meta content="black" name="apple-mobile-web-app-status-bar-style"> 
<meta content="telephone=no" name="format-detection">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">

 <link rel="stylesheet" href="static/css/swiper.min.css">
 <link rel="stylesheet" href="static/css/bootstrap.min.css">
      <!-- Demo styles -->
  <style type="text/css">
	.bian{
		border: white solid 1px;
		text-align: center
	}
  </style>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var date = new Date();
	var time = date.toLocaleString();
	$(".time").append("<div>当前时间:"+ time +"</div>");
	setInterval(function(){
		var date = new Date();
		var time = date.toLocaleString();
		$(".time div").remove();
		$(".time").append("<div>当前时间:"+ time +"</div>");
	},1000);
	
	setInterval(function(){
		$.ajax({
			type:"get",
			url:"/faceview/classinfo/getClassInfoAjax",
			success:function(data){
				var json = eval(data);
				var ht = "";
				$('.table tr').not(':first').empty();
				$.each(json,function(index){
					var className = json[index].className;
					var seatCnt = json[index].seatCnt;
					var attendanceCnt = json[index].attendanceCnt;
					if(index == 0 || index%5 == 0){
						ht += "<tr class='info' >";
					}
					ht += "<td class='bian'>" + className + "</td><td class='bian'>" + attendanceCnt + "/0/" + seatCnt + "</td>";
					if((index+1) == 5 || (index+1)%5 == 0){
						ht+= "</tr>";
					}
				});
				$('.table tbody').append(ht);
			}
		});
	},300000);
}); 
</script>
</head>
<body>
<div class="time" style="font-weight: 900;text-align: center;font-size: 25px;"></div>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			 <span class="label">教室入座情况</span>
			<table class="table" >
					<tr class="success">
						<th class="bian">
							教室
						</th>
						<th class="bian">
							教室当前状态
						</th>
						<th class="bian">
							教室
						</th>
						<th class="bian">
							教室当前状态
						</th>
						<th class="bian">
							教室
						</th>
						<th class="bian">
							教室当前状态
						</th>
						<th class="bian">
							教室
						</th>
						<th class="bian">
							教室当前状态
						</th>
						<th class="bian">
							教室
						</th>
						<th class="bian">
							教室当前状态
						</th>
					</tr>
					<c:forEach var="classAttendance" items="${requestScope.classAttendances}" varStatus="status">
						<c:if test="${status.count eq 1 || (status.count-1)%5 eq 0}">
							<tr class="info" >
						</c:if>
							<td class="bian">
								${classAttendance.className }
							</td>
							<td class="bian">
								${classAttendance.attendanceCnt }/0/${classAttendance.seatCnt }
							</td>
						<c:if test="${status.count eq 5 || status.count%5 eq 0 }">
							</tr>
						</c:if>
					</c:forEach>
					
			</table>
		</div>
	</div>
</div>
 
</body>
</html>
