package com.mio.utils;

import java.util.Arrays;

/**
 * 功能描述：数组方法
 * 调用方式：
 *
 * @author ME
 * @date 2019/5/10
 * @return
 */
public class ArrayUtils {
    /**
     * 功能描述：整形数组最大值
     * 调用方式：
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return java.lang.Integer
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return java.lang.Integer
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return java.lang.Integer
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return java.lang.Integer
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return int[]
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @param desc
     * @return int[]
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return int[]
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return int[]
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
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @return int[]
     */
    public int[] intSortArrss(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * 功能描述：交换数组中指定位置的元素:交换arr数组中索引为i和j的两个元素
     * 调用方式：用于数组排序
     * @author ME
     * @date 2019/5/10
     * @param arr
     * @param i
     * @param j
     * @return void
     */
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
