package com.xzkj.minecraftlogin;

import java.sql.Connection;
import java.sql.Statement;

public class UserLogin {

    GetConfig getconfig = new GetConfig();

    private String JDBC_DRIVER = getconfig.getConfig("JDBC_DRIVER", "config/sqlConfig.ini");
    private String DB_URL = getconfig.getConfig("DB_URL", "config/sqlConfig.ini");
    private String USER = getconfig.getConfig("SqlUserName", "config/sqlConfig.ini");
    private String PASS = getconfig.getConfig("SqlUserPassWord", "config/sqlConfig.ini");
    private Connection conn = null;
    private Statement stmt = null;
    private String UserName = "";
    private String UserPWD = "";
    private Connection Conn;
    UserLogin(){
        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("数据库驱动注册成功!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("注册驱动失败!");
        }
    }
    public String getLogin(String Name, String PWD){





        return null;
    }

}
