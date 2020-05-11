package com.ssm.jsoup;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/16
 */
public class ReadFile {

    public static void main(String[] args) {
        fileOperate();
    }

    public static void fileOperate() {
        FileReader fr = null;
        try {
            List<String> fileList = new ArrayList<>();

            fr = new FileReader(new File("g://movie1000.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                fileList.add(readLine);
            }
            System.out.println(fileList);
            Object obj = JSON.parseObject(String.valueOf(fileList));
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
