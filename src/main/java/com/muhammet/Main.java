package com.muhammet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * String.class
         * tanım: karakterler dizisi -> "Bugün" -> {'B','u','g','ü','n'}
         * ---------------
         * References Data Types (object)
         * -> heap alanında değerleri, stack alanında ise heap alanını refere eden adresleri vardır.
         */
        String ifade = "  Bugün Ankara güneşli   ve   orta sıcaklıkta idi.  bugün dışarıya çıkmadım :)     ";

        System.out.println(ifade);

        int ifadeninUzunlugu = ifade.length();
        System.out.println("ifadenin uzunluğu...: "+ ifadeninUzunlugu);
        /**
         * index-> bir dizi içerisindeki elamanın konumunu belirtmek için kullanılır.
         * DİZİ ->  {'B','u','g','ü','n'} 5 adet eleman var.
         *    index   0   1   2   3   4
         *    for(int i=0;i<5;i++)
         */
        System.out.println("25. karakter....: "+ ifade.charAt(8));
        /**
         * Soru: KUllanıcıdan adını alıp her harfini tek tek yazdıran kodu yanızı.
         * adınız: Ali
         * A
         * l
         * i
         */
        System.out.print("Lütfen adınızı giriniz...: ");
        String ad = new Scanner(System.in).nextLine();
        for(int i=0;i<ad.length();i++)
            System.out.println(ad.charAt(i));

        ifade = "  Bugün Ankara güneşli   ve   orta sıcaklıkta idi.  bugün dışarıya çıkmadım :)  ve " +
                "evde oturdum ve kahve hazırladım ve uyudum    ";
        int noktaIndex;
        noktaIndex = ifade.indexOf(".");
        System.out.println("Nokta nerede...: "+ noktaIndex);

        int bugunIndex = ifade.indexOf("bugün");
        System.out.println("bugün nerede...: "+ bugunIndex);

        /**
         * indexOf(VALUE) -> bir metin içerisinde aranılan değerin ilk rastlanıldığı yeri verir.
         * indexOf(VALUE,FROMINDEX) -> başlangıç index i verip oradan sonraki ilk rastlanılan yeri döner
         */


// V1:
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("1. konum....: "+ vIndex);
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("2. konum....: "+ vIndex);
//
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("3. konum....: "+ vIndex);
//
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("4. konum....: "+ vIndex);
//
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("5. konum....: "+ vIndex);
//
//        vIndex = ifade.indexOf("ve",vIndex+1);
//        System.out.println("6. konum....: "+ vIndex);

//v2
//
//        int vIndex = -1;
//        do{
//            vIndex = ifade.indexOf("ve",vIndex+1);
//            System.out.println("1. konum....: "+ vIndex);
//        }while (vIndex != -1);
// v3 efaktif çözüm

        int vIndex = -1;
        do{
            vIndex = ifade.indexOf("ve",vIndex+1);
            if (vIndex == -1) break;
            System.out.println("Konum....: "+ vIndex);
        }while (true);

        String email = "muhammet_hoca@gmail.com";
        String path = "tatil_fotosu_17.05.2012.png";

        noktaIndex = path.lastIndexOf(".");
        for (int i=noktaIndex+1;i<path.length();i++)
            System.out.print(path.charAt(i));
        System.out.println();
        /**
         * ifade = "murat taşkın";
         * substring(beginIndex) -> [beginIndex, length())   [] -> dahil - ()->hariç
         * ifade.sunstring(7) ->  [7,12)
         */
        String uzanti = path.substring(noktaIndex+1);
        System.out.println("Uzanti....: "+ uzanti);

        String isim = "Murat Taşkın";
        System.out.println("ismi kesmek... 3-8...: "+ isim.substring(3,8)); // at Ta

        /**
         * Kullanıcıdan adını ve soyadını yazmasını isteyin ve ad ve soyadını ayrı şekilde ekrana yazdırım.
         * örnek:
         *
         * ad ve soyadınız..: Muhammet HOCA
         *
         * adınız...: Muhammet
         * soyadınız: HOCA
         */

        System.out.print("Lütfen ad ve soyadınızı giriniz.....: "); // Muhammet HOCA
        String adSoyad = new Scanner(System.in).nextLine();
        int boslukIndex = adSoyad.indexOf(" ");
        String adiniz = adSoyad.substring(0,boslukIndex);
        String soyadiniz = adSoyad.substring(boslukIndex+1);
        System.out.println("adiniz....: "+ adiniz);
        System.out.println("soyadiniz....: "+ soyadiniz);

        /**
         * kullanıcıdan ad vesoyadını alınız ve doğum tarihini alınız.
         * bu bilgiler ile adın ilk harfini ve soyadın tamamını birleştirin
         * ve son olarak doğum yılını bu ifade ile birleştirin. sonra mail
         * adresi oluşturmak için bilgeadam.com u ekleyin.
         * ÖRN:
         * adınız...: Muhammet HOCA
         * doğum yılı: 1983
         *
         * email adresiniz.....: m.hoca1983@bilgeadam.com
         *
         */
        System.out.println("ad ve soyadınız....: ");
        adSoyad = new Scanner(System.in).nextLine();
        System.out.println("doğum yiliniz......: ");
        String dogumyili = new Scanner(System.in).nextLine();
        adiniz = adSoyad.substring(0,adSoyad.indexOf(" "));
        soyadiniz = adSoyad.substring(adSoyad.indexOf(" ")+1);
        email = adiniz.charAt(0)+ "."+soyadiniz+dogumyili+"@bilgeadam.com";
        System.out.println("email adresiniz...: "+ email);


    }
}