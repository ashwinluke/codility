package com.codility.lessons.timeComplexity;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A) {
        if (A.length != 0) {
            Arrays.sort(A);
            for (int i = 1; i <= A.length+1; i++) {

                if (i == A.length + 1 || i != A[i - 1]) {
                    return i;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{}));
    }
}
