package com.decomle.dsa.crashcourse.search;

public class InterpolationSearch {
    public static void main(String[] args) {
        // This is an improvement over binary search by guessing where the value might be
        //  Big O Notation:
        //      Avg: O(log(log(n)))
        //      Max: O(n)

        // This is a perfect scenario
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] array = {1, 2, 4, 6, 89, 203, 321, 500, 501, 1099};
        int index = interpolationSearch(array, 6);

        if(index!=-1) {
            System.out.println("Element found at "+ index);
        } else {
            System.out.println("Element not found");
        }
    }
    private static int interpolationSearch(int[] array, int value ) {
        int high = array.length -1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high) {
            int probe = low + (high - low)*(value - array[low]) /
                    (array[high] - array[low]);

            System.out.println("GUESS PROBE: " + probe);

            if(array[probe]==value) {
                return probe;
            } else if(array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe -1;
            }
        }


        return -1;
    }
}
