package com.codility.lessons.iterations;

public class BinaryGap {
    public int solution(int N) {
        int longest = 0;
        var binary = Integer.toBinaryString(N).toCharArray();
        System.out.println(binary);
        var counter = 0;
        boolean started = false;
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == '1') {
                if (started) {
                    started = false;
                    longest = Math.max(longest, counter);
                    counter = 0;
                    i = i - 1;
                } else {
                    started = true;
                }
            } else {
                if (started) {
                    counter++;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        var answer = new BinaryGap().solution(2147483647);
        System.out.println(answer);
    }
}
