package com.ssm.utils;

import java.io.*;
import java.util.*;

/**
 * describe:
 * public void 修饰是非静态方法，该类方法属于对象，在对象初始化（new Object()）后才能被调用；
 * public static void 修饰是静态方法，属于类，使用类名.方法名直接调用。
 * 非静态方法之间可以互相调用，非静态方法也可以调用静态方法；
 * 但是静态方法不可以直接调用（未初始化的）非静态方法。由于 public static void main 作静态方法，所以遵循这个原则。
 *
 * @author wfd
 * @date 2019/08/13
 */
public class FileUtils {

    public static void main(String[] args) {
        FileUtils.removeDuplicateData(
                "G:\\syncJgy\\json\\movie\\movie" + (DateUtil.getDay(new Date()) - 1) + ".json",
                "G:\\syncJgy\\json\\movie\\movie" + DateUtil.getDay(new Date()) + ".json",
                "G:\\getNew" + DateUtil.getDay(new Date()) + ".json"
        );

    }

    /**
     * 功能描述：文件内容输出到文件
     * 调用方式：FileUtils.saveConToFile(content, "g://test.json")
     *
     * @param content
     * @param path
     * @return void
     * @author wfd
     * @date 2019/8/13 11:02
     */
    public static void saveConToFile(String content, String path) {
        File file = new File(path);
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

    /**
     * 功能描述：文本去除重复行并输出到目标文件
     * 调用方式：FileUtils.removeDuplicateRows("", "")
     *
     * @param sourcePath
     * @param targetPath
     * @return void
     * @author wfd
     * @date 2019/8/13 11:04
     */
    public static void removeDuplicateRows(String sourcePath, String targetPath) {

        try {
            FileReader fileReader = new FileReader(new File(sourcePath));
            BufferedReader br = new BufferedReader(fileReader);

            Map<String, String> map = new HashMap<String, String>();
            String readLine = null;
            int i = 0;

            while ((readLine = br.readLine()) != null) {
                // 每次读取一行数据，与 map 进行比较，如果该行数据 map 中没有，就保存到 map 集合中
                if (!map.containsValue(readLine)) {
                    map.put("key" + i, readLine);
                    i++;
                }
            }

            for (int j = 0; j < map.size(); j++) {
                String content = map.get("key" + j);
                System.out.println(content);
                FileUtils.saveConToFile(content, targetPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*文本去重*/
    public static void removeDuplicateData(String oldPath, String newPath, String finalPath) {
        try {
            List<String> oldList = new ArrayList<>();
            FileReader fr = new FileReader(new File(oldPath));
            BufferedReader br = new BufferedReader(fr);
            String readLine = null;
            while ((readLine = br.readLine()) != null) {
                oldList.add(readLine);
            }

            List<String> newList = new ArrayList<>();
            FileReader fr1 = new FileReader(new File(newPath));
            BufferedReader br1 = new BufferedReader(fr1);
            String readLine1 = null;
            while ((readLine1 = br1.readLine()) != null) {
                newList.add(readLine1);
            }

            List<String> oldfiltered = ListSumUtils.filterEmptyStrings(oldList);
            List<String> newfiltered = ListSumUtils.filterEmptyStrings(newList);

            newfiltered.removeAll(oldfiltered);

            for (String item : newfiltered) {
                String content = item.toString().replace("{\"_id\"", "{\"time\":\"" + DateUtil.getCurrentDates() + "\",\"_id\"");

                System.out.println(content);
                saveConToFile(content, finalPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
