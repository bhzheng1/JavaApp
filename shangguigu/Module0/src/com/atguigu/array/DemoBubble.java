package com.atguigu.array;

public class DemoBubble {
    public static void main(String[] args) {
        //define an int array
        int[] arr = {5, 4, 3, 2, 1};

        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
