package com.ssm.utils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * describe:
 * <p>
 * 数组不是面向对象的，存在明显的缺陷，集合弥补了数组的缺点，比数组更灵活更实用，
 * 而且不同的集合框架类可适用不同场合。如下：
 * 1：数组能存放基本数据类型和对象，而集合类存放的都是对象的引用，而非对象本身！
 * 2：数组容易固定无法动态改变，集合类容量动态改变。
 * 3：数组无法判断其中实际存有多少元素，length只告诉了数组的容量，而集合的size()可以确切知道元素的个数
 * 4：集合有多种实现方式和不同适用场合，不像数组仅采用顺序表方式
 * 5：集合以类的形式存在，具有封装、继承、多态等类的特性，通过简单的方法和属性即可实现各种复杂操作，大大提高了软件的开发效率
 * <p>
 * java.util.List接口 extends Collection接口
 * List接口的特点：
 * 1.有序的集合，存储元素和取出元素的顺序是一致的（存储123 取出123）
 * 2.有索引，包含了一些带索引的方法
 * 3.允许存储重复的元素
 * <p>
 * <p>
 * List集合 有序列表，允许存放重复的元素；
 * 实现类：
 * ArrayList：数组实现，查询快，增删慢，轻量级；(线程不安全)
 * LinkedList：双向链表实现，增删快，查询慢 (线程不安全)
 * Vector：数组实现，重量级  (线程安全、使用少)
 * ArrayList和LinkedList在用法上没有区别，但是在功能上还是有区别的。
 * <p>
 * Vector与ArrayList相似，区别是Vector是重量级的组件，使用使消耗的资源比较多。）
 * 结论：在考虑并发的情况下用Vector（保证线程的安全）。
 * 在不考虑并发的情况下用ArrayList（不能保证线程的安全）。
 * <p>
 * List接口中带索引的方法（特有）
 * - public void add(int index, E element)：将指定的元素，添加到该集合的指定位置上。
 * - public E get(int index)：返回集合中指定位置的元素。
 * - public E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素。
 * - public E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回值的更新前的元素。
 * 注意：
 * 操作索引的时候，一定要防止索引越界异常
 * IndexOutOfBoundsException:索引越界异常，集合会报
 * ArrayIndexOutOfBoundsException：数组索引越界异常
 * StringIndexOutOfBoundsException：字符串索引越界异常
 * <p>
 * ArrayList集合底层是一个数组，元素查询快，增删慢。
 * java.util.LinkedList集合 implements List接口
 * LinkedList集合的特点：
 * 1.底层是一个链表结构：查询慢，增删快
 * 2.里边包含了大量操作首尾元素的方法
 * 注意：使用LinkedList集合特有的方法，不能使用多态
 * - public void addFirst(E e)：将指定元素插入此列表的开头
 * - public void addList(E e)：将指定元素添加到此列表的结尾
 * - public void push(E e)：将元素推入此列表所表示的堆栈 此方法等效于addFirst()
 * <p>
 * - public E getFirst()：返回此列表的第一个元素
 * - public E getLast()：返回此列表的最后一个元素
 * <p>
 * - public E removeFirst()：移除并返回此列表的第一个元素
 * - public E removeLast()：移除并返回此列表的最后一个元素
 * - public E pop()：从此列表所表示的堆栈处弹出一个元素
 * <p>
 * - public boolean isEmpty()：如果列表不包含元素，则返回true
 *
 * @author wfd
 * @date 2019/08/14
 */
public class ListSumUtils {

    public static void main(String[] args) {

    }

    /**
     * 功能描述：去除空字符串和null
     * 调用方式：ListSumUtils.filterEmptyStrings()
     *
     * @param list
     * @return java.util.List<java.lang.String>
     * @author wfd
     * @date 2019/8/14 12:36
     */
    public static List<String> filterEmptyStrings(List<String> list) {
        return list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }

    /**
     * 功能描述：去除集合重复项
     * 调用方式：ListSumUtils.removeDuplicates()
     *
     * @param list
     * @return java.util.List<java.lang.String>
     * @author wfd
     * @date 2019/8/14 12:49
     */
    public static List<String> removeDuplicates(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
        return list;
    }

    public static void listDemo() {
        // 创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        // 使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");


        System.out.println("将集合转换为字符串:" + list.toString());
        System.out.println("将集合转换为数组:" + list.toArray());

        System.out.println(list.isEmpty()); // false 判断是否为空
        List<String> testList = new ArrayList<>();

        testList = list.subList(1, 4);  //.subList(fromIndex, toIndex) 利用索引1-4的对象重新生成一个list，但是不包含索引为4的元素，4-1=3
        for (String item : testList) {
            System.out.println(item);
        }

        /*
            //两个相等对象的equals方法一定为true, 但两个hashcode相等的对象不一定是相等的对象
            if (person.equals(fruits)) {
                System.out.println("两个list中的所有元素相同");
            }else {
                System.out.println("两个list中的所有元素不一样");
            }

            if (person.hashCode()==fruits.hashCode()) {
                System.out.println("我们相同");
            }else {
                System.out.println("我们不一样");
            }
         */

        System.out.println(list.contains("ee")); // false list中是否包含某个元素；
        System.out.println(list.indexOf("a")); // 查找对象element 在List中第一次出现的位置
        System.out.println(list.lastIndexOf("a")); // 查找对象element 在List中最后出现的位置

        List<String> list1 = new ArrayList<>();
        list1.add("ssss");
        System.out.println(list.addAll(1, list1)); // 在index位置后添加容器collection中所有的元素,不填index则在末尾添加
        // 打印集合
        System.out.println(list); // [a, b, c, d, a] 不是地址，重写了toString方法

        // 在c和d之间添加一个itheima
        list.add(3, "itheima"); // [a, b, c, itheima, d, a]
        System.out.println(list);

        // 移除元素
        String removeE = list.remove(2);
        System.out.println("被移除的元素:" + removeE);
        System.out.println(list);

        // 把最后一个a,替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素：" + setE);
        System.out.println(list); // [a, b, itheima, d, A]

        // list集合遍历有3种方式
        // 使用普通的for循环
        for (int i = 0; i < list.size(); i++) {
            // public E get(int index)：返回集合中指定位置的元素。
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("--------------------");
        // 使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------");
        // 使用增强for
        for (String s : list) {
            System.out.println(s);
        }

        String r = list.get(5);
        System.out.println(r); // IndexOutOfBoundsException: Index 5 out-of-bounds for length 5

    }

    /**
     * 功能描述：java.util.LinkedList集合 implements List接口
     * LinkedList集合的特点：
     * 1.底层是一个链表结构：查询慢，增删快
     * 2.里边包含了大量操作首尾元素的方法
     * 注意：使用LinkedList集合特有的方法，不能使用多态
     * - public void addFirst(E e)：将指定元素插入此列表的开头
     * - public void addList(E e)：将指定元素添加到此列表的结尾
     * - public void push(E e)：将元素推入此列表所表示的堆栈 此方法等效于addFirst()
     * <p>
     * - public E getFirst()：返回此列表的第一个元素
     * - public E getLast()：返回此列表的最后一个元素
     * <p>
     * - public E removeFirst()：移除并返回此列表的第一个元素
     * - public E removeLast()：移除并返回此列表的最后一个元素
     * - public E pop()：从此列表所表示的堆栈处弹出一个元素
     * <p>
     * - public boolean isEmpty()：如果列表不包含元素，则返回true
     * <p>
     * 调用方式：ListSumUtils.arrayListLinkListDemo()
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 9:27
     */
    public static void arrayListLinkListDemo() {
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        /*
            public void addFirst(E e)：将指定元素插入此列表的开头
            public void addLast(E e)：将指定元素添加到此列表的结尾
            public void push(E e)：将元素推入此列表所表示的堆栈
         */

        // 使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]

        // public void addFirst(E e)：将指定元素插入此列表的开头
//        linked.addFirst("www");
//        System.out.println(linked); // [www, a, b, c]

        linked.push("www");
        System.out.println(linked); // [www, a, b, c]

        // public void addLast(E e)：将指定元素添加到此列表的结尾。此方法等效于add()
        linked.addLast("com");
        System.out.println(linked); // [www, a, b, c

//        linked.clear(); // 清空集合中的元素 再获取集合中的元素会抛出NoSuchElementException

        // public boolean isEmpty()：如果列表不包含元素，则返回true
        if (!linked.isEmpty()) {
            String first = linked.getFirst();
            System.out.println(first); // a
            String last = linked.getLast();
            System.out.println(last); // c
        }

        // String first = linked.removeFirst();
        // System.out.println("被移除的第一个元素：" + first);
        String pop = linked.pop();
        System.out.println("被移除的第一个元素：" + pop);
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素：" + last);
        System.out.println(linked); // [b]

    }
}
