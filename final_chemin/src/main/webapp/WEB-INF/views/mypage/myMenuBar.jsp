<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<c:set var="path" value="<%=request.getContextPath()%>"/>

    
	<!-- 마이페이지 css-->
    <link rel="stylesheet" type="text/css" href="${path}/resources/base/css/mypage.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    
    
    
	<div class="mypage">
		<h2 class="text-center nanumFont" style="color:white">마이페이지 </h2>
	</div>
		
	
	<div class="container">
		<div class="row">
			
				<div class="col-md-12">
					<hr>
						<ul class="nav justify-content-center">
						     <li class="nav-item">
		                        <strong><a class="nav-link mypageAtag" href="${path }/mypage/myMember.do">회원 정보   </a></strong>
		                      </li>
		                      <li class="nav-item">
		                        <strong><a class="nav-link mypageAtag" href="${path }/mypage/myOrderList.do">주문 목록   </a></strong>
		                      </li>
		                      <li class="nav-item">
		                           <strong><a class="nav-link mypageAtag" href="${path }/mypage/myWishList.do">찜 목록</a></strong>
		                      </li>
		                      <li class="nav-item">
		                        <strong><a class="nav-link mypageAtag" href="${path }/mypage/myBoardList.do">게시글 관리</a></strong>
		                      </li>
						    <li class="nav-item">
						   		<strong><a class="nav-link mypageAtag" href="${path }/mypage/myPlaceList.do?plaStatus=N">장소 등록 내역</a></strong>
						    </li>
						  </ul>
						  <hr>
				</div>
			</div>	
		</div>