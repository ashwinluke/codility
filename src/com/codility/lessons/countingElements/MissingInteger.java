package com.codility.lessons.countingElements;

import java.util.Arrays;

public class MissingInteger {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int smallest = 1;
        for(int i = 0; i < A.length; i++){
            if(A[i] > smallest){
                return smallest;
            }
            if(A[i] == smallest ){
               smallest++;
            }

        }
        return smallest;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, -2, 1}));
    }
}
