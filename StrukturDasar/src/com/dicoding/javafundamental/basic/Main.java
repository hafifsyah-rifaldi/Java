package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.music.Gitar;
import com.dicoding.javafundamental.basic.kendaraan.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Gitar.Bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}