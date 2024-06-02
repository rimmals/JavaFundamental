package com.juaracoding.rujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] film = new String[5]; // Array untuk menyimpan nama film


        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan nama film ke-" + (i+1) + ": ");
            film[i] = scanner.nextLine();
        }


        System.out.println("\nDaftar film yang ingin Anda tonton:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + film[i]);
        }

        scanner.close(); // Tutup scanner setelah pengguna selesai memasukkan data
    }
}
