package com.codility.lessons.sorting;

import java.util.HashSet;

public class Distinct {

    public static int solution(int[] A) {
        int N = A.length;
        var distinct = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            distinct.add(A[i]);
        }
        return distinct.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 0, -1}));
    }
}
