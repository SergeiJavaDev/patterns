package com.company;

public class Fasad {

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

   final int animalSpeed = 100;
   final  int fishSpeed = 60;

     private final Shark shark;
     private final Tiger tiger;

     public Parameters(Shark shark, Tiger tiger) {
         this.shark = new Shark();
         this.tiger = new Tiger();
     }

     public void lounge(){
         shark.speed(fishSpeed);
         shark.swimming();
         tiger.speed(animalSpeed);
         tiger.eat();
     }
 }