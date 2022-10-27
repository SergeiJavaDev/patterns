package com.company;

public class FactoryMethod {


    public static void main(String[] args) {
        PeripheryFactory peripheryFactory = new MouseFactory();
        peripheryFactory.connect();
    }
}

interface Periphery{
    void typeName();
}

class Keyboard implements Periphery{

    @Override
    public void typeName() {
        System.out.println("Клавиатура");
    }
}

class Mouse implements Periphery{

    @Override
    public void typeName() {
        System.out.println("Мышь");
    }
}

class Microphone implements Periphery{

    @Override
    public void typeName() {
        System.out.println("Микрофон");
    }
}

class KeyboardFactory extends PeripheryFactory{

    @Override
    Periphery get() {
        return new Keyboard();
    }
}

class MouseFactory extends PeripheryFactory{

    @Override
    Periphery get() {
        return new Mouse();
    }
}

class MicrophoneFactory extends PeripheryFactory{

    @Override
    Periphery get() {
        return new Microphone();
    }
}

   abstract class PeripheryFactory{
    public void connect(){
     Periphery periphery = get();
     periphery.typeName();

    }
    abstract Periphery get();
    }

