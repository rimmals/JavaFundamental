package com.juaracoding.rujian1jf.ujian1;
import java.util.Locale;
import java.text.NumberFormat;


public class Soal3 {
    public static void main(String[] args) {

        int weekdayPrice = 35000;
        int weekendPrice = 45000;
        int numberOfTicketsPurchased = 7;

        int totalPrice;
        String ticketType;
        if (numberOfTicketsPurchased > 5) {
            totalPrice = (int) (numberOfTicketsPurchased * weekendPrice * 0.9); // Disc 10%
            ticketType = "Weekend";
        } else {
            totalPrice = numberOfTicketsPurchased * weekendPrice;
            ticketType = "Weekend";
        }


        Locale localeID = new Locale("id", "ID");
        NumberFormat formatMataUang = NumberFormat.getCurrencyInstance(localeID);


        String formattedWeekdayPrice = formatMataUang.format(weekdayPrice);
        String formattedWeekendPrice = formatMataUang.format(weekendPrice);
        String formattedTotalPrice = formatMataUang.format(totalPrice);


        System.out.println("Jumlah Tiket yang Dibeli: " + numberOfTicketsPurchased);
        System.out.println("Jenis Tiket: " + ticketType);
        System.out.println("Harga Tiket (" + ticketType + "): " + (ticketType.equals("Weekend") ? formattedWeekendPrice : formattedWeekdayPrice));
        System.out.println("Total Harga Tiket (Setelah Diskon): " + formattedTotalPrice);
    }
}




