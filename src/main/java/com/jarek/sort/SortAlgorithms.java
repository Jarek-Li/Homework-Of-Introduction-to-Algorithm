package com.jarek.sort;

import com.jarek.util.TestUtil;

/**
 * Created by Jarek on 2017/5/17.
 */
public class SortAlgorithms {

    public static int[] insertionSort(int[] A) {
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            //找到 key 应该插入的位置,并整理数组顺序
            while (i >= 0 && key < A[i]) {
                A[i + 1] = A[i];
                TestUtil.printArray(A);
                i--;
            }
            //将 key 插入正确的位置
            A[i + 1] = key;
        }
        return A;
    }
}
