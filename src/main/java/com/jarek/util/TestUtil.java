package com.jarek.util;

import java.util.Arrays;

/**
 * Created by Jarek on 2017/5/17.
 */
public class TestUtil {
    public static int[] A = {1, 5, 3, 10, 4, 9, 2, 19, 6, 12, 7, 17};

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArrayA() {
        printArray(A);
    }

}
