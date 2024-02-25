package com.berkay;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Works {
    /**
     * Ankara
     * Bursa
     * Antalya
     * Artvin
     * Erzurum
     * Karaman
     * <p>
     * Bu şehirlerde bir liste oluşturalım
     * 1- An ile başlayan şehirleri listeden silmenizi istiyorum bir method yazalım
     */

    public static void main(String[] args) {
        List<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("Bursa");
        sehirler.add("Antalya");
        sehirler.add("Artvin");
        sehirler.add("Erzurum");
        sehirler.add("Karaman");
       // anIleBaslayanSehirleriSil(sehirler);
//        anIleBaslayanSehirleriGuncelle(sehirler);
//        sehirler.forEach(System.out::println);

        List<String> sehirler2 = new ArrayList<>(List.of("Ankara","Antalya","Bursa"));
        sehirler2.forEach(System.out:: println);




    }

    public static void anIleBaslayanSehirleriSil(List<String> sehirler) {
        for (int i = 0; i < sehirler.size(); i++) {
            if (sehirler.get(i).startsWith("An")) {
                sehirler.remove(i);
                i--;
            }
        }
    }
// foreach asenkron yapıda çalıştığı için "silme ve ekleme" işlemlerş foreach üzerinden yapılamaz!
//public static void anIleBaslayanSehirleriSil2(List<String> sehirler) {
//    for (String sehir : sehirler) {
//        if (sehir.startsWith("An")) {
//            sehirler.remove(sehir);
//        }
//    }
//}
public static void anIleBaslayanSehirleriGuncelle(List<String> sehirler) {
    for (int i = 0; i < sehirler.size(); i++) {
        if (sehirler.get(i).startsWith("An")) {
            sehirler.set(i,"xxx");
            i--;
        }
    }

}}
