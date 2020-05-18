package com.mio.util;

import java.io.File;
import java.io.IOException;

public class MyUtils {

        public static void main(String[] args) {
            File file = new File("../uploasadsadsadasdd");
//            MyUtils.judeFileExists(file);
            File dir = new File("C:\\Users\\MIO\\Desktop\\test");
//            MyUtils.judeDirExists(dir);
            MyUtils.testFile(dir);

        }

    // 判断文件是否存在，不存在则创建
    public static void judeFileExists(File file) {

        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not exists, create it ...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    // 判断文件夹是否存在,不存在则创建
    public static void judeDirExists(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }

    }

    public static File testFile(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
                return file;
            } else {
                System.out.println("the same name file exists, can not create dir");
                return file;
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
            return file;
        }

    }
}
