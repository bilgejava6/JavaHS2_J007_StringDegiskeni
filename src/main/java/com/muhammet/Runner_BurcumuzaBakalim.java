package com.muhammet;

import java.net.URL;
import java.util.Scanner;

public class Runner_BurcumuzaBakalim {
    public static void main(String[] args) throws Exception {
        System.out.println("""
                ************************************
                ******      BURC YORUMU      *******
                ************************************
                1- Koç
                2- Boğa
                3- İkizler
                4- Yengeç
                5- Aslan
                6- Başak
                7- Terazi
                8- Akrep
                9- Yay
                10- Oğlak
                11- Kova
                12- Balık
                """);
        System.out.print("Burcunuzu seçiniz ....: ");
        int secim = new Scanner(System.in).nextInt();
        String burc= switch (secim){
            case 1 -> "koc";
            case 2 -> "boga";
            case 3 -> "ikizler";
            default ->"";
        };
//        switch (secim){
//            case 1: burc="koc"; break;
//            case 2: burc="boga"; break;
//            case 3: burc="ikizler"; break;
//        }

        URL url = new URL("https://www.elle.com.tr/astroloji/"+ burc.toLowerCase());
        Scanner scannerWebSite = new Scanner(url.openStream(), "UTF-8");
        while (scannerWebSite.hasNext()){
            String satir = scannerWebSite.nextLine();
            if(satir.contains("<p>")) {
                System.out.println(satir
                        .replace("<p>", "")
                        .replace("</p>", "")
                        .replace("<br>", "")
                );
                break;
            }
        }



    }
}
