<%@ page import="com.xzkj.minecraftlogin.*" %>
<%@ page import="com.sun.org.apache.bcel.internal.generic.NEW" %>
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
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/><!--让浏览器选择最新渲染引擎-->
    <meta charset="UTF-8"/>
    <title>Title</title>

</head>
<body>
    <%
        String path = request.getSession().getServletContext().getRealPath("/");
        //UserLogin login = new UserLogin();
        Demo demo = new Demo();
        out.println(path + "</br>");
        out.println(demo.getPath());
    %>
    系统升级中请稍后重试!
</body>
</html>
