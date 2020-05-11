package com.ssm.controller;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class tst {
    public static void main(String [] args)
    {
        try
        {
            //url地址
            URL url = new URL("https://blog.csdn.net/qq_39795685/article/details/84147398");
            //建立一个连接
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = null;
            if(urlConnection instanceof HttpURLConnection)
            {
                //对象向下转型
                connection = (HttpURLConnection) urlConnection;
            }
            else
            {
                System.out.println("请输入 URL 地址");
                return;
            }
            //建立一个读取流从连接中读取
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(),"gbk"));

            BufferedWriter wr=new BufferedWriter( new OutputStreamWriter(new FileOutputStream("a.txt"),"gbk"));
            String urlString = "";
            String current;
            //如果有数据就一致读
            while((current = in.readLine()) != null)
            {
                urlString += current;
                //每读一行写一行到文本中
                wr.write(current);
                wr.newLine();
                wr.flush();
            }
            System.out.println(urlString);

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}