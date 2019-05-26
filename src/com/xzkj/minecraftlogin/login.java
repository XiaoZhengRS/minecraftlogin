package com.xzkj.minecraftlogin;

import java.sql.*;

/*CREATE TABLE `minecraftlogin`.`Untitled`  (
        `id` int(11) NOT NULL,
        `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `userpassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        `gamename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
        PRIMARY KEY (`id`) USING BTREE
        ) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;*/


public class login {

    private String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String DB_URL =
            "jdbc:mysql://localhost:3306/minecraftlogin?" +
                    "useSSL=false&serverTimezone=UTC";
    private String USER = "root";
    private String PASS = "510082qq@";
    private Connection conn = null;
    private Statement stmt = null;
    private String UserName = "";
    private String UserPWD = "";
    private Connection Conn;

    public void getLogin() {
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("数据库驱动注册成功!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("注册驱动失败!");
        }
        try {
            //连接Mysql
            System.out.println("开始连接数据库!");
            Conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("数据库连接成功!");
            //发送执行SQL
            //stmt = Conn.createStatement();

            //数据库名 user

            //增
            String sql = "INSERT INTO userdate " +
                    "(id, username, userpassword, ip, qq, gamename) " +
                    "VALUES " +
                    "(null , 'xzkj', 'xzkj', '0.0.0.0', '1419158026', 'xzkj')";
            //改
            //String sql = "update user set userpassword='xzkj' where id=0";
            //删
            //String sql = "delete from user where id=0";
            //查
            //String sql = "";
            PreparedStatement pstmt = Conn.prepareStatement(sql);
            int sqlcount = pstmt.executeUpdate();
            //int sqlcount = stmt.executeUpdate(sql);    //增删改
            //int sqlcount = stmt.executeQuery(sql);     //查
            if (sqlcount > 0) {
                System.out.println("执行数据添加成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败!");
        }
    }

    public static void main(String[] args) {
        login login = new login();
        login.getLogin();
    }
}
