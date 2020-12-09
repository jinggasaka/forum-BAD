package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisplayCurrentDateAndTime {
    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now();
        LocalTime waktuSekarang = LocalTime.now();
        System.out.println("Current Date = " + tanggalSekarang + " Current Time = " + waktuSekarang);
    }
}
