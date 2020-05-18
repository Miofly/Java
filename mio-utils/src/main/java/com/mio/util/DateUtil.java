package com.mio.util;

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

    // 当前年份
    public static int getYear(Date date) {
        try {
            String form_date = bartDateFormat.format(date);
            return Integer.parseInt(form_date.substring(0, 4));
        } catch (Exception ex) {
            return Integer.parseInt(getCurrentTime().substring(0, 4));
        }
    }

    // 当前月份
    public static int getMonth(Date date) {
        try {
            String form_date = bartDateFormat.format(date);
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

   /* @Test
    public void test2() throws Exception{
        //1.格式化1
        SimpleDateFormat sdf = new SimpleDateFormat();
        String date = sdf.format(new Date());
        System.out.println(date);//14-5-12 下午3:24
        //2.格式化2
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        date = sdf1.format(new Date());
        System.out.println(date);//星期一, 12 五月 2014 15:29:16 +0800

        //3.解析：
        Date date1 = sdf.parse("14-5-12 下午3:24");
        System.out.println(date1);

        date1 = sdf1.parse("星期一, 12 五月 2014 15:29:16 +0800");
//		date1 = sdf1.parse("14-5-12 下午3:24");
        System.out.println(date1);
    }
    //java.util.Date不易于国际化
    @Test
    public void test1(){
//		java.sql.Date d2 = new java.sql.Date(15342515326235L);
//		System.out.println(d2);//2456-03-08
        //创建一个Date的实例
        Date d1 = new Date();
        System.out.println(d1.toString());//Mon May 12 15:17:01 CST 2014
        System.out.println(d1.getTime());//1399879144434
        Date d2 = new Date(1399879144434L);
        System.out.println(d2);
    }*/
}
