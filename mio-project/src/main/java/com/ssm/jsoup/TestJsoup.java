package com.ssm.jsoup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import com.ssm.utils.DateUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 功能描述：
 * 调用方式：
 *
 * @author wfd
 * @date 2019/7/28 15:40
 * @return
 */
public class TestJsoup {


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
//        int[] ids = {6, 9, 10, 12, 23, 25, 26, 30, 64, 86, 106, 107, 152, 167, 198, 200, 215, 227, 233, 237, 290, 295, 317, 329, 348, 390, 393, 401, 433, 444, 458, 465, 484, 522, 523, 536, 539, 544, 545, 570, 575, 596, 602, 604, 605, 606, 608, 617, 618, 625, 636, 642, 647, 658, 664, 667, 689, 695, 710, 721, 745, 785, 821, 830, 833, 834, 836, 844, 862, 864, 866, 867, 869, 871, 874, 876, 877, 881, 907, 912, 926, 930, 935, 938, 964, 974, 992, 999, 1020, 1021, 1028, 1032, 1036, 1039, 1064, 1081, 1091, 1101, 1111, 1118, 1137, 1144, 1147, 1148, 1151, 1152, 1160, 1173, 1174, 1182, 1187, 1204, 1205, 1209, 1218, 1220, 1235, 1247, 1248, 1269, 1270, 1284, 1286, 1292, 1295, 1320, 1325, 1352, 1360, 1377, 1380, 1387, 1393, 1395, 1397, 1399, 1400, 1404, 1414, 1440, 1466, 1486, 1498, 1500, 1506, 1534, 1550, 1556, 1557, 1558, 1559, 1560, 1561, 1562, 1572, 1586, 1609, 1629, 1654, 1664, 1676, 1677, 1688, 1712, 1776, 1794, 1819, 1826, 1848, 1852, 1884, 1918, 1921, 1928, 1929, 1945, 1946, 1951, 1960, 1982, 1983, 1984, 1996, 2010, 2017, 2020, 2057, 2065, 2068, 2074, 2095, 2099, 2113, 2116, 2119, 2128, 2141, 2143, 2144, 2145, 2158, 2186, 2202, 2212, 2222, 2229, 2235, 2240, 2256, 2259, 2260, 2261, 2274, 2275, 2276, 2282, 2301, 2314, 2315, 2369, 2375, 2389, 2390, 2394, 2418, 2421, 2422, 2424, 2427, 2437, 2443, 2464, 2481, 2482, 2483, 2484, 2485, 2486, 2487, 2488, 2489, 2490, 2491, 2492, 2493, 2494, 2495, 2496, 2498, 2504, 2509, 2510, 2523, 2529, 2530, 2531, 2533, 2536, 2537, 2538, 2541, 2579, 2618, 2622, 2646, 2655, 2661, 2667, 2709, 2726, 2729, 2738, 2745, 2750, 2751, 2754, 2766, 2781, 2803, 2826, 2842, 2845, 2852, 2860, 2861, 2863, 2871, 2896, 2906, 2912, 2917, 2949, 2953, 2957, 2958, 2959, 2963, 2974, 2989, 2991, 3002, 3050, 3060, 3062, 3064, 3069, 3074, 3104, 3138, 3140, 3141, 3145, 3146, 3163, 3164, 3165, 3171, 3178, 3200, 3219, 3220, 3246, 3276, 3279, 3310, 3311, 3383, 3415, 3416, 3464, 3513, 3514, 3531, 3594, 3604, 3614, 3619, 3620, 3638, 3647, 3648, 3661, 3663, 3668, 3677, 3678, 3694, 3700, 3721, 3726, 3736, 3741, 3749, 3778, 3783, 3799, 3805, 3819, 3824, 3843, 3845, 3870, 3871, 3889, 3912, 3914, 3955, 3971, 3976, 3979, 3986, 4000, 4018, 4024, 4030, 4031, 4058, 4059, 4062, 4079, 4141, 4162, 4174, 4179, 4180, 4185, 4186, 4188, 4261, 4289, 4324, 4336, 4343, 4344, 4350, 4382, 4432, 4478, 4487, 4497, 4514, 4516, 4566, 4592, 4626, 4630, 4634, 4637, 4638, 4640, 4641, 4642, 4646, 4648, 4655, 4665, 4668, 4693, 4694, 4705, 4707, 4767, 4784, 4787, 4790, 4791, 4803, 4804, 4805, 4806, 4807, 4808, 4809, 4810, 4811, 4812, 4813, 4814, 4815, 4816, 4817, 4818, 4819, 4848, 4856, 4868, 4870, 4880, 4881, 4882, 4883, 4884, 4885, 4887, 4896, 4904, 4910, 4923, 4927, 4932, 4936, 4950, 4974, 4984, 5002, 5008, 5021, 5026, 5037, 5038, 5039, 5045, 5060, 5061, 5075, 5078, 5086, 5089, 5092, 5093, 5094, 5095, 5097, 5105, 5112, 5117, 5123, 5125, 5133, 5153, 5178, 5204, 5210, 5215, 5229, 5232, 5237, 5239, 5262, 5274, 5295, 5318, 5333, 5338, 5358, 5359, 5364, 5366, 5408, 5411, 5423, 5456, 5461, 5500, 5501, 5503, 5563, 5565, 5571, 5582, 5584, 5587, 5588, 5594, 5609, 5660, 5671, 5690, 5713, 5792, 5798, 5839, 5840, 5841, 5853, 5869, 5871, 5877, 5907, 5910, 5911, 5960, 5967, 6003, 6010, 6011, 6019, 6054, 6060, 6122, 6156, 6272, 6296, 6351, 6356, 6379, 6407, 6409, 6431, 6438, 6439, 6456, 6508, 6512, 6522, 6525, 6552, 6557, 6573, 6576, 6578, 6579, 6580, 6583, 6595, 6614, 6620, 6637, 6640, 6667, 6674, 6675, 6678, 6682, 6690, 6695, 6696, 6697, 6698, 6699, 6700, 6715, 6716, 6719, 6749, 6760, 6766, 6811, 6834, 6876, 6878, 6885, 6893, 6913, 6921, 6925, 6965, 6979, 7043, 7101, 7127, 7157, 7173, 7192, 7196, 7219, 7225, 7226, 7227, 7231, 7251, 7256, 7258, 7301, 7302, 7321, 7346, 7347, 7364, 7380, 7381, 7427, 7474, 7492, 7499, 7553, 7638, 7711, 7713, 7715, 7717, 7748, 7749, 7754, 7755, 7775, 7777, 7783, 7795, 7796, 7822, 7851, 7854, 7857, 7864, 7907, 7911, 7914, 7926, 7995, 8001, 8021, 8023, 8024, 8025, 8063, 8064, 8084, 8094, 8141, 8191, 8217, 8257, 8262, 8265, 8272, 8330, 8406, 8418, 8420, 8421, 8422, 8493, 8502, 8503, 8559, 8585, 8606, 8615, 8619, 8645, 8650, 8666, 8684, 8687, 8699, 8723, 8727, 8728, 8731, 8743, 8826, 8847, 8856, 8857, 8968, 8973, 8991, 9076, 9077, 9086, 9103, 9111, 9139, 9144, 9186, 9200, 9235, 9253, 9273, 9298, 9345, 9347, 9353, 9441, 9442, 9443, 9444, 9485, 9489, 9494, 9501, 9503, 9521, 9534, 9576, 9632, 9650, 9679, 9689, 9724, 9740, 9762, 9770, 9853, 9909, 9951, 9982, 9992, 10017, 10049, 10101, 10144, 10207, 10215, 10239, 10241, 10257, 10267, 10290, 10294, 10317, 10360, 10427, 10507, 10552, 10627, 10671, 10688, 10689, 10690, 10735, 10743, 10806, 10845, 10846, 10867, 10868, 10888, 10891, 10930, 10942, 10953, 10954, 10965, 11021, 11041, 11100, 11111, 11142, 11204, 11323, 11334, 11342, 15034, 15064, 15078, 15148, 15221, 15259, 15281, 15309, 15423, 15535, 15585, 15588, 15620, 15817, 15835, 15839, 15919, 15925, 16068, 16158, 16349, 16435, 16532, 16556, 16569, 16684, 16694, 16750, 16773, 16818, 16819, 16822, 16911, 16962, 16964, 16965, 16966, 16971, 16972, 17091, 17112, 17186, 17204, 17211, 17453, 17454, 17465, 17533, 17614, 17698, 17716, 17735, 17862, 17871, 17892, 17893, 17897, 17907, 18009, 18034, 18138, 18210, 18244, 18294, 18336, 18349, 18359, 18416, 18480, 18488, 18491, 18581, 18593, 18632, 18639, 18759, 18763, 18780, 18826, 18867, 18868, 18872, 18874, 18876, 18915, 18935, 18986, 18997, 19011, 19053, 19100, 19103, 19117, 19123, 19252, 19260, 19268, 19357, 19391, 19470, 19519, 19617, 19627, 19635, 19638, 19738, 19750, 19779, 19797, 19809, 19869, 19878, 19983, 19986, 19998, 25042, 25050, 25091, 25097, 25100, 25101, 25102, 25103, 25104, 25105, 25106, 25107, 25108, 25109, 25110, 25217, 25218, 25238, 25242, 25248, 25251, 25254, 25258, 25276, 25321, 25357, 25437, 25549, 25559, 25586, 25601, 25613, 25614, 25667, 25709, 25730, 25732, 25758, 25771, 25782, 25796, 25818, 25821, 25926, 25928, 25932, 26003, 26024, 26038, 26076, 26095, 26126, 26264, 26286, 26508, 26526, 26528, 26600, 26619, 26704, 26705, 26749, 26800, 26837, 26838, 26841, 26985, 27074, 27084, 27099, 27200, 27215, 27223, 27338};
//        for (int i = 0; i < ids.length; i++) {
//            String url = "http://www.okzyw.com/?m=vod-detail-id-" + ids[i] + ".html";
//            getMess(url);
//        }
//        String url = "http://www.okzyw.com/?m=vod-detail-id-" + 38 + ".html";
//        getMess(url);
        for (int i = 35000; i < 40000; i++) {
            String url = "http://www.okzyw.com/?m=vod-detail-id-" + i + ".html";
            getMess(url);
        }
    }

    public static void getMess(String url) {
        System.out.println(url);
        Document doc = null;
        try {
            doc = Jsoup.connect(url).timeout(200000).get();
            // 名称
            String title = doc.title().replace("剧情介绍--OK资源采集-最新影视资源大全", "").trim().replace("\"", "").replace("\\", "");
            // 类型
            Elements lx = doc.select(".vodinfobox ul li:eq(3) span");
            // 类型
            Elements yy = doc.select(".vodinfobox ul li:eq(2) span");
            // 类型
            Elements area = doc.select(".vodinfobox ul li:eq(4) span");
            // 语言
            Elements lang = doc.select(".vodinfobox ul li:eq(5) span");
            // id
            Elements id = doc.select("dd a:eq(2)");
            String uid = id.attr("href").split("id-")[1].replace(".html", "");


            Elements e1s = doc.select("#1 ul li");

            String s1 = "";
            String s2 = "";
            for (Element element : e1s) {
                if (element.text().indexOf(".m3u8") == -1) {
                    s1 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                }
            }

            Elements e2s = doc.select("#2 ul li");
            for (Element element : e2s) {
                if (element.text().indexOf(".m3u8") == -1) {
                    s2 += "{\"name\":" + "\"" + element.text().replace("$", "\",\"url\":\"") + "\"},";
                }
            }
            String mess = "";

            if (s1.equals("")) {
                mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title.replace("\\", "").replace("\"", "") + "\"" + ","
                        + "\"actor\":" + "\"" + yy.text().replace("\\", "").replace("\"", "") + "\"" + "," + "\"type\":" +
                        "\"" + lx.text() + "\"" + ","
                        + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"data\":"
                        + "[" + s2 + "]}";
                mess = mess.replace(",]}", "]}");
                System.out.println(mess);
            }
            if (s2.equals("")) {
                mess = "{\"_id\":" + "\"" + uid + "\"" + "," + "\"id\":" + uid + "," + "\"title\":" + "\"" + title.replace("\\", "").replace("\"", "") + "\"" + ","
                        + "\"actor\":" + "\"" + yy.text().replace("\\", "").replace("\"", "") + "\"" + "," + "\"type\":" +
                        "\"" + lx.text() + "\"" + ","
                        + "\"lang\":" + "\"" + lang.text() + "\"" + "," + "\"data\":"
                        + "[" + s1 + "]}";
                mess = mess.replace(",]}", "]}");
                System.out.println(mess);

            }

            saveArticle(mess);

        } catch (Exception e) {
//            e.printStackTrace();

        }

    }

    public static void saveArticle(String content) {
        String lujing = "E:\\movie" + DateUtil.getDay(new Date()) + ".json"; // 保存到本地的路径和文件名
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
