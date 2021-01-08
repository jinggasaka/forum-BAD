package com.company;

import java.io.File;
import java.io.IOException;

public class BuatFile {
    public static void main(String[] args) {
        try {
            File newFile = new File("C:/Users/admin/documents/asa.txt");
            if (newFile.createNewFile()) {
                System.out.println("File Berhasil Dibuat : " + newFile.getName());
            } else {
                System.out.println("File Sudah Ada");
            }
        } catch (IOException e) {
            System.out.println("Ups, eror gais!");
            e.printStackTrace();
        }
    }
}
