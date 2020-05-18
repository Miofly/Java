package com.ssm.jsoup.music;

import com.ssm.utils.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/29
 */
public class singerName {
    public static void main(String[] args) {
        getData();
    }

    public static void getData() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("G://singer.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                String mess = readLine.split("\",\"uid")[0].replace("{\"name\":\"", "");
                FileUtils.saveConToFile(mess, "g://singerName.json");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
