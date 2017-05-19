package com.jarek.sort;

/**
 * Created by Jarek on 2017/5/17.
 */
public class SortAlgorithms {

    /**
     * 插入排序 时间复杂度为 n^2
     *
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

    /**
     * 合并算法 其中 q <= p < r ,r-q+1 <= n
     * 子数组 A[q->p] 已排好序
     * 子数组 A[p+1->r] 已排好序
     *
     * @param A 需要合并的数组 A
     * @param q 子数组1起始下标
     * @param p 子数组1结束下标 p+1 子数组2起始下标
     * @param r 子数组2结束小标
     * @return A
     */
    public static int[] merge(int[] A, int q, int p, int r) {
        int m1 = p - q + 1; //第一个子数组的长度
        int m2 = r - p;     //第二个子数组的长度
        int[] arrL = new int[m1 + 1]; //子数组 A[q->p] 已排好序
        int[] arrR = new int[m2 + 1]; //子数组 A[p+1->r] 已排好序
        System.arraycopy(A, q, arrL, 0, m1);
        System.arraycopy(A, p + 1, arrR, 0, m2);
        arrL[m1] = Integer.MAX_VALUE; //哨兵
        arrR[m2] = Integer.MAX_VALUE; //哨兵
        for (int k = q, i = 0, j = 0; k <= r; k++) {
            if (arrL[i] < arrR[j]) { // 哨兵的奇妙作用,省去了很多边界条件的判断
                A[k] = arrL[i++];
            } else {
                A[k] = arrR[j++];
            }
        }
        return A;
    }

    /**
     * 归并排序
     *
     * @param A 待排序数组
     * @param q 数组起始下标
     * @param r 数组结束下标
     * @return
     */
    public static int[] mergeSort(int[] A, int q, int r) {
        if (q < r) {
            int p = (q + r) / 2;
            mergeSort(A, q, p);
            mergeSort(A, p + 1, r);
            return merge(A, q, p, r);
        } else {
            return A;
        }

    }

    /**
     * 归并排序数组 A
     *
     * @param A 待排序数组
     * @return A 已排好序
     */
    public static int[] mergeSort(int[] A) {
        return mergeSort(A, 0, A.length);
    }
}
