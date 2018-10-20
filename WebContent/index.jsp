<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  action="img/headUpload/15363388874" method="post"  enctype="multipart/form-data">    
  		  选择文件:<input type="file" name="file">    
	    <input type="submit"  value="上传">
	</form>  
	<br><br>
	<form  action="img/delete">   
	    <input type="submit"  value="删除" />
	</form>
	<br><br><br>
	<form action="img/submitShare" method="post"  enctype="multipart/form-data">
		<input type="file" name="file" multiple />
		<input type="text" name="shauid"  value="1"/>
		<input type="text" name="shatext"  value="分享测试"/>
		<input type="submit"  value="上传">
	</form>
	
	<br><br><br>
	<form action="img/submitShareWithoutImg" method="post">
		<input type="text" name="shauid"  value="1"/>
		<input type="text" name="shatext"  value="分享测试"/>
		<input type="submit"  value="上传">
	</form>
	
	<br><br><br>
	<form action="share/giveLove/152473045924/2" method="post">
		点赞测试:<input type="submit"  value="点赞">
	</form>
	
	<br><br><br>
	<form action="comments/subComments" method="post">
		<input type="text" name="cuid"  value="2"/>
		<input type="text" name="cssthhId"  value="152473045924"/>
		<input type="text" name="ctext"  value="评论测试"/>
		评论测试:<input type="submit"  value="评论">
	</form>
</body>
</html>