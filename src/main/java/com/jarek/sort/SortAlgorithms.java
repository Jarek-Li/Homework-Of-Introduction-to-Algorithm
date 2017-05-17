package com.jarek.sort;

/**
 * Created by Jarek on 2017/5/17.
 */
public class SortAlgorithms {

    /**
     * 插入排序 时间复杂度为 n^2
     * @param A
     * @return
     */
    public static int[] insertionSort(int[] A) {                // 代价     次数
        for (int j = 1; j < A.length; j++) {                    // c1       n
            int key = A[j];                                     // c2       n-1
            int i = j - 1;                                      // c3       n-1
            //找到 key 应该插入的位置,并整理数组顺序
            while (i >= 0 && key < A[i]) {                      // c4       ∑j
                A[i + 1] = A[i];                                // c5       ∑(j-1)
                i--;                                            // c6       ∑(j-1)
            }
            //将 key 插入正确的位置
            A[i + 1] = key;                                     //c7        n-1
        }
        return A;                                               //c8        1
    }
}
