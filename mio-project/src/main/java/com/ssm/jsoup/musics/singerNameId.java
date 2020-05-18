package com.ssm.jsoup.musics;

import com.ssm.utils.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/29
 */
public class singerNameId {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("G://singerName.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                String singer = java.net.URLEncoder.encode(readLine, "utf-8");
                getData("http://mp34.butterfly.mopaasapp.com/?mp3=" + singer + "&p=0", singer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getData(String url, String singerName) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).timeout(200000).get();
            Elements ele = doc.select("#wlsong ul li a");
            Elements num = doc.select(".main div:eq(1) a");
            if (!num.text().replace("共", "").replace("页", "").equals("0")) {
                String singer = java.net.URLDecoder.decode(singerName, "utf-8");
                String mess = "singerName:" + singer + "," + "num:" + num.text().replace("共", "").replace("页", "");
                System.out.println(mess);
                FileUtils.saveConToFile(mess, "g://singerNum.json");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
