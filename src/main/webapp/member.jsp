<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
</head>
<body>
    <h3>회원정보</h3>
    <form action="queryTest" method ="post" > 
        ID : <input type="text" name="id" value="user1"><br>
        PW : <input type="password" name="pwd" value="1111"><br>
        이름 : <input type="text" name="name" value="워싱턴"><br>
        취미 : <!--name 속성이 같으면 같은 그룹이다-->
            <input type="checkbox" name="hobby" value="climbing">등산
            <input type="checkbox" name="hobby" value="sports">운동
            <input type="checkbox" name="hobby" value="reading">독서
            <input type="checkbox" name="hobby" value="traveling">여행<br>

        성별 : 
            <input type="radio" name="gender" value="male"> 남자
            <input type="radio" name="gender" value="female"> 여자<br>

        종교 :
            <select name="religion">
                <option value="Christinity">기독교</option>
                <option value="Buddism">불교</option>
                <option value="Catholicism">천주교</option>
                <option value="Atheism">무교</option>
            </select>
        자기소개<br>
        <textarea name="intro" cols="30" rows="10"></textarea>
        <input type="submit" value="전송하기">
        <input type="reset" value="취소하기">
    </form>



</body>
</html>