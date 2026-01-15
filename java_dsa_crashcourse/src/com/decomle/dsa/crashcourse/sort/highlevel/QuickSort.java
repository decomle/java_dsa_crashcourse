package com.decomle.dsa.crashcourse.sort.highlevel;

public class QuickSort {
    // Big O Notation:
    //       Best case: O(n*log(n))
    //       Worst case: O(n^2). If already sorted
    // Need a tons of memory. Very complicated
    // Best of a large set of data
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 2, 5, 3, 10, 15, 22, 1};

        quickSort(array, 0, array.length - 1);
        for(int i: array) {
            System.out.println(i);
        }
    }
    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) {
            return;
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j < end -1; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
