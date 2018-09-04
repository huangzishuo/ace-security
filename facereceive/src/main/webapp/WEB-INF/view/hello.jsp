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
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />  

<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="static/css/swiper.min.css">
      <!-- Demo styles -->
 <link rel="stylesheet" href="static/css/bootstrap.css">
  <style type="text/css">
         *{
           margin: 0;
           padding: 0;
         }
         .swiper-container{
           position: fixed;
           height: 100%;
           width: 100%;
           background: #EEEEEE;
         }
         .slide2 .swiper-slide{
         
             font-size: 1px;
		     height: auto;
		     -webkit-box-sizing: border-box;
		     box-sizing: border-box;
		     padding: 1px;
         }
           .font{font-size:1px}
       </style>

<%-- <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script> --%>
<script>
$(function(){
    $('.hebing1').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing1');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing');//下一个合并的对象
                }
            
            }
               
        }
    });
    
     $('.hebing2').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing2');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing2');//下一个合并的对象
                }
            
            }
               
        }
    });
    
      $('.hebing3').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing3');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing3');//下一个合并的对象
                }
            
            }
               
        }
    });
    
      $('.hebing4').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing4');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing4');//下一个合并的对象
                }
            
            }
               
        }
    });
    
      $('.hebing5').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing5');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing5');//下一个合并的对象
                }
            
            }
               
        }
    });
    
      $('.hebing6').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing6');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing6');//下一个合并的对象
                }
            
            }
               
        }
    });
    
      $('.hebing7').each(function(index, element) {
        if(!$(this).hasClass('hide'))
        {    var next=$(this).parent('tr').next('tr').children('.hebing7');//下一个合并的对象
            $(this).attr('rowspan',1);
            if ($(this).text()!="") {
             while($(this).text()==next.text())
                {
                    $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                    next.hide();
                    next.addClass('hide');
                    next=next.parent('tr').next('tr').children('.hebing7');//下一个合并的对象
                }
            
            }
               
        }
    });
    
});
</script>
</head>
<body>

<div class="swiper-container swiper-container-father">
  <div class="swiper-wrapper">
        <div class="swiper-slide slide2">
	      <div class="swiper-container swiper-container-son">
	        <div class="swiper-wrapper">
				          <div class="swiper-slide"> 
				           	  班级地点：${title}<br>
								<table border="1" class="font">
								        <tr>
								            <th>节次/周次</th>
								            <th>周一</th>
								            <th>周二</th>
								            <th>周三</th>
								            <th>周四</th>
								            <th>周五</th>
								            <th>周六</th>
								            <th>周日</th>
								        </tr>
								        <c:forEach items="${requestScope.courses}" var="course">
								            <tr>
								                <td height="120" width="120">${course.dim0}</td>
								                <td  height="120" width="120" class="hebing1" >${course.dim1}</td>
								                <td height="120" width="120" class="hebing2">${course.dim2}</td>
								                <td height="120" width="120" class="hebing3">${course.dim3}</td>
								                <td height="120" width="120" class="hebing4">${course.dim4}</td>
								                <td height="120" width="120" class="hebing5">${course.dim5}</td>
								                <td height="120" width="120" class="hebing6">${course.dim6}</td>
								                <td height="120" width="120" class="hebing7">${course.dim7}</td>              
								            </tr>
								        </c:forEach>
								    </table>				          
				          </div>
       	  	</div>
      	 </div> 
   </div>
   
 	<div class="swiper-scrollbar"></div>
    <div class="swiper-slide slide2">
	      <div class="swiper-container swiper-container-son">
	        <div class="swiper-wrapper">
				          <div class="swiper-slide">   
				             	班级地点：${title}<br>
							<table border="1" class="font">
							        <tr>
							            <th>节次/周次</th>
							            <th>当日</th>
							      
							        </tr>
							        <c:forEach items="${requestScope.courses}" var="course">
							            <tr>
							                <td height="120" width="120">${course.dim0}</td>
							                <td  height="120" width="1200" class="hebing1" >${course.dim1}</td>
							                          
							            </tr>
							        </c:forEach>
							    </table>				          
				           </div>
       	  	</div>
      	 </div> 
   </div>
   
 	<div class="swiper-scrollbar"></div>
  </div>
  </div> 
  <!-- Swiper JS -->
  <script src="static/js/swiper.min.js"></script>

  <!-- Initialize Swiper -->
  <script>
 
 

  var swiper = new Swiper('.swiper-container-son', {
      direction: 'vertical',
      slidesPerView: 'auto',
      freeMode: true,
      scrollbar: {
        el: '.swiper-scrollbar',
      },
      mousewheel: true,
    });
    
  var swiperSon = new Swiper('.swiper-container-father');
  </script>
</body>
</html>
