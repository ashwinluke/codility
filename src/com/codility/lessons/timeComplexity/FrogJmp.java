package com.codility.lessons.timeComplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D){
        int jump = (Y - X) / D;
        if(jump * D < Y - X){
            jump++;
        }
        return jump;
    }

    public static void main(String[] args) {
        var answer = new FrogJmp().solution(10, 1000000000, 1000000000);
        System.out.println(answer);
    }
}
