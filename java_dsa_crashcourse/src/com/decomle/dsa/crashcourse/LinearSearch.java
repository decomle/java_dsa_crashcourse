package com.decomle.dsa.crashcourse;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {9, 1, 6, 2, 7, 5, 4, 3, 89};
        int index = linearSearch(array, 89);

        if(index != -1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element was not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i<array.length; i++ ) {
            if(array[i]==value) {
                return i;
            }
        }
        return -1;
    }
}
