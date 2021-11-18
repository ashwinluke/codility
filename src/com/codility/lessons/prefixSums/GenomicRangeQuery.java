package com.codility.lessons.prefixSums;

public class GenomicRangeQuery {

    public static int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;

        int a = 0;
        int c = 0;
        int g = 0;

        int[] posOfA = new int[N + 1];
        int[] posOfC = new int[N + 1];
        int[] posOfG = new int[N + 1];

        var result = new int[P.length];
        for (int i = 0; i < N; i++) {
            var ch = S.charAt(i);
            if (ch == 'A') {
                a++;
            } else if (ch == 'C') {
                c++;
            } else if (ch == 'G') {
                g++;
            }
            posOfA[i + 1] = a;
            posOfC[i + 1] = c;
            posOfG[i + 1] = g;
        }
        for (int i = 0; i < M; i++) {
            int r = 4;
            if (posOfA[Q[i] + 1] - posOfA[P[i]] != 0) {
                r = 1;
            } else if (posOfC[Q[i] + 1] - posOfC[P[i]] != 0) {
                r = 2;
            } else if (posOfG[Q[i] + 1] - posOfG[P[i]] != 0) {
                r = 3;
            }
            result[i] = r;
        }
        return result;

    }

    public static void main(String[] args) {
        var result = solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
        for (int i : result
        ) {
            System.out.println(i);
        }
    }
}
