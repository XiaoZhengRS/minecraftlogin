<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %><%--
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

        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/minecraftlogin";
        String USER = "root";
        String PASS = "510082QQ";
        Connection conn = null;
        Statement stmt = null;

        try {
            try {
                Class.forName(JDBC_DRIVER);//注册驱动
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //打开连接
            DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    %>
    系统升级中!
</body>
</html>
