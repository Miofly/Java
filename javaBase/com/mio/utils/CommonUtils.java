package com.mio.utils;

/**
 * 功能描述：公共方法
 * 备注:  1.  方法重载（overload）：同一个类中；方法名必须相同；参数列表不同（参数个数不同，传参数类型不同），与方法的返回值没有关系
 *           参数顺序不同也可构成重载
 *       2.  对于class的权限修饰只可以用class和default(缺省)，default类只可以被同一个包内部的类访问
 *           public类可以在任意地方被访问
 *       3.  构造器（constructor）作用：创建对象,给对象进行初始化 new一个构造器
 *           a.设计类时，若不显式声明类的构造器的话，程序会提供一个空参的构造器
 *           class Person{
 *             public Person{ // 默认的空参构造器
 *
 *             }
 *           }
 *           b.一旦显式的定义类的构造器，那么默认的构造器就不再提供，需要重新声明一个
 *             public Person(String name) {
 *                 this.name = name
 *             }
 *           c.声明构造器，格式：权限修饰符 构造器名称（和类名称要一致）(形参) {}
 *       4.  类的继承
 *           a.Java只支持单继承，不允许多重继承
                一个子类只能有一个父类 一个父类可以派生出多个子类
                class SubDemo extends Demo{ }   //ok
                class SubDemo extends Demo1,Demo2...//error
         5.  方法的重写(override)
             在子类中可以根据需要对从父类中继承来的方法进行改造，也称方法的重置、覆盖。
             在程序执行时，子类的方法将覆盖父类的方法。
                a.重写方法必须和被重写方法具有相同的方法名称、参数列表和返回值类型。
                b.重写方法不能使用比被重写方法更严格的访问权限。
                c.重写和被重写的方法须同时为static的，或同时为非static的
                d.子类方法抛出的异常不能大于父类被重写方法的异常
         6.  Java类中使用super来调用父类中的指定操作：
                a.super可用于访问父类中定义的属性
                b.super可用于调用父类中定义的成员方法
                c.super可用于在子类构造方法中调用父类的构造器
             注意：
                a.尤其当子父类出现同名成员时，可以用super进行区分
                b.super的追溯不仅限于直接父类
                c.super和this的用法相像，this代表本类对象的引用，super代表父类的内存空间的标识

             a.子类中所有的构造器默认都会访问父类中空参数的构造器
             b.当父类中没有空参数的构造器时，子类的构造器必须通过this(参数列表)或者
               super(参数列表)语句指定调用本类或者父类中相应的构造器，且必须放在构造器的第一行
             c.如果子类构造器中既未显式调用父类或本类的构造器，
               且父类中又没有无参的构造器，则编译出错
         7.  static 定义的变量是共享变量（类变量），实例变量（非static修饰的属性，各个对象各自拥有一套副本）
             a.静态的变量可以通过类.类变量的形式来调用（不需要先new一个对象）。类变量的加载是要早于对象的。
             b.实例变量（随着对象的创建而被加载）
             c.静态的方法里是不可以有this或super的
             d.静态代码块，随着类的加载而加载，而且只加载一次，要早于非静态代码块的执行
         8.  a.final修饰类，这个类不能被继承，如String，StringBUffer类，System类
             b.final修饰方法，不能被重写


 * @author ME
 * @date 2019/5/10
 * @return
 */
public class CommonUtils {

    /**
     * 功能描述：十进制转二进制
     * 调用方式：
     * @author ME
     * @date 2019/5/10
     * @param i
     * @return java.lang.String
     */
    public String changeTwo(Integer i) {
        return Integer.toBinaryString(i);
    }

    /**
     * 功能描述：十进制转八进制
     * 调用方式：
     * @author ME
     * @date 2019/5/10
     * @param i
     * @return java.lang.String
     */
    public String changeEight(Integer i) {
        return Integer.toOctalString(i);
    }

    /**
     * 功能描述：十进制转十六进制
     * 调用方式：
     * @author ME
     * @date 2019/5/10
     * @param i
     * @return java.lang.String
     */
    public String changeSixteen(Integer i) {
        return Integer.toHexString(i);
    }



}
