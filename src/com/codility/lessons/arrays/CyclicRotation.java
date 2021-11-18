package com.codility.lessons.arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (K == 0 || A.length == 0) {
            return A;
        }
        var rotated = new int[A.length];

        int multiplier = K / A.length;
        if (K % A.length == 0) {
            multiplier--;
        }
        int index = A.length - (K - (A.length * multiplier));


        for (int i = 0; i < A.length; i++) {
            rotated[i] = A[index];
            index++;
            if (index > A.length - 1) {
                index = 0;
            }
        }

        return rotated;

    }

    public static void main(String[] args) {

        var answer = new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 9);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(" " + answer[i]);
        }
    }
}
