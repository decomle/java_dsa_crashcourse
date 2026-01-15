package com.decomle.dsa.crashcourse.sort;

public class SelectionSort {
    // Big O Notation: O(n^2)
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 2, 5, 3, 10, 15, 22, 1};

        selectionSort(array);
        for(int i: array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
