package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {
    public Kucing() {
        super(); // akan tetap memanggil constructor dari parent class
        System.out.println("construct Kucing");
    }
    
}
