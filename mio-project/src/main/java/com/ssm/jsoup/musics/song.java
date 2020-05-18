package com.ssm.jsoup.musics;

import com.ssm.utils.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URLEncoder;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/29
 */
public class song {


    public static void main(String[] args) throws UnsupportedEncodingException {
//        String singer = java.net.URLEncoder.encode("HYEONON", "utf-8");
//        getData("http://mp34.butterfly.mopaasapp.com/?mp3=" + singer + "&p=0");

        readFile();
    }

    public static void readFile() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("G://singerNum.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                String singer = readLine;
                String singerName = singer.split(",num")[0].replace("singerName:", "");
                int singerNum = Integer.parseInt(singer.split("num:")[1]);

                if (singerNum == 1) {
                    String mess = "http://mp34.butterfly.mopaasapp.com/?mp3=" + URLEncoder.encode(singerName, "UTF-8") +
                            "&p=" + singerNum + "";
                    System.out.println(mess);
                    getData(mess);
                } else {
                    for (int i = 1; i <= singerNum; i++) {
                        String mess = "http://mp34.butterfly.mopaasapp.com/?mp3=" + URLEncoder.encode(singerName, "UTF-8") +
                                "&p=" + i + "";
                        System.out.println(mess);
                        getData(mess);

                    }
                }

            }
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }

    public static void getData(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                    .header("Accept-Encoding", "gzip, deflate")
                    .header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8")
                    .header("Cookie", "__51cke__=; __tins__18968191=%7B%22sid%22%3A%201567088750884%2C%20%22vd%22%3A%2024%2C%20%22expires%22%3A%201567092012341%7D; __51laig__=24")
//                    .header("Referer", "https://music.163.com/discover/artist/cat?id=1001&initial=65")
                    .header("Upgrade-Insecure-Requests", "1")
                    .header("Host", "mp34.butterfly.mopaasapp.com")
                    .method(Connection.Method.GET)
                    .timeout(200000).get();
            Elements ele = doc.select("#wlsong ul li a");
            Elements num = doc.select(".main div:eq(1) a");
            for (Element element : ele) {

                String mess = element.attr("onclick").toString().split("','")[1].replace("');", "");
                System.out.println(mess);

                FileUtils.saveConToFile(mess, "g://songKey.json ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
