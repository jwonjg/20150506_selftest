<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<h1>회원가입 화면</h1>
<form action="form" method="post" >
	<table border="1">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td>직업</td>
			<td>
				<select name="job">
					<option value="회사원" selected="selected">회사원</option>
					<option value="자영업">자영업</option>
					<option value="학생">학생</option>
					<option value="무직">무직</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" value="남자" checked="checked">남자&nbsp;
			    <input type="radio" name="gender" value="여자">여자
		    </td>
		</tr>
		<tr>
			<td>자기소개</td>
			<td>
				<textarea name="desc" rows="5" cols="40" placeholder="자기소개를 해주세요"></textarea>
			</td>
		</tr>
	</table>
	<input type="submit" value="회원가입">&nbsp;
	<input type="reset" value="취소">
</form>
</html>