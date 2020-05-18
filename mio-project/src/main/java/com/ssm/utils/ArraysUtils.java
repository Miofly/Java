package com.ssm.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 功能描述：数组方法
 * 调用方式：
 * 声明一个数组
 * 1 String[] arr1 = new String[5];
 * 2 String[] arr2 = {"a","b","c", "d", "e"};
 * 3 String[] arr3= new String[]{"a","b","c","d","e"};
 *
 * @author ME
 * @date 2019/5/10
 * @return
 */
public class ArraysUtils {
    private static Logger logger = LoggerFactory.getLogger(ArraysUtils.class);

    public static void main(String[] args) {
        arrayToArrayList();
    }

    /**
     * 功能描述：移除数组中的元素
     * 调用方式：ArraysUtils.removeEle()
     * @author wfd
     * @date 2019/8/14 9:07
     * @param
     * @return void
     */
    public static void removeEle() {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] removed = ArrayUtils.removeElement(intArray, 3);
        System.out.println(Arrays.toString(removed));
    }

    /**
     * 功能描述：逆向一个数组
     * 调用方式：ArraysUtils.reverse()
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 9:06
     */
    public static void reverse() {
        int[] intArray = {1, 2, 3, 4, 5};
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));
    }

    /**
     * 功能描述：连接两个数组
     * 调用方式：ArraysUtils.addAllArrays()
     * ArrayUtils.addAll
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 9:01
     */
    public static void addAllArrays() {
        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = {6, 7, 8, 9, 10};
        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
    }

    /**
     * 功能描述：检查一个数组是否包含某个值
     * 调用方式：ArraysUtils.containVal()
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 8:54
     */
    public static void containVal() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b); // true
    }

    /**
     * 功能描述：将数组转成数组列表
     * 调用方式：ArraysUtils.arrayToArrayList()
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 8:52
     */
    public static void arrayToArrayList() {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList); // [a, b, c, d, e]
    }

    /**
     * 功能描述：向数组中填充元素
     * 调用方式：ArraysUtils.arrayFill()
     * Arrays.fill(数组名 ,开始位置 , 结束位置, 填入的值)
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 7:53
     */
    public static void arrayFill() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(arr, 3, 6, 50);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] array = new int[6];
        Arrays.fill(array, 100);
        for (int i = 0, n = array.length; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 功能描述：数组扩容
     * 调用方式：ArraysUtils.arrayCopyOf()
     * Arrays.copyOf(数组名，扩容后长度) 运行结果 1 2 3 4 0 0 0 0
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 7:50
     */
    public static void arrayCopyOf() {
        int[] arr = {1, 2, 3, 4};

        arr = Arrays.copyOf(arr, 8);
        for (int a : arr) {
            logger.info(a + "");
        }

    }

    /**
     * 功能描述：将数组转化成字符串，此时输出的结果是字符串类型。
     * 调用方式：ArraysUtils.arrayToString()
     * Arrays.toString(arr)
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 7:47
     */
    public static void arrayToString() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String newArr = Arrays.toString(arr);
        logger.info(newArr);
    }

    /**
     * 功能描述：实现数组拷贝
     * 调用方式：ArraysUtils.demo()
     * System.arraycopy(源数组名称，源数组拷贝开始索引，目标数组名称，目标数组拷贝数组索引，长度）
     *
     * @param
     * @return void
     * @author wfd
     * @date 2019/8/14 7:40
     */
    public static void arrayCopy() {
        int[] dataA = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] dataB = new int[]{11, 22, 33, 44, 55, 66, 77, 88};
        // System.arraycopy(源数组名称，源数组拷贝开始索引，目标数组名称，目标数组拷贝数组索引，长度）
        System.arraycopy(dataA, 3, dataB, 2, 3);
        getprint(dataB);
    }

    /**
     * 功能描述：int[]类型数组打印
     * 调用方式：ArraysUtils.getprint()
     *
     * @param array
     * @return void
     * @author wfd
     * @date 2019/8/14 7:38
     */
    public static void getprint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            logger.info(array[i] + " ");
        }
    }

    /**
     * 功能描述：整形数组最大值
     * 调用方式：
     *
     * @param arr
     * @return java.lang.Integer
     * @author ME
     * @date 2019/5/10
     */
    public Integer intArrMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 功能描述：整形数组最小值
     * 调用方式：
     *
     * @param arr
     * @return java.lang.Integer
     * @author ME
     * @date 2019/5/10
     */
    public Integer intArrMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 功能描述：整形数组总和
     * 调用方式：
     *
     * @param arr
     * @return java.lang.Integer
     * @author ME
     * @date 2019/5/10
     */
    public Integer intArrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 功能描述：整形数组平均值
     * 调用方式：
     *
     * @param arr
     * @return java.lang.Integer
     * @author ME
     * @date 2019/5/10
     */
    public Integer intArrAvg(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    /**
     * 功能描述：整形数组的复制
     * 调用方式：
     *
     * @param arr
     * @return int[]
     * @author ME
     * @date 2019/5/10
     */
    public int[] intCopyArr(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    /**
     * 功能描述：排序
     * 调用方式：asc 从小到大 desc从大到小 intSortArr(arr, "asc") intSortArr(arr, "desc")
     *
     * @param arr
     * @param desc
     * @return int[]
     * @author ME
     * @date 2019/5/10
     */
    public int[] intSortArr(int[] arr, String desc) {
        if (desc.equals("asc")) { // ascend:从小到大
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        } else if (desc.equals("desc")) { // 从大到小
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        } else {
            System.out.println("您输入的排序方式有误！");
        }
        return arr;
    }


    /**
     * 功能描述：使用直接选择排序使数组元素从小到大排列
     * 调用方式：
     *
     * @param arr
     * @return int[]
     * @author ME
     * @date 2019/5/10
     */
    public int[] intSortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int t = i; // 默认i处是最小的
            for (int j = i; j < arr.length; j++) {
                // 一旦在i后发现存在比其小的元素，就记录那个元素的下角标
                if (arr[t] > arr[j]) {
                    t = j;
                }
            }
            if (t != i) {
                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    /**
     * 功能描述：使用冒泡排序使数组元素从小到大排列
     * 调用方式：
     *
     * @param arr
     * @return int[]
     * @author ME
     * @date 2019/5/10
     */
    public int[] intSortArrs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 功能描述：调用Arrays直接排序
     * 调用方式：
     *
     * @param arr
     * @return int[]
     * @author ME
     * @date 2019/5/10
     */
    public int[] intSortArrss(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * 功能描述：交换数组中指定位置的元素:交换arr数组中索引为i和j的两个元素
     * 调用方式：用于数组排序
     *
     * @param arr
     * @param i
     * @param j
     * @return void
     * @author ME
     * @date 2019/5/10
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
