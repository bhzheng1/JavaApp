package com.atguigu.array;

public class DemoBinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binary(arr, 6);
        System.out.println(index);
    }

    public static int binary(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (target > arr[mid]) {
                min = mid + 1;
            } else if (target < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
