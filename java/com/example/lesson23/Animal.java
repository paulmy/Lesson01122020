package com.example.lesson23;

interface Life {
    int breathe = 50;

    public void Eat();

}


public abstract class Animal implements Life {
    String name;

    public abstract void Move();

    public abstract void Say();
}

class Dog extends Animal {

    @Override
    public void Move() {

    }

    @Override
    public void Say() {
        System.out.println("Gav Gav");
    }

    @Override
    public void Eat() {
        System.out.println("Nyam Nyam");
    }
}

class Cat extends Animal {

    @Override
    public void Move() {

    }

    @Override
    public void Say() {
        System.out.println("Meow");
    }

    @Override
    public void Eat() {

    }
}