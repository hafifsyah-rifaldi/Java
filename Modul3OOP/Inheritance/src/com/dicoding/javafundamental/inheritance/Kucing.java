package com.dicoding.javafundamental.inheritance;

public class Kucing extends Hewan {
    public Kucing() {
        // super(); // akan tetap memanggil constructor dari parent class
        System.out.println("construct Kucing");
    }
    
    public void makan(){ //overriding
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String food){ //overloading
        System.out.println("Kucing makan " + food);
    }
}
