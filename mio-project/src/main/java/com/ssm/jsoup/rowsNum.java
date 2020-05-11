package com.ssm.jsoup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * describe:
 *
 * @author wfd
 * @date 2019/09/01
 */
public class rowsNum {


    public static void main(String[] args) {
        try {
            FileReader read = new FileReader("G://songKey.json");
            BufferedReader br = new BufferedReader(read);
            String row;

            int rownum = 1;
            while ((row = br.readLine()) != null) {
                rownum++;
            }
            System.out.println("rownum=" + rownum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
