package com.ssm.utils;

/**
 * describe:
 * Set集合
 *
 * 扩展Collection接口
 * 无序集合，不允许存放重复的元素；允许使用null元素
 * 对 add()、equals() 和 hashCode() 方法添加了限制
 * HashSet和TreeSet是Set的实现
 * Set—》hashSet linkedHashSet
 * SortedSet —》 TreeSet
 *
 * HashSet 的后台有一个HashMap;初始化后台容量；只不过生成一个HashSet的话，系统只提供key的访问； 如果有两个Key重复，那么会覆盖之前的；
 *
 *
 * 实现类 :
 * HashSet：equals返回true，hashCode返回相同的整数；哈希表；存储的数据是无序的。
 * LinkedHashSet：此实现与 HashSet 的不同之外在于，后者维护着一个运行于所有条目的双重链接列表。存储的数据是有序的。
 *
 * HashSet类  HashSet类直接实现了Set接口， 其底层其实是包装了一个HashMap去实现的。
 * HashSet采用HashCode算法来存取集合中的元素，因此具有比较好的读取和查找性能。
 * HashSet的特征
 * 不仅不能保证元素插入的顺序，而且在元素在以后的顺序中也可能变化（这是由HashSet按HashCode存储对象（元素）决定的，
 * 对象变化则可能导致HashCode变化）
 * HashSet是线程非安全的   HashSet元素值可以为NULL
 * HashSet常用方法: public boolean contains(Object o) ：如果set包含指定元素，返回true
 * public Iterator iterator()返回set中元素的迭代器
 * public Object[] toArray() ：返回包含set中所有元素的数组
 * public Object[] toArray(Object[] a) ：返回包含set中所有元素的数组，返回数组的运行时类型是指定数组的运行时类型
 * public boolean add(Object o) ：如果set中不存在指定元素，则向set加入
 * public boolean remove(Object o) ：如果set中存在指定元素，则从set中删除
 * public boolean removeAll(Collection c) ：如果set包含指定集合，则从set中删除指定集合的所有元素
 * public boolean containsAll(Collection c) ：如果set包含指定集合的所有元素，返回true。
 * 如果指定集合也是一个set，只有是当前set的子集时，方法返回true  实现Set接口的HashSet，依靠HashMap来实现的。
 * 我们应该为要存放到散列表的各个对象定义hashCode()和equals()。
 * HashSet的equals和HashCode  前面说过，Set集合是不允许重复元素的，否则将会引发各种奇怪的问题。
 * 那么HashSet如何判断元素重复呢？  HashSet需要同时通过equals和HashCode来判断两个元素是否相等，
 * 具体规则是，如果两个元素通过equals为true，并且两个元素的hashCode相等，则这两个元素相等（即重复）。
 * 所以如果要重写保存在HashSet中的对象的equals方法，也要重写hashCode方法，
 * 重写前后hashCode返回的结果相等（即保证保存在同一个位置）。所有参与计算 hashCode() 返回值的关键属性，
 * 都应该用于作为 equals() 比较的标准。  试想如果重写了equals方法但不重写hashCode方法，
 * 即相同equals结果的两个对象将会被HashSet当作两个元素保存起来，这与我们设计HashSet的初衷不符（元素不重复）。
 * 另外如果两个元素哈市Code相等但equals结果不为true，HashSet会将这两个元素保存在同一个位置，
 * 并将超过一个的元素以链表方式保存，这将影响HashSet的效率。  如果重写了equals方法但没有重写hashCode方法，
 * 则HashSet可能无法正常工作
 *
 * @author wfd
 * @date 2019/08/14
 */
public class SetUtils {

}
