package com.ssm.jsoup.musics;

import com.ssm.utils.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/29
 */
public class songSrc {


    public static void main(String[] args) throws UnsupportedEncodingException {
        readFile();
    }

    public static void readFile() {
        FileReader fr = null;
        try {
            fr = new FileReader(new File("G:\\newJson\\songKeyNew.json"));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                getData("http://mp34.butterfly.mopaasapp.com/?v=" + readLine + "");
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
            Elements src = doc.select("#audio");
            Elements title = doc.select(".pname a:eq(1)");

            String singer = title.text().split("-")[0].trim().replace("\"", "").replace("\\", "");
            String songName = title.text().split("-")[1].trim().replace("\"", "").replace("\\", "");
            String songSrc = src.attr("src");
            String mess =
                    "{\"singer\":\"" + singer + "\"," +
                            "\"songName\":\"" + songName + "\"," +
                            "\"songSrc\":\"" + songSrc + "\"}";
            System.out.println(mess);


            FileUtils.saveConToFile(mess, "g://songEnd.json ");
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

}
