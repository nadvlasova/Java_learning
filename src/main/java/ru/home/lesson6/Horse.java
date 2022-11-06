package ru.home.lesson6;

import ru.home.lesson6.animals.Animal;

public class Horse extends Animal {
    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + " igo-go");
    }
}
