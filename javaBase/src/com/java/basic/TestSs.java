package com.java.basic;

import com.mio.utils.CommonUtils;
import com.sun.xml.internal.ws.client.dispatch.DataSourceDispatch;

public class TestSs {
    public static void main(String[] args) {
        int i = 60;
//        String str = Integer.toBinaryString(i)
        /*
           单引号括起来表示char
           双引号表示字符串
         */
//        System.out.println('*' + '\t' +'*');
//        System.out.println("*" + '\t' +'*');

        /*
        +=的使用，类型问题
         */
//        short s = 3;
//        s = s + 3;/*会报错 s+3会直接转换成int类型*/
//        s = (short)(s + 3);/*不建议*/
//        s += 1;/*这样实现*/

        /*注意==与=的区别*/
       /*  boolean b = false;
       if(b=true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/

        /*if(b==true)
            System.out.println("true");
        else
            System.out.println("false");*/

        /*类型问题*/
       /* int i=1;
        i *= 0.1;
        System.out.println(i); *//*==0*//*
        i++;
        int b = i++;
        System.out.println(b);
        System.out.println(i);*/

        /*
        ++ --问题
        ++ --在前先运算后取值
         */



       /*
       逻辑运算符
        */
        //& 与 && 的区别：&:不管左边是true还是false，右端都会进行运算。
        //				   &&:当左端为false时，右端不再进行运算
        //以后使用时，建议使用 &&
        /*boolean a = true;
        boolean b = false;
        int i1 = 10;
        if(b & (i1++) > 0){
            System.out.println("今天天气很晴朗");
        }else{
            System.out.println("难得没有雾霾");
        }
        System.out.println(i1);//11

        int i2 = 10;
        if(b && (i2++) > 0){
            System.out.println("今天天气很晴朗");
        }else{
            System.out.println("难得没有雾霾");
        }
        System.out.println(i2);//10


        //| 与 || 的区别：|：当左端为true时，右端照样做运算。
        // ||:当左端为true时，右端不再进行运算。
        //我们在使用时，选择：||
        int i3 = 10;
        if(a | i3++ > 0){
            System.out.println("今天天气很晴朗");
        }else{
            System.out.println("难得没有雾霾");
        }
        System.out.println(i3);//11

        int i4 = 10;
        if(a || i4++ > 0){
            System.out.println("今天天气很晴朗");
        }else{
            System.out.println("难得没有雾霾");
        }
        System.out.println(i4);//10*/


        /*
        三元运算符：(条件表达式)?  表达式1 : 表达式2;
        要求：表达式1与表达式2为同种数据类型。
        	   既然是运算符，就一定会有运算的结果,结果的数据类型与表达式1,2的类型一致。
        三元运算符在一定程度上可以与if-else互换。（三元运算符一定可以转换为if-else，反之不成立。）
        */
//        int i = 20;
//        int j = 23;
        //此时max记录了i与j的较大值
      /*  int max = (i > j)? i : j;

//        String str = (i > j)? "i大" : "j大";
        String str = (i > j)? "i大" : (i == j)? "相等" : "j大";

        //String str1 = (i > j)? i : "j大";  //表达式1与表达式2为同种数据类型。会报错
        System.out.println(max);
        System.out.println(str);*/

        //互换
//        if(i >= j){
//            System.out.println("较大值为：" + i);
//        }else{
//            System.out.println("较大值为：" + j);
//        }
//
//        //练习：如何使用三元运算符，输出三个数中的较大值。
//        int m = 12;
//        int n = 23;
//        int k = -9;
//        int max1 = (m > n)? m : n;
//        int max2 = (max1 > k)? max1 : k;
//        System.out.println(max2);


        int m = 12;
        int n = 5;
        //方法一：提供一个临时变量。
        /*int temp = m;
               m = n;
               n = temp;
        System.out.println("m:" + m + " n:" + n);*/

        //方法二：当m和n较大时，有可能出现精度损失
        //m = m + n;//m = 12 + 5;
        //n = m - n;//n = 17 - 5;
        //m = m - n;//m = 17- 12
        //System.out.println("m:" + m + " n:" + n);

        //方法三：优点：没有上面两种方法的缺点。 缺点：难！
        m = m ^ n;
        n = m ^ n;//(m ^ n) ^ n == m
        m = m ^ n;//(m ^ n) ^ m == n
        System.out.println("m:" + m + " n:" + n);

        //问题：
        //60  手动的方式，从控制台输出60的十六进制。
        /*
        int i = 61;
        //自动调用Integer类现成的方法
        String binary = Integer.toBinaryString(i);

        System.out.println(binary);

        String hex = Integer.toHexString(i);
        System.out.println(hex);

		*//*
		char c = 'a';
		char c1 = (char)(c + 2);
		System.out.println(c1);//c
		*//*

        int j = i & 15;//获取到i的最低4位对应的值。
        String k1 = (j <= 9)? j + "" : (char)(j - 10 + 'a') + "";
        //System.out.println(k1);

        i = i >> 4;
        int z = i & 15;
        String k2 = (z <= 9)? z + "" : (char)(z - 10 + 'a') + "";

        System.out.println(k2 + k1);*/
    }
}
