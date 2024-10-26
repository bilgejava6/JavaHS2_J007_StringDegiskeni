package com.muhammet;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /**
         * ifadelerin içerisinde bazen başlangıç ve bitişlerinde boşluklar olabiliyor, bu da
         * eşleştirmelerin yanlış olmasına neden oluyor.
         * trim()-> bir ifadenin başında ve sonunda olan boşluk karakterlerini temizler.
         *
         *  == -> REFERANS ADRESLERİNİ KARŞILAŞTIRIR
         *  .equals -> farklı nesneler ya da aynı nesnelerin içeriklerini karşılaştırır.
         *  String Pool -> aynı olan string ifadeler string havuzunda
         *  tekrar oluşturulmaz referansları aktarılır.
         */
        // sistemde olan şifre
        String userName = "muhammet@gmail.com";
        String password = "1234";
        // kullanıcı login arayüzünden giriş yaptığındai bilgiler
        String kullaniciAdi;
        String sifre;

        System.out.println("""
                ************************************
                ********     LOGIN PAGE   **********
                ************************************
                
                """);
        System.out.print("kullanıcı adı.......: ");
        kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("şifre ..............: ");
        sifre = new Scanner(System.in).nextLine();

//
//        System.out.println("userName.......: "+ userName);
//        System.out.println("kullaniciAdi...: "+ kullaniciAdi);
//        System.out.println("kullaniciAdi...: "+ kullaniciAdi.trim());

        String ifade = "     bugün java        dizileri ile ilgili konular işlenecek    .    ???    ";
//        System.out.println(ifade);
//        System.out.println(ifade.trim());

        System.out.println("userName......: " + userName);
        System.out.println("kullaniciAdi..: " + kullaniciAdi);

        if( userName.equals(kullaniciAdi.trim())  && password.equals(sifre.trim()) ){
            System.out.println("GİRİŞ BAŞARILI");
        }else{
            System.out.println("Kullanıcı adı ya da şifre hatalıdır.");
        }

        System.out.println();
        System.out.println();

        String ad = "deniz";
        String name = "    deniz   ";

        if(ad.equals(name.trim()))
            System.out.println("Ad doğrudur");
        else
            System.out.println("ad doğru değiildir.");



    }
}
