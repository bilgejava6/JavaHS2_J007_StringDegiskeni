package com.muhammet;

public class Runner_Ornek2 {
    public static void main(String[] args) {
        /**
         * Bir sosyal medya platformu uygula için paylaşılan yorumları
         * düzenlemek istemektedir. bu nedenle telefon numarası paylaşanları
         * testpit etmek ve uyarmak istiyor. bunu nasıl yapabiliriz?
         */

        String yorum = "bu post çok da düzel değil bana ulaşarak daha" +
                "etkili ve güzel postlar atabilirsiniz. beni ara: 0   3 5 5 9    9  9  7  7 4 4";
        //System.out.println(yorum.replaceAll(" ", ""));
        yorum = yorum.replaceAll(" ", "");
        // 01, 02, 03, 04, 05, 06, 07, 08, 09,
        for (int i=1;i<=9;i++){
          if(yorum.contains("0"+i))
              System.out.println("yorumlarda tlf bilgisi veremezsiniz..: "
                      +yorum.substring(yorum.indexOf("0"+i)));
        }

    }
}
