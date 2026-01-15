package com.decomle.dsa.crashcourse.sort.lowlevel;

public class InsertionSort {
    // Big O Notation:
    //   Worst case: O(n^2)
    //   Best case: O(n)
    // Good for small array
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 2, 5, 3, 10, 15, 22, 1};

        insertionSort(array);
        for(int i: array) {
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
