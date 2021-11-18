package com.codility.lessons.sorting;

import java.util.Arrays;

public class Triangle {
    public static int solution(int[] A) {
        int N = A.length;
        if (N < 3) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < N - 2; i++)
        {
            int P = A[i];
            int Q = A[i + 1];
            int R = A[i + 2];
            if (P > R - Q) {
                if (Q > P - R) {
                    if (R > Q - P) {
                        return 1;
                    }
                }
            }
        }
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 50, 5, 1}));
    }

}
