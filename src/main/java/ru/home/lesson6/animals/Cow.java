package ru.home.lesson6.animals;

public class Cow extends Animal{
    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println(name + " moooo");
    }

}
