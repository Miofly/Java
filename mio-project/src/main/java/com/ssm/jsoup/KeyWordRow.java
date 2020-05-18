package com.ssm.jsoup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/09/02
 */
public class KeyWordRow {

    public static void main(String[] args) {
        getData();
    }

    public static void getData() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("g://zipCode.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                if (readLine.indexOf("市") != -1) {
                    System.out.println(readLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
