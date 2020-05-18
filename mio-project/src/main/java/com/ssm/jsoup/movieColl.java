package com.ssm.jsoup;

import com.ssm.utils.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 功能描述：
 * 调用方式：
 *
 * @author wfd
 * @date 2019/7/28 15:40
 * @return
 */
public class movieColl {


//    public Document getDocument(String url) {
//        try {
//            //5000是设置连接超时时间，单位ms
//            return Jsoup.connect(url).timeout(10000).get();
//        } catch (IOException e) {
//            e.printStackTrace();
//            continue;
//        }
//        return null;
//    }


    public static void main(String[] args) {
//        int[] ids = {11110, 121, 3121}; // 11110 m3u8 kuyun === 121 kuyun  ====  3121 kuyun m3u8
//        for (int i = 0; i < ids.length; i++) {
//            String url = "http://www.okzyw.com/?m=vod-detail-id-" + ids[i] + ".html";
//            getMess(url);
//        }
//        String url = "http://www.okzyw.com/?m=vod-detail-id-" + 38 + ".html";
//        getMess(url);
        for (int i = 39000; i <= 44000; i++) {
            String url = "http://www.okzyw.com/?m=vod-detail-id-" + i + ".html";
            getMess(url);
        }
    }

    public static void getMess(String url) {
        System.out.println(url);
        Document doc = null;
        try {
            doc = Jsoup.connect(url).timeout(5000).get();
            // 名称
            if (doc.title().contains("国内写真") || doc.title().contains("Beautylegbb")) {
                System.out.println("不是所需资源");
            } else {
                String title = doc.title().replace("剧情介绍--OK资源采集-最新影视资源大全", "").trim().replace("\"", "").replace("\\", "");
                // 导演
                Elements zy = doc.select(".vodinfobox ul li:eq(1) span");
                // 主演
                Elements yy = doc.select(".vodinfobox ul li:eq(2) span");
                // 类型
                Elements lx = doc.select(".vodinfobox ul li:eq(3) span");
                // 地区
                Elements area = doc.select(".vodinfobox ul li:eq(4) span");
                // 语言
                Elements lang = doc.select(".vodinfobox ul li:eq(5) span");
                // 上映
                Elements syTime = doc.select(".vodinfobox ul li:eq(6) span");
                // 片长
                Elements duration = doc.select(".vodinfobox ul li:eq(7) span");
                String durationText;
                if (duration.text().equals("0")) {
                    durationText = "";
                } else {
                    durationText = duration.text();
                }
                // 剧情介绍
                Elements desc = doc.select(".vodplayinfo:eq(1)");
                // 主题图
                Elements img = doc.select(".lazy");
                String imgText = img.attr("src");
                // id
                Elements id = doc.select("dd a:eq(2)");
                String uid = id.attr("href").split("id-")[1].replace(".html", "");


                Elements e1s = doc.select("#1 ul li");
                Elements e2s = doc.select("#2 ul li");


                String kuyuns1 = "";
                String m3u8s1 = "";
                String kuyuns2 = "";
                String m3u8s2 = "";
                for (Element element : e1s) {
                    if (element.text().indexOf(".m3u8") == -1) {
                        kuyuns1 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                    } else {
                        m3u8s1 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                    }
                }

                for (Element element : e2s) {
                    if (element.text().indexOf(".m3u8") == -1) {
                        kuyuns2 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                    } else {
                        m3u8s2 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                    }
                }

                String mess = "";
                // 只有kuyun播放
                if (m3u8s1.equals("") && kuyuns2.equals("") && m3u8s2.equals("") && !kuyuns1.equals("")) {
                    mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title + "\"" + ","
                            + "\"actor\":" + "\"" + yy.text().replace("\"", "") + "\"" + "," + "\"type\":" +
                            "\"" + lx.text() + "\"" + ","
                            + "\"syTime\":" + "\"" + syTime.text() + "\"" + ","
                            + "\"duration\":" + "\"" + durationText  + "\"" + ","
                            + "\"desc\":" + "\"" + desc.text().replace("\\", "").replace("\"", "").replace("想观看我们的往期作品？想提前知道我们的制片计划？关注我们的公众平台<拉风字幕组>吧！", "") + "\"" + ","
                            + "\"img\":" + "\"" + imgText + "\"" + ","
                            + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"kuyun\":" + "[" + kuyuns1 + "]" + ","
                            + "\"m3u8\":" + "[" + m3u8s1 + "]}";
                }
                // 只有m3u8播放
                if (!m3u8s1.equals("") && kuyuns2.equals("") && m3u8s2.equals("") && kuyuns1.equals("")) {
                    mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title + "\"" + ","
                            + "\"actor\":" + "\"" + yy.text().replace("\"", "") + "\"" + "," + "\"type\":" +
                            "\"" + lx.text() + "\"" + ","
                            + "\"syTime\":" + "\"" + syTime.text() + "\"" + ","
                            + "\"duration\":" + "\"" + durationText  + "\"" + ","
                            + "\"desc\":" + "\"" + desc.text().replace("\\", "").replace("\"", "").replace("想观看我们的往期作品？想提前知道我们的制片计划？关注我们的公众平台<拉风字幕组>吧！", "") + "\"" + ","
                            + "\"img\":" + "\"" + imgText + "\"" + ","
                            + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"kuyun\":" + "[" + kuyuns2 + "]" + ","
                            + "\"m3u8\":" + "[" + m3u8s1 + "]}";
                }
                // m3u8在前 kuyun在后
                if (kuyuns1.equals("") && m3u8s2.equals("") && !m3u8s1.equals("") && !kuyuns2.equals("")) {
                    mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title + "\"" + ","
                            + "\"actor\":" + "\"" + yy.text().replace("\"", "") + "\"" + "," + "\"type\":" +
                            "\"" + lx.text() + "\"" + ","
                            + "\"syTime\":" + "\"" + syTime.text() + "\"" + ","
                            + "\"duration\":" + "\"" + durationText  + "\"" + ","
                            + "\"desc\":" + "\"" + desc.text().replace("\\", "").replace("\"", "").replace("想观看我们的往期作品？想提前知道我们的制片计划？关注我们的公众平台<拉风字幕组>吧！", "") + "\"" + ","
                            + "\"img\":" + "\"" + imgText + "\"" + ","
                            + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"kuyun\":" + "[" + kuyuns2 + "]" + ","
                            + "\"m3u8\":" + "[" + m3u8s1 + "]}";
                }
                // kuyun在前 m3u8在后
                if (m3u8s1.equals("") && kuyuns2.equals("") && !kuyuns1.equals("") && !m3u8s2.equals("")) {
                    mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title + "\"" + ","
                            + "\"actor\":" + "\"" + yy.text().replace("\"", "") + "\"" + "," + "\"type\":" +
                            "\"" + lx.text() + "\"" + ","
                            + "\"syTime\":" + "\"" + syTime.text() + "\"" + ","
                            + "\"duration\":" + "\"" + durationText  + "\"" + ","
                            + "\"desc\":" + "\"" + desc.text().replace("\\", "").replace("\"", "").replace("想观看我们的往期作品？想提前知道我们的制片计划？关注我们的公众平台<拉风字幕组>吧！", "") + "\"" + ","
                            + "\"img\":" + "\"" + imgText + "\"" + ","
                            + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"kuyun\":" + "[" + kuyuns1 + "]" + ","
                            + "\"m3u8\":" + "[" + m3u8s2 + "]}";
                }

                mess = mess.replace(",]}", "]}").replace("},],", "}],");
                System.out.println(mess);

                saveArticle(mess);
            }


        } catch (Exception e) {
//            e.printStackTrace();

        }

    }

    public static void saveArticle(String content) {
        String lujing = "G:\\movie" + DateUtil.getDay(new Date()) + ".json"; // 保存到本地的路径和文件名
//        String lujing = "G:\\movie" + "40000" + ".json"; // 保存到本地的路径和文件名
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
