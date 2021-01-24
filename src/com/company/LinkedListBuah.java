package com.company;
import java.util.LinkedList;

public class LinkedListBuah {
    public static void main(String[] args) {
            LinkedList<String> buah = new LinkedList();

            buah.add("Kelengkeng");
            buah.add("Papaya");
            buah.add("Melon");
            buah.add("Apel");
            buah.add("Jeruk");
            buah.add("Jambu");
            buah.add("Alpukat");


            System.out.println("Nama Buah-Buahan: "+buah);

            System.out.println("Data Teratas: "+buah.getFirst());
    }
}


