package com.jarek.chapter_two;

/**
 * Created by Jarek on 2017/5/17.
 * 算法导论 第三版第二章练习题
 */
public class ChapterTwoExercises {
    /**
     * 第二章习题1-3 page(22)
     * 考虑以下查找问题:
     * 输入: n 个数的一个序列 A=<a1,a2,....,an>和一个值 v
     * 输出: 下标 i 使得 v=A[i]或者当 v 不在 A 中出项时, v 为特殊值-1
     */
    public static int chapterTwo1_3(int[] A, int v) {
        int i = 0,length = A.length;
        while (i<length && A[i] != v){
            i++;
        }
        return i == length ? -1 : i;
    }
}
