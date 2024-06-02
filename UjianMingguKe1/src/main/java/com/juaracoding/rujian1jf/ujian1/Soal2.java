package com.juaracoding.rujian1jf.ujian1;
import java.util.Scanner;

public class Soal2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan nama film: ");
            String namaFilm = scanner.nextLine();

            String namaFilmUpperCase = namaFilm.toUpperCase();
            System.out.println("Nama film dalam huruf besar: " + namaFilmUpperCase);

            scanner.close();


    }
}
