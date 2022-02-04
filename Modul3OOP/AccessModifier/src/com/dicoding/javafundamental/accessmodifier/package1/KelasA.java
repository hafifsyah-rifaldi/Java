package com.dicoding.javafundamental.accessmodifier.package1;

import java.lang.reflect.Method;

public class KelasA {   // access modifier DEFAULT

    private int memberA = 5;

    char memberB = 'A';     // access modifier DEFAULT
    double memberC = 1.5;   // access modifier DEFAULT

    private int functionA(){
        return memberA;
    }

    int functionB(){
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;   
    }

    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
