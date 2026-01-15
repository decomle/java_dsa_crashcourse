package com.decomle.dsa.crashcourse.sort;

public class BubbleSort {
    // Big O Notation: O(n^2)
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 2, 5, 3, 10, 15, 22, 1};

        bubbleSort(array);
        for(int i: array) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] array) {

        for(int i = 0; i< array.length - 1; i++ ) {
            for(int j = 0; j < array.length - i - 1; j++ ) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
