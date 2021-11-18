package com.codility.lessons.stacksAndQueues;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B){
        int survivors = 0;
        var stack = new Stack<Integer>();
        for(int i=0; i < A.length; i++){
            var fish = A[i];
            var direction = B[i];
            if(direction == 0){
                if(!stack.isEmpty()){
                    while(!stack.isEmpty()) {
                        var oppFish = stack.pop();
                        if (oppFish > fish) {
                            stack.push(oppFish);
                            break;
                        }
                    }
                    if(stack.isEmpty()){
                        survivors++;
                    }
                }else{
                    survivors++;
                }
            }else{
                stack.push(fish);
            }
        }
        return survivors + stack.size();
    }

    public static void main(String[] args){
      var survivors = new Fish().solution(new int[]{4,5,2,1,4}, new int[]{0,1,1,0,0});
      System.out.println(survivors);
    }
}
