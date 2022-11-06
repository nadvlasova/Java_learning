package ru.home.lesson6.animals;

public class Dog extends Animal {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + " gav-gav");
    }

}
