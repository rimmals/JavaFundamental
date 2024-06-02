package com.juaracoding.rujian1jf.ujian1;
import java.util.Locale;
import java.text.NumberFormat;
public class Soal1 {
    public static void main(String[] args) {
        // Cinema Ticket Information
        String movieName = "The Architecture of Love";
        double ticketPrice = 25000.0;
        int numberOfTickets = 128;

        Locale localeID = new Locale("id", "ID");
        NumberFormat formatMataUang = NumberFormat.getCurrencyInstance(localeID);


        // Will display movie ticket information
        System.out.println("Cinema Ticket Information:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + formatMataUang.format(ticketPrice));
        System.out.println("Number Of Tickets: " + numberOfTickets);




    }
}
