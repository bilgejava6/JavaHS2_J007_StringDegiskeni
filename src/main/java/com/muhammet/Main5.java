package com.muhammet;

public class Main5 {
    public static void main(String[] args) {
        String ifade = "bugün, bugün müdür?";
        String yeniIfade = "yarın gelecek misin?";
        System.out.println(ifade + " " + yeniIfade);
        /**
         * + ile Stringler bir birine eklenir. birleştirilir.
         * Ancak + ile yapılan birleştirmelerde her bir değer
         * yeniden String Pool içerisinde adreslenir bu nedenle
         * bellek gereksiz yere şişer.
         * Bunun yerine bir nesnenin içerisindeki değerin diğer
         * değer ile bireleştirilmesi sağlanmalı ve tek nesne üzerinden
         * bu işlem yapılmalı
         */
        System.out.println("""
                **** CONCAT *****
                """);
        System.out.println(ifade.concat(" ").concat(yeniIfade));
        ifade.toUpperCase();
        System.out.println("method işlemleri değeri dğeiştirmez...: "+ ifade);
        /**
         * bir ifadenin içerisinde baş bir ifadenin ya da karakteribn
         * varolup olmadığını sorgulamak için
         * contains(VALUE) şeklinde arama yapılabilir.
         *
         */
        System.out.println("""
                ***** CONTAINS *****
                """);
        String yorum= "bu post u hiç beğenmedim, çok biçimsiz çıkmışsın";
        if(yorum.contains("biçimsiz")){
            System.out.println("yorumunuz argo içermekte lütfen düzeltiniz.");
        }else
            System.out.println("yorumuzu paylaşıldı.");

        /**
         * ifade içerisindeki aramaların ifadenin başlangıç değerleri ile
         * örtüşüp örtüşmediğine bakmak, yani bununla başlıyor mu?
         * startsWith();
         */
        ifade = "STK002-BilgisayarKablosu";
        System.out.println("""
                ***** STARTSWITH *******
                """);
        if(ifade.startsWith("STK002"))
            System.out.println("Bu bilgisayar kablosu dur");
        else if(ifade.startsWith("STK003"))
            System.out.println("Yazıcı");
        else
            System.out.println("Tanımsız ürün");

        ifade.endsWith(""); // bununla bitiyor ise
        /**
         * replace -> bir ifade içerisinde değiştirilmesi gereken
         * değerlerin yeni değerleri ile atanması işlemini yapar
         */
        System.out.println("""
                **** REPLACE *****
                """);
        String sozlesme = "İş bu sözleşme, [EV_SAHİBİ] ile [KİRACI] arasında" +
                " [TUTAR] fiyat ile anlaşılmıştır";
        System.out.println(
                sozlesme
                        .replace("[EV_SAHİBİ]","Muhammet HOCA")
                        .replace("[KİRACI]","Demet")
                        .replace("[TUTAR]","29.000₺ ")
        );

        String dosyaAdi = "istanbul gezisi şehir incelemesi.jpg";
        // URL -> boşluk olmaz, türkçe karakter olmaz, _* gibi olmaz
        String newUrl = dosyaAdi.replace(" ", "-")
                .replace("ş","s");
        System.out.println("url....: "+ newUrl);

        System.out.println("""
                **** equalsIgnoreCase ****
                """);

        /**
         *
         */
        String ad = "Muhammet";
        String name = "MuHammET"; // muhammet

        if(ad.equalsIgnoreCase(name))
            System.out.println("İki isim eşittir");

        String isimler = "Deniz, Bahar, Emre, Kenan, Leyla, Türkan, Zeynep, Emirhan, Demir";

        System.out.println("""
                ***** SPLIT ******
                """);
        int virgulNerede = -2;
        do{
            ad = isimler.indexOf(",",virgulNerede+2)==-1
                    ? isimler.substring(virgulNerede+2)
                    : isimler.substring(virgulNerede+2,isimler.indexOf(",",virgulNerede+2));
            System.out.println("ad....: "+ ad);
            virgulNerede = isimler.indexOf(",",virgulNerede+2);
        }while (virgulNerede != -1);


        String[] dizi =  isimler.split(", "); // {"Deniz","Bahar", "Emre" ...}
        for(int i=0;i<dizi.length;i++)
            System.out.println(dizi[i]);


        String telefonNumasralari = "0 555 999 8877 - 0 555 994 5544 - 0 315 225 8777";
        String[] tlfList =  telefonNumasralari.split(" - ");
        for (int i=0;i<tlfList.length;i++)
            System.out.println(tlfList[i]);


    }
}
