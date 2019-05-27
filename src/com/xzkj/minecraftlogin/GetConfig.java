package com.xzkj.minecraftlogin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author 三星
 */
public class GetConfig {

    public String getConfig(String keys, String path){
        try {
            //ini文件的存放位置
            //创建文件输入流
            FileInputStream fis = new FileInputStream(path);
            //创建Properties属性对象用来接收ini文件中的属性
            Properties pps = new Properties();
            //从文件流中加载属性
            pps.load(fis);
            return pps.getProperty(keys);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param keys 属性节点
     * @param key  属性值
     * @param path 配置路径
     */

    public void setConfig(String keys, String key, String path){
        try {
            //ini文件的存放位置
            //创建文件输入流
            FileInputStream fis = new FileInputStream(path);

            //创建Properties属性对象用来接收ini文件中的属性
            Properties pps = new Properties();
            //从文件流中加载属性
            pps.load(fis);
            //加载读取文件流
            FileOutputStream opt = new FileOutputStream(path);
            //通过setProperty(key,value)赋值，会覆盖相同key的值
            pps.setProperty(keys, key);
            //修改值 (必不可少)
            pps.store(opt, null);
            opt.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


/*    public static void main(String[] args) {
        GetConfig getConfig = new GetConfig();
        System.out.println(getConfig.getConfig("username", "H:\\1.ini"));
        getConfig.setConfig("username", "1419158026", "H:\\1.ini");
        System.out.println(getConfig.getConfig("username", "H:\\1.ini"));

    }*/


}
