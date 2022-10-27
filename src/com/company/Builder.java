package com.company;

public class Builder {

    int calories;
    int minerals;
    int fat;
    int protein;

static class MyBuilder{

    int calories = 100;
    int minerals = 20;
    int fat = 15;
    int protein = 30;

    public MyBuilder calories(int value){

        calories = value;
        return this;
    }

    public MyBuilder fat(int value){

        fat = value;
        return this;
    }

    public MyBuilder minerals(int value){

        minerals = value;
        return this;
    }

    public MyBuilder protein(int value){

        protein = value;
        return this;
    }

    public Builder build()
    {

    return new Builder(this);}
}

private Builder (MyBuilder myBuilder)
{
    calories = myBuilder.calories;
    minerals = myBuilder.minerals;
    fat = myBuilder.fat;
    protein = myBuilder.protein;
}

}

