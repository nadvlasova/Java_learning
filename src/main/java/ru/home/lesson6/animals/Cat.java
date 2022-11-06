package ru.home.lesson6.animals;

public class Cat extends Animal{
    protected int clawLength;
    public Cat(String name, int age, int clawLength) {
        this.name = name;
        this.age = age;
        this.clawLength = clawLength;
    }

//    public void meow() {
//        System.out.println(name + " meow");
//    }
    @Override  // это значит этот метод мы переопределили. Так же у собаки и коровы.
    public void voice() {
         System.out.println(name + " meow");
    } // voice метод суперкласса Animal

    //Чтобы в info в MainApp выводился параметр clawLength который мы добавили только коту,
    // тут переопределяем метод info.
    @Override
    public void info() {
        super.info(); // вызов метода суперкласса Animals info без переопределения.
        System.out.println("CAT: " + name  + " " + age + " " + clawLength ); // а тут уже переопределяем этот метод.
    }

    public void catThings() {
        System.out.println("Some cat things going to here.");
    }

    @Override
    public String toString() {
        return "Это переопределенный метод toString в классе Cat.";
    }

}
