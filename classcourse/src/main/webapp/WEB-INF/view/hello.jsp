<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
 <link rel="stylesheet" href="static/css/loader.css">
      <!-- Demo styles -->
  <style type="text/css">
 		 @media only screen and (min-width: 241px){
		    html {
		        font-size: 15px;
		    }
		}
 		@media only screen and (min-width: 321px){
		    html {
		        font-size: 20px;
		    }
		}
		@media only screen and (min-width: 401px){
		    html {
		        font-size: 25px;
		    }
		}
		@media only screen and (min-width: 428px){
		    html {
		        font-size: 26.75px;
		    }
		}
		@media only screen and (min-width: 481px){
		    html {
		        font-size: 30px; 
		    }
		}
		@media only screen and (min-width: 569px){
		    html {
		        font-size: 35px; 
		    }
		}
		@media only screen and (min-width: 641px){
		    html {
		        font-size: 40px; 
		    }
		}
		@media only screen and (min-width: 721px){
		    html {
		        font-size: 45px; 
		    }
		}
		@media only screen and (min-width: 801px){
		    html {
		        font-size: 50px; 
		    }
		}
		@media only screen and (min-width: 881px){
		    html {
		        font-size: 55px; 
		    }
		}
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
             font-size: 12px;
		     height: auto;
		     -webkit-box-sizing: border-box;
		     box-sizing: border-box;
		     padding: 1px;
         }
         .font{
         	word-wrap: break-word; 
         	word-break: normal;
           	font-size:0.45rem;
           	height: 100%;
           	width: 100%;  
           	border-collapse: collapse;
           	margin-top: 3rem;          	      
         }
         .fonts{
         	word-wrap: break-word; 
         	word-break: normal;
           	font-size:0.6rem;
           	height: 100%;
           	width: 100%;  
           	border-collapse: collapse;
         }
         .tdcss{
         	 width:12%;
	         height:2rem;
	         border: white solid 1px;	
	         text-align: center         
         }
         .tdcs{
         	 width:32%;
	         height:2rem;
	         border: white solid 1px;	
	         text-align: center         
         }
         .table-striped>tbody>tr:nth-of-type(odd){
         	 background-color:#E8F3FF
         }
         .table-stripede>tbody>tr:nth-of-type(even){
         	 background-color:#E8F3FF
         }
         
       </style>

<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
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
      
      $('.hebing8').each(function(index, element) {
          if(!$(this).hasClass('hide'))
          {    var next=$(this).parent('tr').next('tr').children('.hebing8');//下一个合并的对象
              $(this).attr('rowspan',1);
              if ($(this).text()!="") {
               while($(this).text()==next.text())
                  {
                      $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                      next.hide();
                      next.addClass('hide');
                      next=next.parent('tr').next('tr').children('.hebing8');//下一个合并的对象
                  }
              
              }
                 
          }
      });
      $('.hebing9').each(function(index, element) {
          if(!$(this).hasClass('hide'))
          {    var next=$(this).parent('tr').next('tr').children('.hebing9');//下一个合并的对象
              $(this).attr('rowspan',1);
              if ($(this).text()!="") {
               while($(this).text()==next.text())
                  {
                      $(this).attr('rowspan',parseInt($(this).attr('rowspan'))+1);
                      next.hide();
                      next.addClass('hide');
                      next=next.parent('tr').next('tr').children('.hebing9');//下一个合并的对象
                  }
              
              }
                 
          }
      });
      
});
</script>
</head>
<body>
<div id="loader-wrapper">
    <div id="loader"></div>
    <div class="loader-section section-left"></div>
    <div class="loader-section section-right"></div>
    <div class="load_title">正在加载课程</div>
</div>

<div class="swiper-container swiper-container-father">
  <div class="swiper-wrapper">
        <div class="swiper-slide slide2">
	      <div class="swiper-container swiper-container-son">
	        <div class="swiper-wrapper">
				          <div class="swiper-slide">				           
				          	    <div style="width:100%;position: relative"> 	
				          	    
					          	    <div style="width: 5rem;float:left">			          	    
						           		<div style="position: relative; background-image:url(static/img/20180514142350.png);background-size: 100% 100%;height: 1.6rem">
												<div style="font-weight: 900;font-size: 0.5rem;position: relative;width: 5rem;margin-top: 0.5rem;margin-left: 2.1rem;padding-top: 0.55rem">
												   	${requestScope.title }
												</div>																			
										</div>
										<div style="height:0.5rem;background-image:url(static/img/20180514142346.png);background-size: 100% 100%;position: relative;margin-top: 0.2rem">
					           	   				<div style="font-size: 0.3rem;color: white;text-align: center;line-height: 0.5rem">${requestScope.term }</div>				           					
					           	   		</div>	
						           	</div>
						           		
						           	<div style="float:right;position: relative;width: 7rem;margin-top:1.35rem">
						           			<div style="background-color:#939CA6;color: white;float: left;display: inline;height:1.5rem;width:6.6rem">
						           				<div style="font-size: 0.3rem;line-height: 0.5rem;padding-left: 0.5rem">
							           				${requestScope.telphone[0] }
						           				</div>	
						           				<div style="font-size: 0.3rem;;line-height: 0.5rem;padding-left: 0.5rem">
							           				${requestScope.telphone[1] }
						           				</div>
						           				<div style="font-size: 0.3rem;line-height: 0.5rem;padding-left: 0.5rem">
							           				${requestScope.telphone[2] }
						           				</div>						           				
						           			</div>
						           			<div style="width:0.2rem;background-color:black;display: inline;color: white;height:1.5rem;float:right"></div>					           			
						           	</div>
					           							           									           				           			
				              </div>
				           	    	
				           			           						           		
								<table class="font table-striped table-stripede table-stripe">
								        <tr style="background-color: #EFEFEF">
								            <th style="background-image:url(static/img/20180514141554.png);background-size: 100% 100%;padding-left: 0.7rem;color: white">节<br>次</th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周一</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周二</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周三</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周四</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周五</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141546.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周六</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141546.png);background-size: 100% 88%;margin-top: 21%"><div style="text-align: center;padding-top: 28%;color: white">周日</div></div></th>
								        </tr>
								        <c:forEach items="${requestScope.courses}" var="course">
								            <tr>
								                <td style="width:12%;height:7.5%;border-left: #838383 solid 1px;font-size:0.8rem;text-align: center;border:white solid 1px">${course.dim0}</td>
								                <td class="hebing1 tdcss">${course.dim1}</td>
								                <td class="hebing2 tdcss">${course.dim2}</td>
								                <td class="hebing3 tdcss">${course.dim3}</td>
								                <td class="hebing4 tdcss">${course.dim4}</td>
								                <td class="hebing5 tdcss">${course.dim5}</td>
								                <td class="hebing6 tdcss">${course.dim6}</td>
								                <td style="border-right: #838383 solid 1px" class="hebing7 tdcss">${course.dim7}</td>              
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
				           <div style="width:100%;position: relative"> 	
				          	    
					          	    <div style="width: 5rem;float:left;position: relative">			          	    
						           		<div style="position: relative; background-image:url(static/img/20180514142350.png);background-size: 100% 100%;height: 1.6rem">
												<div style="font-weight: 900;font-size: 0.5rem;position: relative;width: 5rem;margin-top: 0.5rem;margin-left: 2.1rem;padding-top: 0.55rem">
												   	${requestScope.title }
												</div>																			
										</div>
										<div style="height:0.5rem;background-image:url(static/img/20180514142346.png);background-size: 100% 100%;position: relative;margin-top: 0.2rem">
					           	   				<div style="font-size: 0.3rem;color: white;text-align: center;line-height: 0.5rem">${requestScope.term }</div>				           					
					           	   		</div>	
						           	</div>
						           		
						           	<div style="float:right;position: relative;width: 7rem;margin-top:1.35rem">
						           			<div style="background-color:#939CA6;color: white;float: left;display: inline;height:1.5rem;width:6.6rem">
						           				<div style="font-size: 0.3rem;padding-left: 0.5rem;line-height: 0.5rem">
							           				${requestScope.telphone[0] }
						           				</div>	
						           				<div style="font-size: 0.3rem;padding-left: 0.5rem;line-height: 0.5rem">
							           				${requestScope.telphone[1] }
						           				</div>
						           				<div style="font-size: 0.3rem;padding-left: 0.5rem;line-height: 0.5rem">
							           				${requestScope.telphone[2] }
						           				</div>						           				
						           			</div>
						           			<div style="width:0.2rem;background-color:black;display: inline;color: white;height:1.5rem;float:right"></div>					           			
						           	</div>
					           							           									           				           			
				              </div>
				           	    	
								<table class="fonts table-striped table-stripede table-stripe">
								        <tr style="background-color: #EFEFEF">
								            <th style="background-image:url(static/img/20180514141554.png);background-size: 100% 100%;padding-left: 0.9rem;color: white">节<br>次</th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 13%"><div style="text-align: center;padding-top: 12%;color: white">${requestScope.date }</div></div></th>
								            <th style="height: 7%"><div style="height:100%;background-image:url(static/img/20180514141543.png);background-size: 100% 88%;margin-top: 13%"><div style="text-align: center;padding-top: 12%;color: white">任课教师</div></div></th>
								        </tr>
								        <c:forEach items="${requestScope.lists}" var="list">
								            <tr>
								                <td style="width:12%;height:7.5%;border-left: #838383 solid 1px;font-size:0.8rem;text-align: center;border:white solid 1px">${list[0]}</td>
								                <td class="hebing8 tdcs">${fn:substringBefore(list[1]," ")}</td>
								                <td class="hebing9 tdcs">${fn:substringAfter(list[1]," ")}</td>
								            </tr>
								        </c:forEach>
								    </table>
				          </div> 
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
  
  <script type="text/javascript">
  $(document).ready(function(){
	  // 等待所有加载
	  $(window).load(function(){
	      $('body').addClass('loaded');
	      
	      setTimeout(function(){
		        $('#loader-wrapper .load_title').remove();
		      },800);

	  }); 
  });
  
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
