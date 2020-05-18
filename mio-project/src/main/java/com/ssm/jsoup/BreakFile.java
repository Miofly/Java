package com.ssm.jsoup;

import java.io.*;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/09/01
 */
public class BreakFile {
    public static void main(String[] args) {
        try {
            FileReader read = new FileReader("G:\\songKey.json");
            BufferedReader br = new BufferedReader(read);
            String row;

            int rownum = 1;

            int fileNo = 1;
            FileWriter fw = new FileWriter("E:/json/songKey" + fileNo + ".json");
            while ((row = br.readLine()) != null) {
                rownum++;
                fw.append(row + "\r\n");

                if ((rownum / 846352) > (fileNo - 1)) {
                    fw.close();
                    fileNo++;
                    fw = new FileWriter("E:/json/songKey" + fileNo + ".json");
                }
            }
            fw.close();
            System.out.println("rownum=" + rownum + ";fileNo=" + fileNo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
