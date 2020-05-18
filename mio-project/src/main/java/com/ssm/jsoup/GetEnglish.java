package com.ssm.jsoup;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mio.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/08/12
 */
public class GetEnglish {

    private static Logger logger = LoggerFactory.getLogger(GetEnglish.class);

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 9999; i++) {
            GetEnglish.getData();
        }
    }

    public static void getData() {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                try {
                    long showapi_timestamp = Long.parseLong(DateUtil.getCurrentDatess());
                    URL u = new URL("http://route.showapi.com/1211-1?showapi_timestamp=" + showapi_timestamp + "&showapi_appid=102527&count=10&showapi_sign=e47a0b3a7a3c4e4e8bfa96c89ca81cd5");
                    InputStream in = u.openStream();
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    try {
                        byte buf[] = new byte[1024];
                        int read = 0;
                        while ((read = in.read(buf)) > 0) {
                            out.write(buf, 0, read);
                        }
                    } finally {
                        if (in != null) {
                            in.close();
                        }
                    }
                    byte[] b = out.toByteArray();
                    String jsonData = new String(b, "utf-8");
                    String jsonDatas = jsonData.replace("{\"showapi_res_error\":\"您的调用过于频繁!err pos 3\",\"showapi_res_code\":-1009,\"showapi_res_body\":{}}", "");
                    Object obj = JSON.parseObject(jsonDatas).get("showapi_res_body"); // 将json字符串转换为json对象
                    Object obj1 = JSON.parseObject(String.valueOf(obj)).get("data");

                    String data = String.valueOf(obj1).replace("[", "").
                            replace("]", "").replace("},{", "}\n{");
                    System.out.println(data);
                    saveArticle(data);
                } catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }, 0, 3000);
    }

    public static void saveArticle(String content) {
        String lujing = "g:\\en.json"; // 保存到本地的路径和文件名
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
