package com.company;

public class Decorator {
    public static void main(String[] args) {
        Countries countries = new Russia(99943, "Putin V.V.");

        Countries countries1 = new USA(countries);
        countries1.people();
    }
}

interface Countries{
    void people();
    void president();
}

class Russia implements Countries{
    int people;
    String president;

    public Russia(int people, String president) {
        this.people = people;
        this.president = president;
    }

    @Override
    public void people() {
        System.out.println("Количество людей: " + people);
    }

    @Override
    public void president() {
        System.out.println("Президент: " + president);
    }
}
class DecoratorCountry implements Countries{
    private Countries countries;
    private int people;
    private String president;

    public DecoratorCountry(Countries countries, int people, String president) {
        this.countries = countries;
        this.people = people;
        this.president = president;
    }

    @Override
    public void people() {
        countries.people();
    }

    @Override
    public void president() {
        countries.president();
    }
}
class USA extends DecoratorCountry{

    public USA(Countries countries) {
        super(countries, 15000000, "Biden");
    }



}