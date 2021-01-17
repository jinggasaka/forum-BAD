package com.company;

public class Exceptions {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Umur kamu belum cukup");
        }
        else {
            System.out.println("Silahkan melanjutkan");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}

