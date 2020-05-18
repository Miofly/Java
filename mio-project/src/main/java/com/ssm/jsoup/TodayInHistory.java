package com.ssm.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：
 * 调用方式：
 *
 * @author wfd
 * @date 2019/7/28 15:40
 * @return
 */
public class TodayInHistory {

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 32; j++) {
                String urls = "http://api.avatardata.cn/HistoryToday/LookUp?key=4297eca22d6841929680cd97a25d2057&yue=" + i + "&ri=" + j + "&type=1&page=1&rows=50";
                String day = i + "-" + j;
                System.out.println(day);
                TodayInHistory.getData(urls, day);
            }
        }


    }

    public static void getData(String urls, String day) {
        try {
            URL url = new URL(urls);//创建一个URL类的实例，并指定网址
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
            System.out.println(day);
            String content = builder.toString().replace("reason", "day").
                    replace("Succes", day);
            System.out.println(content);

//            String content = builder.toString().split("result")[1].toString()
//                    .split("]")[0].replace("\":[", "").replace("},{", "}\n{");
//            System.out.println(content);
            saveArticle(content);
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public static void saveArticle(String content) {
        String lujing = "G:\\syncJgy\\json\\tool\\his.json"; // 保存到本地的路径和文件名
        File file = new File(lujing);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content + "\n");
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
