package com.codility.lessons.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static int solution(int[] A) {
        int N = A.length;
        Arrays.sort(A);
        return Math.max(A[N - 1] * A[N - 2] * A[N - 3], A[0] * A[1] * A[N - 1]);

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, 1, 2, -5, 5, 6}));
    }
}
