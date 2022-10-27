package com.company;

public class Main {

    public static void main(String[] args) {
    Builder builder = new Builder.MyBuilder().calories(100).minerals(15).fat(10_000).protein(40).build();
        System.out.println(builder.calories);
    }
}
