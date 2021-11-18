package com.codility.lessons.prefixSums;

public class PassingCars {

    public static int solution(int[] A) {
        int passed = 0;
        int west = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                west++;
            } else {
                passed += west;
            }
            if (passed > 1000000000) {
                return -1;
            }

        }
        return passed;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 1, 1}));
    }
}
