package com.mio.test;

import com.mio.utils.ArrayUtils;
import com.mio.utils.CommonUtils;

import java.util.Arrays;

/*
 *  1.求数组元素的最大值、最小值、平均数、总和等

 2.数组的复制、反转

 3.数组元素的排序

 */
public class Test2 {

    public static void main(String[] args) {
        ArrayUtils commonUtils = new ArrayUtils();
        int[] arr = new int[]{12, 43, 9, 0, -65, -99, 100, 9};

        // 最大值
        for (int i = 0; i < commonUtils.intSortArr(arr).length; i++) { // 遍历数组
            System.out.println(commonUtils.intSortArr(arr)[i]);
        }
        System.out.println("===========================");
        for (int i = 0; i < commonUtils.intSortArr(arr, "desc").length; i++) { // 遍历数组
            System.out.println(commonUtils.intSortArr(arr, "desc")[i]);
        }


       /*




        // 数组的复制

        // 数组元素的反转
         for(int i = 0;i < arr.length/2;i++){
         int temp = arr[i];
         arr[i] = arr[arr.length-1 - i];
         arr[arr.length - 1 - i] = temp;
         }
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        System.out.println("反转以后：");
        // 遍历

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
//		// 使用冒泡排序使数组元素从小到大排列
//
//		//使用直接选择排序使数组元素从小到大排列
//		for(int i = 0; i < arr.length - 1; i++){
//			int t = i;//默认i处是最小的
//			for(int j = i;j < arr.length;j++){
//				//一旦在i后发现存在比其小的元素，就记录那个元素的下角标
//				if(arr[t] > arr[j]){
//					t = j;
//				}
//			}
//			if(t != i){
//				int temp = arr[t];
//				arr[t] = arr[i];
//				arr[i] = temp;
//			}
//		}
        Arrays.sort(arr);

        System.out.println("排序以后：");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
*/
    }
}
