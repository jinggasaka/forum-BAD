package com.company;

public class ContinueLoopFor {
    public static void main(String[] args){
        for(int i=0; i<7; i++){
            if(i == 4){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }
}
