package com.company;
import java.io.File;

public class BuatFileLihatByteLength {
    public static void main(String[] args) {

        File newFile = new File("C:/Users/admin/documents/asa.txt");
        if (newFile.exists()) {
            System.out.println("Nama File: " + newFile.getName());
            System.out.println("Ukuran File: " + newFile.length() + "Bytes");
        } else {
            System.out.println("File belum ada");
        }

    }
}
