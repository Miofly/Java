package com.ssm.jsoup;

import com.alibaba.fastjson.JSON;
import com.ssm.utils.DateUtil;
import com.ssm.utils.FileUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/15
 */
public class jokes {

    public static void main(String[] args) {
//        int j = 1434090000; //
        int j =  1460438392; //
        for (int i = 0; i < 1000; i++) {
            String urls = "http://api.avatardata.cn/Joke/QueryImgByTime?key=9b2de516872848c497b22cfd6bc93d7e&page=2&rows=50&sort=asc&time=" + j + "";
//            String urls = "http://api.avatardata.cn/Joke/QueryImgByTime?key=9ef66faad4e946d2acc5f602bb0a8658&page=2&rows=50&sort=asc&time=" + j + "";
            System.out.println(urls);
            j = j + 1000;
//            System.out.println(j);
            getJokesData(urls);
        }
    }

    public static void getJokesData(String urls) {
        try {
            URL url = new URL(urls); // 创建一个URL类的实例，并指定网址
            URLConnection connection = url.openConnection(); // 创建实例连接指定URL上的内容
            InputStream is = connection.getInputStream(); // 获取内容的字节流
            InputStreamReader isr = new InputStreamReader(is, "utf-8"); // 将字节流包装为字符串流，并制定编码格式为utf-8
            BufferedReader in = new BufferedReader(isr); // 创建一个实例用来存放转换后的字符
            String line; // 定义一个字符串类型变量
            StringBuilder builder = new StringBuilder(); // 创建实例
            while ((line = in.readLine()) != null) {
                builder.append(line + "\n"); // append方法使builder包含line中的所有信息
            }
            in.close(); // 关闭流
            isr.close(); // 关闭流
            is.close(); // 关闭流
            Object obj = JSON.parseObject(builder.toString()).get("result");
            String content = obj.toString().replace("[", "").replace("]", "").replace("},{", "}\n{");
            System.out.println(content);
            FileUtils.saveConToFile(content, "g://jokes" + DateUtil.getDay(new Date()) + ".json");
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

}
