package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args){
        long faktorial = 1;
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai N pada Faktorial: ");
        int n = in.nextInt();


        for(int i = 1; i<=n; i++){
            faktorial = i * faktorial;
        }
        System.out.println("Hasil dari "+n+"! adalah "+faktorial);
    }
}
