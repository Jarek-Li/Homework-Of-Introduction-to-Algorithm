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

    public static void mergeTest(){
        TestUtil.printArray(TestUtil.B);
        int[] merge = SortAlgorithms.merge(TestUtil.B, 0, 3, 8);
        TestUtil.printArray(merge);
    }

    public static void mergeSortTest(){
        int[] A = {1, 5, 3, 10, 2, 9, 2, 19};
        TestUtil.printArray(TestUtil.A );
        int[] ints = SortAlgorithms.mergeSort(A,0,3);
        TestUtil.printArray(ints);
    }

    public static void main(String[] args) {
//        SortAlgorithmsTest.insertionSortTest();
//        mergeTest();
        mergeSortTest();
    }
}
