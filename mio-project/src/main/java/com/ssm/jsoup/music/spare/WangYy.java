package com.ssm.jsoup.music.spare;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/27
 */
public class WangYy {


    public static void main(String[] args) {
        int[] type = {1001, 1002, 1003, 2001, 2002, 2003, 6001, 6002, 6003, 7001, 7002, 7003, 4001, 4002, 4003};
        int[] enName = {-1, 0, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

//        for (int i = 0; i < type.length; i++) {
//
//            for (int j = 0; j < enName.length; j++) {
//                String url = "https://music.163.com/discover/artist/cat?id=" + type[i] + "&initial=" + enName[j] + "";
//                getData(url);
//
//            }
//        }
        getData("https://music.163.com/discover/artist/cat?id=1001&initial=-1");
    }

    public static void getData(String url) {
        System.out.println(url);

        Document doc = null;
        try {
            Map<String, String> header = new HashMap<String, String>();
            header.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.80 Safari/537.36");
            header.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3");
            header.put("Accept-Encoding", "gzip, deflate, br");
            header.put("Accept-Language", "zh-CN,zh;q=0.9");
            header.put("Cookie", "_iuqxldmzr_=32; _ntes_nnid=ccf17511fde984cb2ff670b19fd93bff,1566885875767; _ntes_nuid=ccf17511fde984cb2ff670b19fd93bff; WM_NI=qWBOcTUNogL65jadasa6gJO%2BWBhqaKeuYji%2BL9jeiHFIWEIBSzTlFaCKnegWz1IpHl9Mm0hbuQy6mP8OOflZRrGQWkHd39WLpY3Uim8OXLey4jdiI16oFRCVmkXJX7KHdHQ%3D; WM_NIKE=9ca17ae2e6ffcda170e2e6eed1b34893bbb88ef97de9928bb7c85f929e9eaab780a397889bb453f3bde5b5b22af0fea7c3b92ab3898eb0e2609792a188cf3ef7b6af85e479a3eaa9abce21959ea892e441a7ab978bec2190e7a686ec44869799a6cc4a91a69c8dc56b8195a286e65dbaef8791cb68fb93a3d1eb6ab78fb7d7f05cfc918187ef5292ae89b2d6618cbcfddad648b487fdb6ec67fc9198ade873f8b6ac8acc3bf6b18ab3c25eafb598abdb3d8998aca9d437e2a3; WM_TID=jvtTFBYiV3hBURRFVVdopOYHmxcwd6Xz; JSESSIONID-WYYY=pE9owK7t2u%2BTGsfeePpK%2BBFKHMh%5C9n3IAahfWPRX7unOVKW3qo9n9sROB1AJzY2toH0VquZtebWYZf%5CFMPHJu5fOJUUwvw0FRnSVfe1m1eu%2BWVw4jdE3m%5CN%2FxMX%5ClX7MVztorVyJoUjOqBaZklvVCW140fzpPVCZdqsweG9l8JWhFQJh%3A1566896380997");
            header.put("Upgrade-Insecure-Requests", "1");


            Connection connect = Jsoup.connect(url);
            Connection data = connect.data(header);
            Document document = data.get();

            System.out.println(document.html());


//            Elements name1 = document.select("#m-artist-box li a.s-fc0");
//
//            for (Element element : name1) {
//
//                String mess = "{\"name\":" + "\"" + element.text() + "\"," +
//                        "\"uid\":" + "\"" + element.attr("href").
//                        replace("/artist?id=", "").trim() + "\"}";
//
//                System.out.println(mess);
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
