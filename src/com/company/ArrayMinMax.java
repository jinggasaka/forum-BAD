package com.company;
import java.util.*;

public class ArrayMinMax {

    public static void main(String[] args) {
	System.out.println("Program array maximum");

	int maksimum, minimum, jumlah, i, array[];
	Scanner scan = new Scanner(System.in);
	System.out.print("Masukkan jumlah array: ");
	jumlah = scan.nextInt();
	array = new int[jumlah];

	for(i = 0; i < jumlah; i++) {
	    System.out.print("Array ke - "+ (i+1) +": " );
	    array[i] = scan.nextInt();
        }
	maksimum = array[0];
        for(i = 0; i < jumlah; i++) {
            if (array[i] > maksimum){
                maksimum = array[i];
            }
        }
        System.out.println("Nilai makasimum adalah "+maksimum);

        minimum = array[0];
        for(i = 0; i < jumlah; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        System.out.println("Nilai makasimum adalah "+minimum);
    }
}
