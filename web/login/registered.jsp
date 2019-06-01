<%@ page import="com.xzkj.minecraftlogin.UserLogin" %><%--
  Created by IntelliJ IDEA.
  User: 三星
  Date: 2019/5/25
  Time: 6:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MineCraftLogin - 注册</title>
</head>
<body>
<%
    UserLogin login = new UserLogin();
    //设置编码
    //request.setCharacterEncoding("utf-8");
    // UserLogin login = new UserLogin().;
    String name = request.getParameter("name");
    String passWord = request.getParameter("password");
    String gameName = request.getParameter("gamename");
    String qq = request.getParameter("QQ");
    String iP = request.getRemoteAddr();
    String data = login.registerUser(name, passWord, iP, qq, gameName);
    out.println(data);
%>
</body>
</html>
