package com.muhammet;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String ifade = "metin";

        System.out.println(" >'metin'.isEmpty() ...: "+ifade.isEmpty());
        System.out.println(" >'metin'.isBlank() ...: "+ifade.isBlank());


        ifade = "    ";

        System.out.println(" >'   '.isEmpty() ...: "+ifade.isEmpty());
        System.out.println(" >'   '.isBlank() ...: "+ifade.isBlank());


        ifade = "";

        System.out.println(" >''.isEmpty() ...: "+ifade.isEmpty());
        System.out.println(" >''.isBlank() ...: "+ifade.isBlank());

        System.out.print("Adınızı giriniz.......: ");
        String adiniz = new Scanner(System.in).nextLine();
        if(adiniz.isBlank())
            System.out.println("Adınız boş geçemezsiniz, lütfen bir değer giniz");
        else
            System.out.println("adınız....: "+ adiniz.toUpperCase());


    }
}
