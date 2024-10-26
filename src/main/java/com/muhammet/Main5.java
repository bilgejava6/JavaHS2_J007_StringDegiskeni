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
        System.out.println(ifade.concat(" ").concat(yeniIfade));
        ifade.toUpperCase();
        System.out.println("method işlemleri değeri dğeiştirmez...: "+ ifade);
        /**
         * bir ifadenin içerisinde baş bir ifadenin ya da karakteribn
         * varolup olmadığını sorgulamak için
         * contains(VALUE) şeklinde arama yapılabilir.
         *
         */
        String yorum= "bu post u hiç beğenmedim, çok biçimsiz çıkmışsın";
        if(yorum.contains("biçimsiz")){
            System.out.println("yorumunuz argo içermekte lütfen düzeltiniz.");
        }else
            System.out.println("yorumuzu paylaşıldı.");


    }
}
