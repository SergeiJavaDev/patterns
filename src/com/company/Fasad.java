package com.company;

public class Fasad {

    public static void main(String[] args) {
       Parameters parameters = new Parameters();
       parameters.lounge();
    }
}
 interface Animals{
    void eat();
    void speed(int s);
 }

 interface Fish
 {
     void swimming();
     void speed(int s);
 }

 class Tiger implements Animals{

     @Override
     public void eat() {
         System.out.println("Тигр ест мясо");
     }

     @Override
     public void speed(int s) {
         System.out.println("Скорость: " + s);
     }
 }

 class Shark implements Fish{

     @Override
     public void swimming() {
         System.out.println("Акула плавает");
     }

     @Override
     public void speed(int s) {
         System.out.println("Скорость: " + s);
     }

 }
 class Parameters{

     private final Shark shark;
     private final Tiger tiger;

     public Parameters() {
         this.shark = new Shark();
         this.tiger = new Tiger();
     }

     public void lounge(){
         int fishSpeed = 60;
         shark.speed(fishSpeed);
         shark.swimming();
         int animalSpeed = 100;
         tiger.speed(animalSpeed);
         tiger.eat();
     }
 }