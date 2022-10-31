package ru.home.lesson5;

public class Cat {
    // Описание параметров. Поля класса ВСЕГДА должны быть закрытыми == private! Это Инкапсуляция!
//    public String name;
//    public double weight;
//    public String type;
//    public String color;
//    public int age;
//    public String gender;

    // Ключевое слово static в определении параметров присваивает значение всем экземплярам класса.
    public static int age; // у всех экземпляров данного класса будет одно и тоже значение age.

    // Модификатор public дает возможность менять параметры из вне, чтобы это предотвратить меняем на private.
    private String name;
    private String color;
    // private int age;
    private double weight;




    // Конструктор класса по умолчанию.
    public Cat() {
        name = "Бездомный кот.";
        age = 5;
        color = "Неизвестный окрас.";
        weight = 9;
    }

    // Способ изменения значения private поля age.
    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
    }

    // Альтернативный способ изменения значения поля age, при вызове метода возраст увеличивается на 1 и больше никак!
    public void increaseAge() {
        this.age++;
    }

    // Метод для получения данных private поля age.
    public int getAge() {
        return age;
    }

    // Конструктор класса с параметрами.
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    //


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // Проверка, что элемент является экземпляром класса.
    public boolean isCurrentCat(Cat cat) {
        return this == cat;
    }

    public boolean isEqual(Cat cat) {
        if(cat == this) {
            return true;
        }
        return false;
    }


    // Описание действий.
    public void jump() {
        System.out.println(name + " прыгнул");
        decreaseWeight();
    }

    // Методы тоже могут быть private это метод который уменьшает вес кота при прыжках, пользователь может снгизить вес
    // кота только заставив его прыгать.
    private void decreaseWeight() {
        if(age > 10) {
            this.weight--;
            return;
        }
        this.weight -= 2;
    }

    // Метод вывода информации об экземпляре класса.
    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void sleep() {
        System.out.println(name + " уснул");
    }
}











