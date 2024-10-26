package com.muhammet;

public class Runner_PerformansSorunu {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int islemAdedi= 100_000;
        String ifade = "Muhammet HOCA";
        for(int i=0; i<islemAdedi; i++){
            ifade = ifade + i; // her seferinde bir nesne yaratılıyor.
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("total time: " + totalTime);

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Muhammet HOCA");
        islemAdedi = 10_000_000;
        for(int i=0; i<islemAdedi; i++){
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("total time: " + totalTime);


        /**
         * Muhammet HOCA
         * Muhammet HOCA0
         * Muhammet HOCA01
         * Muhammet HOCA012
         * Muhammet HOCA00123....
         */

    }
}
