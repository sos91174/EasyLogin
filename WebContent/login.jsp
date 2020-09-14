<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>


	<form action="info" method="GET">
	Name: <input type="text" name="username">
	
	<br />
	password: <input type="text" name="password" />
	<input type="submit" value="Submit" />
	</form>
	
	<br />
	<br />
	<br />
	
	
	
	<form action="info1" method="GET">
	你喜歡哪裡: 
	日本<input type="checkbox" name="Japan" value="1">
	韓國<input type="checkbox" name="Koera" value="2">
	 英國<input type="checkbox" name="UK" value="3">
	 <input type="submit" value="Submit" >
	 </form>
	 
	 
	<form action="info" method="post" name="test"> 
	測試: 
	你好<input type="text" name="name"><br>
	
	 <input type="Submit" value="送出">
	 </form>
	



</body>
</html>