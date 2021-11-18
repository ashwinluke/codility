package com.codility.lessons.prefixSums;

public class CountDiv {

    public static int solution(int A, int B, int K) {
        int lower = A % K == 0 ? A / K - 1 : A / K;
        int upper = B / K;
        return upper - lower;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }
}
