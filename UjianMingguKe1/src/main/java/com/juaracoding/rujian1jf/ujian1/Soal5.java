package com.juaracoding.rujian1jf.ujian1;
import java.text.NumberFormat;
import java.util.Locale;

public class Soal5 {
    public static void main(String[] args) {

            int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};


            Locale localeID = new Locale("id", "ID");
            NumberFormat formatMataUang = NumberFormat.getCurrencyInstance(localeID);


            int totalHarga = 0;
            for (int i = 0; i < hargaTiket.length; i++) {

                String hargaFormatted = formatMataUang.format(hargaTiket[i]);
                System.out.printf("Harga tiket film %d: %s\n", (i + 1), hargaFormatted);
                totalHarga += hargaTiket[i];
            }


            String totalHargaFormatted = formatMataUang.format(totalHarga);

            System.out.println("Total harga tiket untuk semua film: " + totalHargaFormatted);


    }
}
