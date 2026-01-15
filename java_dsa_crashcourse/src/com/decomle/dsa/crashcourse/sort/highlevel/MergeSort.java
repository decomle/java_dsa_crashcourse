package com.decomle.dsa.crashcourse.sort.highlevel;

public class MergeSort {
    // Big O Notation: O(n*log(n))
    // Need a tons of memory. Very complicated
    // Best of a largeset of data
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 2, 5, 3, 10, 15, 22, 1};

        mergeSort(array);
        for(int i: array) {
            System.out.println(i);
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) {
            return;
        }

        int middle = length/2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int lIndex = 0; // index for left array
        int rIndex = 0; // index for the right array

        for(; lIndex<length; lIndex++) {
            if(lIndex < middle) {
                leftArr[lIndex] = array[lIndex];
            } else {
                rightArr[rIndex] = array[lIndex];
                rIndex++;
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, array);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] array) {
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize) {
            if(leftArr[l] < rightArr[r]) {
                array[i] = leftArr[l];
                i++;
                l++;
            } else {
                array[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while(l < leftSize) {
            array[i] = leftArr[l];
            i++;
            l++;
        }
        while(r < rightSize) {
            array[i] = rightArr[r];
            i++;
            r++;
        }

    }
}
