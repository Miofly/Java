package com.ssm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能描述：时间处理类
 * 调用方式：
 *
 * @author ME
 * @date 2019/3/12
 * @return
 */
public class DateUtil {

    private static SimpleDateFormat bartDateFormat = new SimpleDateFormat(
            "yyyy-MM-dd");

    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        System.out.println();
    }

    // 当前年份
    public static int getYear() {
        try {
            String form_date = bartDateFormat.format(new Date());
            return Integer.parseInt(form_date.substring(0, 4));
        } catch (Exception ex) {
            return Integer.parseInt(getCurrentTime().substring(0, 4));
        }
    }

    // 当前月份
    public static int getMonth() {
        try {
            String form_date = bartDateFormat.format(new Date());
            return Integer.parseInt(form_date.substring(5, form_date
                    .lastIndexOf("-")));
        } catch (Exception ex) {
            String currenttimel = getCurrentTime();
            return Integer.parseInt(currenttimel.substring(5, currenttimel
                    .lastIndexOf("-")));
        }
    }

    // 当前日
    public static int getDay(Date date) {
        try {
            String form_date = bartDateFormat.format(date);
            return Integer.parseInt(form_date.substring(form_date
                    .lastIndexOf("-") + 1, form_date.length()));
        } catch (Exception ex) {
            String currenttimel = getCurrentTime();
            return Integer.parseInt(currenttimel.substring(5, currenttimel
                    .lastIndexOf("-")));
        }

    }

    // 当前日期	2019-03-06
    public static String getCurrentDate() {
        java.sql.Timestamp temp = new java.sql.Timestamp(System
                .currentTimeMillis());
        return (temp.toString()).substring(0, 10);
    }

    // 当前日期	20190306
    public static String getCurrentDates() {
        java.sql.Timestamp temp = new java.sql.Timestamp(System
                .currentTimeMillis());
        return (temp.toString()).substring(0, 10).replace("-", "");
    }

    // 当前时间	20190306111011
    public static String getCurrentDatess() {
        java.sql.Timestamp temp = new java.sql.Timestamp(System
                .currentTimeMillis());
        return (temp.toString()).substring(0, 19).replace("-", "").replace(":", "").replace(" ", "");
    }

    // 当前时间	2019-03-06 17:47:21
    public static String getCurrentTime() {
        java.sql.Timestamp temp = new java.sql.Timestamp(System
                .currentTimeMillis());
        return (temp.toString()).substring(0, 19);
    }


}
