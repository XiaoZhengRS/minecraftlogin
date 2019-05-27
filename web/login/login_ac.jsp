<%@ page import="com.xzkj.minecraftlogin.UserLogin" %>
<%--
  Created by IntelliJ IDEA.
  User: 三星
  Date: 2019/5/24
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //设置编码
        //request.setCharacterEncoding("utf-8");
       // UserLogin login = new UserLogin().;
        String name = request.getParameter("name");
        String passWord = request.getParameter("password");
        String gameName = request.getParameter("gamename");
        String qq = request.getParameter("QQ");
        String iP = request.getRemoteAddr();
        String data = new UserLogin().registerUser(name, passWord, iP, qq, gameName);
        out.println(data);
    %>
    系统升级中!
</body>
</html>
