package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.music.Gitar;
import com.dicoding.javafundamental.basic.kendaraan.*;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gitar.Bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tommorow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tommorow);
    }
}