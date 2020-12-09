package com.company;
import java.text.DateFormatSymbols;
import java.util.Scanner;

public class DisplayShortMonths {
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bulan ke (1-12): ");
        String shortMonth = shortMonths[scan.nextInt()%12-1];
        System.out.println("Display Short Month = " + shortMonth);
    }
}
