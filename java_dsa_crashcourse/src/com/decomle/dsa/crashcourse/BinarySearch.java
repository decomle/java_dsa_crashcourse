package com.decomle.dsa.crashcourse;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary search will need sorted array. Very good for large dataset O(log(n)).
        // Be aware that java.util.Arrays already provided a function for binary search

        int[] arrays = new int[1000000];

        System.out.println("Array size: " + args.length);
        for(int i=0; i<1000000; i++) {
            arrays[i] = i;
        }

        int index = binarySearch(arrays, 77777);

        if(index!=-1) {
            System.out.println("Element found at "+ index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;
        while(low<=high) {
            int middle = low + (high-low)/2;
            int value = array[middle];

            System.out.println("middle: " + value);
            if(value < target) {
                low = middle + 1;
            } else if(value > target){
                high = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
