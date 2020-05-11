package com.ssm.jsoup;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * 功能描述：
 * 调用方式：
 *
 * @author wfd
 * @date 2019/7/28 15:40
 * @return
 */
public class constellation {

    public static void main(String[] args) {
        String[] names = {"白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座", "水瓶座", "双鱼座"};
        String[] names1 = {"白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座", "水瓶座", "双鱼座"};
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names1.length; j++) {
                String url = "http://api.avatardata.cn/XingZuoPeiDui/Lookup?key=86946c4597f24553bf8ab59e1274b61b&xingzuo1=" + names[i] + "&xingzuo2=" + names1[j] + "";

                constellation.getData(url);
            }

        }

    }

    public static void getData(String urls) {
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
            String content = builder.toString().split("result")[1].toString().split(",\"error_code")[0].
                    replace("\":{", "{").replace("\":null", "");
//            String content = builder.toString().split("result")[1].toString()
//                    .split("]")[0].replace("\":[", "").replace("},{", "}\n{");
            System.out.println(content);
            saveArticle(content);
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public static void saveArticle(String content) {
        String lujing = "G:\\syncJgy\\json\\constellation.json"; // 保存到本地的路径和文件名
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
