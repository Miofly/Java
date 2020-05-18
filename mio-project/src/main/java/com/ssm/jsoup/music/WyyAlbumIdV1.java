package com.ssm.jsoup.music;

import com.alibaba.fastjson.JSONObject;
import com.ssm.utils.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/27
 */
public class WyyAlbumIdV1 {

    public static void main(String[] args) {

        readFile();
    }

    public static void readFile() {
        try {
            FileReader fr = new FileReader(new File("g://singerAlbum.json"));
            BufferedReader br = new BufferedReader(fr);
            String laststr = "";
            String tempString = null;
            while ((tempString = br.readLine()) != null) {
                JSONObject json = JSONObject.parseObject(tempString);
                System.out.println(json.get("albumId").toString());
                FileUtils.saveConToFile(json.get("albumId").toString(), "g://ablumId.json");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getData(String url) {
        System.out.println(url);

        Document doc = null;
        try {
            doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")
                    .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                    .header("Accept-Encoding", "gzip, deflate, br")
                    .header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8")
                    .header("Cookie", "ntes_nnid=6c5b87bd25a17a9fd9692580e5c94f78,1565912650142; _ntes_nuid=6c5b87bd25a17a9fd9692580e5c94f78; _iuqxldmzr_=32; WM_TID=LDdg6Rcj9ENEBRFUUFc4pPF4%2B6vTAn2G; WM_NI=R9FV8%2B3KZYFzFTyT7isTQivbb2VLf%2FzcQWAi%2BQdwZbxir0FYRR17q5zGEaYaTxwuyNrXXwr8kuNyRC2wcdeCeCAMWeyd1e8YJR%2FyJPg1kc3dMwiiFWuGVyQtxssnI3kBT04%3D; WM_NIKE=9ca17ae2e6ffcda170e2e6eed1cf4eacb8bb8ac641899e8fb3c85b928f8e84f333a7939790c14f8a90fdd3d92af0fea7c3b92a92e78ab7bb21f19596bac572868cb7b5b663b18c9f8af56aa2ee9aade525babd9fb8c463e98fac98d96abcb7bed1c553928effd8f43fba998b82dc6b98a8b996fc46b2889898f134a9ab829ad149f2a9ad85e849a79d8faed66fbbbcff86bb538a8ee19ac95ca5efa584b2708fa9a78ac55db7999a9ad480bcadbd8fcc39a99e9cd1b737e2a3; JSESSIONID-WYYY=yBXBK%2FIFCVHGtcBTi3%5CSUeDQMvfzApFAMBZzlZ%2BENNt7n2f9j2SCTvBRQpFACIc5EnGK3%2BtFhTQJWOhtCkJvHZ8olJ83RYG8Exukhj6Ftzw%2FBwylje03bjPW4Vl9IXXOHeNIRWxO4%2BKndGOJ0HjhnNZJtoESJht8PfF%2FfzAVXh6kOWiq%3A1566909226292")
                    .header("Referer", "https://music.163.com/discover/artist/cat?id=1001&initial=65")
                    .header("Upgrade-Insecure-Requests", "1")
                    .method(Connection.Method.GET)
                    .timeout(200000).get();

            String singer = doc.title().replace(" - 网易云音乐", "");

            Elements names = doc.select("#m-song-module li a.s-fc0");

            for (Element element : names) {

                String mess = "{\"singer\":" + "\"" + singer + "\"," +
                        "\"albumName\":" + "\"" + element.text() + "\"," +
                        "\"albumId\":" + "\"" + element.attr("href").
                        replace("/album?id=", "").trim() + "\"}";
                System.out.println(mess);
                FileUtils.saveConToFile(mess, "g://singerAlbum.json");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
