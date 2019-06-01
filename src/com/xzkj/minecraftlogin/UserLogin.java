package com.xzkj.minecraftlogin;

import java.sql.*;

public class UserLogin {

    GetConfig getconfig = new GetConfig();
    private String pathsql = "H:\\JavaWebJsp\\MinecraftLogin\\web\\config\\sqlConfig.ini";
    private String JDBC_DRIVER = getconfig.getConfig("JDBC_DRIVER", pathsql);
    private String DB_URL = getconfig.getConfig("DB_URL", pathsql);
    private String USER = getconfig.getConfig("SqlUserName", pathsql);
    private String PASS = getconfig.getConfig("SqlUserPassWord", pathsql);
    private Connection conn = null;
    private Statement stmt = null;
    private String UserName = "";
    private String UserPWD = "";
    private Connection Conn;
    public UserLogin(){
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("数据库驱动注册成功!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("注册驱动失败!");
        }
    }
    //登录账号
    public String getLogin(String Name, String PWD){





        return null;
    }
    //注册账号
    public String registerUser(String Name, String PWD, String ip, String qq, String gamename){
        if (!isUser(Name)){
            return "已经存在该用户!";
        }



        String sql = "INSERT INTO userdata " +
                "(id, username, userpassword, ip, qq, gamename) " +
                "VALUES " +
                "(null ," +
                //用户名
                " '"+ Name+ "'," +
                //用户密码
                " '"+ PWD +"'," +
                //用户IP
                " '"+ ip +"'," +
                //用户QQ
                " '"+ qq +"'," +
                //游戏iD
                " '"+ gamename +"')";
        try {
            //连接Mysql
            System.out.println("开始连接数据库!");
            Conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("数据库连接成功!");
            PreparedStatement pstmt = Conn.prepareStatement(sql);

            int sqlcount = pstmt.executeUpdate();
            if (sqlcount > 0) {
                return "用户注册成功!请登录";
            }
        } catch (SQLException e) {
            e.printStackTrace();
                return  "数据库连接失败!";
        }
        return null;
    }
    //判断用户是否存在
    public Boolean isUser(String userName) {

        ResultSet rs = null;
        System.out.println("开始连接数据库!");
        try {
            Conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("数据库连接成功!");
            //2.获取Statement
            Statement statement = Conn.createStatement();
            //3.准备Sql
            String sql = "SELECT * FROM userdata WHERE username = " + "'" + userName + "'";
            //4.执行查询，得到ResultSet
            rs = statement.executeQuery(sql);
            rs.last();
            if (rs.getRow() > 0) {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return true;
    }

        public static void main (String[]args){
            UserLogin login = new UserLogin();
            System.out.println(login.registerUser("xzkj", "xzkj123", "0.0.0.0", "1419158026", "xzkj"));
        }

    }
