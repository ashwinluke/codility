package com.codility.lessons.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution1(int[] A) {

        if (A.length == 1) {
            return A[0];
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i = i + 2) {
            if (i == A.length - 1) { //last element
                return A[i];
            }
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        var answer = new OddOccurrencesInArray().solution(new int[]{2, 4, 3, 3, 2});
        System.out.println(answer);
    }

    public int solution(int[] A) {
        var temp = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {

            if (temp.contains(A[i])) {
                temp.remove(A[i]);
            } else {
                temp.add(A[i]);
            }
        }
        return temp.iterator().next();
    }
}
