package com.fengwenyi.algorithm_demo.binary_search;

/**
 * @author Wenyi Feng
 */
public class BinarySearch {

    /*
    * 有序数组
    * 0 1 2 3 4 5 6 7 8
    * 中间 4
    * 3
    *
    *
    * */

    /**
     * 二分查找
     * @param arrays 有序数组
     * @param key 查找元素
     * @return 元素位置（-1，表示未查到）
     */
    public static int binarySearch (int [] arrays, int key) {

        int length = arrays.length;

        int mid = length / 2;

        if (key == arrays[mid]) {
            return mid;
        }

        int start = 0;
        int end = length - 1;

        while (start <= end) {
            mid = (end - start) / 2 + start;

            if (key < arrays[mid]) {
                end = mid - 1;
            } else if (key > arrays[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int [] arrays = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,100, 102};
        int key = 100;

        int s = binarySearch(arrays, key);

        System.out.println(s);
    }

}
