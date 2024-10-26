package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan adını alan ve adını tersten yazdıran kodu yazınız.
         * M u h a m m e t ->
         * 0 1 2 3 4 5 6 7 = 8 karakterli
         * temmahuM
         *
         */
        System.out.print("Lütfen adınızı giriniz...: ");
        String ad = new Scanner(System.in).nextLine();
        for(int i=ad.length()-1; i>=0; i--)
            System.out.print(ad.charAt(i));



    }
}
