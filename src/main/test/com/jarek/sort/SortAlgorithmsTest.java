package com.jarek.sort;


import com.jarek.util.TestUtil;

/**
 * Created by Jarek on 2017/5/17.
 */
public class SortAlgorithmsTest {
    public static void insertionSortTest() {
        int[] A = {1, 5, 3, 10, 2, 9, 2, 19};
        TestUtil.printArray(A);
        int[] insertionSort = SortAlgorithms.insertionSort(A);
        TestUtil.printArray(insertionSort);
    }

    public static void main(String[] args) {
        SortAlgorithmsTest.insertionSortTest();
    }
}
