package com.codility.lessons.countingElements;

import java.util.HashSet;

public class FrogRiverOne {

    public static int solution(int X, int[] A) {
        var path = new HashSet<Integer>();
        for (int i = 1; i <= X; i++) {
            path.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            path.remove(A[i]);
            if (path.isEmpty()) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{3, 3, 1, 3, 2, 1, 3}));
    }
}
