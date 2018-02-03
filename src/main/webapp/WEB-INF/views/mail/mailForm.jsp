<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src='<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js" />'></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->

<title> 메일 보내기 </title>
</head>
<body>
<div class="container">
	<h4>메일 보내기</h4>
	<form action="http://localhost:8080/mail/mailSending" method="post">
	<div align="center"><!-- 받는 사람 이메일 -->
		<input type="text" name="tomail" size="120" style="width:100%" placeholder="codud2003@naver.com" class="form-control" >
	</div>
	<div align="center"><!-- 제목 -->
		<input type="text" name="title" size="120" style="width:100%" placeholder="제목을 입력해주세요" class="form-control" >
	</div>
	<p>
	<div align="center"><!-- 내용 -->
		<textarea name="content" cols="268" rows="12" style="width:100% resize:none" placeholder="내용" class="form-control"></textarea>
	</div>
	<p>
	<div align="center">
		<input type="submit" value="메일보내기" class="btn btn-warning">
	</div>	
	</form>
</div>
</body>
</html>