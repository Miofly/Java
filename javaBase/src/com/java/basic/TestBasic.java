package com.java.basic;

/*
标识符：凡是可以自己命名的地方，都叫标识符。如：类名、方法名、变量名、接口名，。。。

1.标识符命名的规则：(要求严格遵守，否则会报编译性的错误)
由26个英文字母大小写，0-9 ，_或 $ 组成
数字不可以开头。
不可以使用关键字和保留字，但能包含关键字和保留字。
Java中严格区分大小写，长度无限制。
标识符不能包含空格。

2.Java中的名称命名规范：(如果不遵守，也不会报错)
包名：多单词组成时所有字母都小写：xxxyyyzzz
类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

*/

public class TestBasic {
    public static void main(String[] args) {

        //3.整型：byte(-128~+127)  short  int（默认类型） long
        byte b1 = 12;
        //byte b2 = 128;
        short s1 = 128;
        int i1 = 12;
        //定义long型变量，值的末尾加“L”或“l”
        long l1 = 2134123351345325L;
        System.out.println(l1);

        //4.浮点型（带小数点的数值）：float   double（默认类型）
        double d1 = 12.3;
        //声明float类型的浮点型数据，末尾要加“F”或者“f”
        float f1 = 12.3F;
        System.out.println(f1);

        //5.字符型（=两个字节）：char 只能表示一个字符(英文、中文、标点符号、日文、。。。)
        char c1 = 'a';
        //char c2 = 'ab';
        String str = "ab";
        char c3 = '中';
        String str1 = "中国";
        //可以表示转义字符
        char c4 = '\t';
        char c5 = '\n';
        System.out.println("abc" + c5 + "def");
        //了解
        char c6 = '\u1234';
        System.out.println(c6);

        //6.布尔类型：boolean  只能够取值为true 或 false 。不能取值null
        boolean bool1 = true;
        if(bool1){
            System.out.println("佟老师是个\"帅\"哥");
        }else{
            System.out.println("你在说谎！");
        }
    }
}

//枚举类
class Season{

}
