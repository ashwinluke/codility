package com.codility.lessons.countingElements;

public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int maximum = 0;
        int currentMax = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if(counter[A[i] - 1] < currentMax){
                    counter[A[i] - 1] = currentMax;
                }
                maximum = Math.max(++counter[A[i] - 1], maximum);

            } else {
                currentMax = maximum;
            }
        }
        for(int i = 0; i< N; i++){
            if(counter[i] < currentMax){
                counter[i] = currentMax;
            }
        }
        return counter;

    }

//    private static void maximise(int maximum, int[] counter) {
//        for (int i = 0; i < counter.length; i++) {
//            counter[i] = maximum;
//        }
//    }


    public static void main(String[] args) {
        var answer = solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
        for (int i = 0; i < answer.length; i++) {
            System.out.print(" " + answer[i]);
        }
    }
}
