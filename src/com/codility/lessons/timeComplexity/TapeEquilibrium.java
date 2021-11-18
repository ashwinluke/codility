package com.codility.lessons.timeComplexity;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        int rightSummation = 0;
        for (int i = 0; i < A.length; i++) {
            rightSummation += A[i];
        }
        int leftSummation = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            leftSummation += A[i];
            rightSummation -= A[i];
            minDiff = Math.min(Math.abs(leftSummation - rightSummation), minDiff);
        }
        return minDiff;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
    }

}
