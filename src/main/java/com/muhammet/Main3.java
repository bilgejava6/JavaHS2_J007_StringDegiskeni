package com.muhammet;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String ifade = "Bugün havalar güzel olacak gibi, Sabah soğuk akşam ılık";
        /**
         * ifadenin karakterini BÜYÜK-küçük dönüşümüne tabi tutmak
         * lower-upper
         * ROOT -> karakterler farklı dillerde farklı şekilde dönüşebilir.
         * ENG -> i = I
         * TR -> i = İ
         * eğer karater dönüşümü dile göre seçilmez ise, JVM in kurulu olduğu
         * sunucunun dili referans alınır.
         */
        System.out.println(ifade.toLowerCase()); // tüm harfleri küçük yapar
        System.out.println(ifade.toUpperCase()); // tüm harfleri büyük yapar
        ifade.toLowerCase(Locale.ENGLISH);
        ifade.toLowerCase(Locale.forLanguageTag("tr-TR"));

        String userName = "muhammetalihoca@gmail.com";

        String kullaniciAdi;
        System.out.print("kullanıcı adınızı giriniz....: ");
        kullaniciAdi = new Scanner(System.in).nextLine();

        if(userName.equals(kullaniciAdi.trim().toLowerCase())){
            System.out.println("GİRİŞ BAŞARILI");
        }else{
            System.out.println("HATA!");
        }


    }
}
