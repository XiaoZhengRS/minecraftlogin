<%--
  Created by IntelliJ IDEA.
  User: 三星
  Date: 2019/5/23
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<!--https://github.com/XiaoZhengRS/minecraftlogin.git-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en,zh">
<head>
    <title>Minecraft - Login</title>
    <!--让浏览器选择最新渲染引擎-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta charset="UTF-8"/>
    <meta name="Keywords" content="Minecraft,Loign"/>
    <meta name="Description" content="Minecraft-Login是由小正独立开发的一款我的世界登录系统,此系统附件皮肤站服务器外置商城官网公告等等"/>
    <link href="css/normalize.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/index.css"/>
    <script src="JavaScript/Framework/jquery-3.4.1.min.js"></script>
    <script src="JavaScript/Framework/vue.js"></script>
    <script src="JavaScript/vue/index-main.js"></script>
    <script src="JavaScript/jquery/index-main.js"></script>
    <style>
        * {
            padding: 0;
            margin: 0;
            font: 16px Helvetica Neue, Helvetica, Arial, Microsoft Yahei, Hiragino Sans GB, Heiti SC, WenQuanYi Micro Hei,
            sans-serif;
            text-decoration: none;

        }

        #home-title0 {
            color: azure;
            font-weight: 900;
            font-size: 64px;
            position: absolute;
            left: 28%;
            top: 250px;
        }

        #home-title1 {
            color: azure;
            font-weight: 900;
            font-size: 52px;
            position: absolute;
            left: 38%;
            top: 450px;
        }
    </style>
</head>
<body>
<div id="top-head">
    <ul>
        <li><a href="index.jsp">Minecraft - Login</a></li>
        <li class="top-head-li-0"><a href="index.jsp">公告</a></li>
        <li><a href="index.jsp">皮肤</a></li>
        <li><a href="index.jsp">加入群聊</a></li>
        <li><a href="index.jsp">关于</a></li>
    </ul>
</div>
<div id="top-home">
    <div id="home-title0">我的世界 - 次世代 - 登录系统</div>
    <div id="home-title1">Minecraft - Login</div>
</div>
<br>
<div>
    <form action="login/login_ac.jsp" method="post">
        <div>用户名:</div>
        <input type="text" name="UserName"/><br>
        <div>用户密码:</div>
        <input type="password" name="UserPWD"/>
        <input type="submit" value="登录"/>
    </form>

</div>

</body>
</html>
