package com.dicoding.javafundamental.accessmodifier;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        /*System.out.println(kelasA.memberA);

        System.out.println(kelasA.functionA()); 
        
        memberA dan functionA dalam keadaan private pada class Main.java
        */

        System.out.println(kelasA.functionB());
    }
}
