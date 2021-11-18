package com.codility.lessons.prefixSums;

public class MinAvgTwoSlice {
    public static int solution(int[] A) {

        int minOfTwo = Integer.MAX_VALUE;
        int minOfTwoIndex = -1;
        int minOfThree = Integer.MAX_VALUE;
        int minOfThreeIndex = -1;

        for (int i = 0; i < A.length - 1; i++) {
            int sum1 = A[i] + A[i + 1];
            if (sum1 < minOfTwo) {
                minOfTwo = sum1;
                minOfTwoIndex = i;
            }

            if (i < A.length - 2) {
                int sum2 = A[i]+ A[i + 1] + A[i + 2];
                if (sum2 < minOfThree) {
                    minOfThree = sum2;
                    minOfThreeIndex = i;
                }
            }
        }
        if (minOfThreeIndex == -1) {
            return minOfTwoIndex;
        }
        if (minOfTwo * 3 < minOfThree * 2) {
            return minOfTwoIndex;
        }
        if (minOfTwo * 3 > minOfThree * 2) {
            return minOfThreeIndex;
        }
        return Math.min(minOfTwoIndex, minOfThreeIndex);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
}
