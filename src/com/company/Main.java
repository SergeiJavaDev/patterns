package com.company;

public class Main {

    public static void main(String[] args) {

Singletone singletone = Singletone.getInstance();
Singletone singletone1 = Singletone.getInstance();
        System.out.println(singletone.equals(singletone1));

    }



}
