package ru.home.lesson7;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
//        String str = "Java";
//        System.out.println(str);
//        str += " and Python."; // конкатенация. Тут создается новый объект в памяти.
//        System.out.println(str);

        // Такой пример создаст 100000 ненужных элементов в памяти ПК и положат его. Нужно использовать
        // StringBuilder он создает не строки, а массивы из строк, это сильно сократит загрузку памяти.
//        String str = "A";
//        for (int i = 0; i < 100000; i++) {
//            str += "A";
//        }

//        StringBuilder strBuilder = new StringBuilder(100000); // capacity задает массив определенной длинны.
//        for (int i = 0; i < 100000; i++) {
//            strBuilder.append("A"); // это тоже самое что и str += "A" только с массивом.
////            strBuilder.getChars(3,7,10, ); // получение символов массива, с параметрами не понятно?????
//        }
//        System.out.println(strBuilder.toString());

//        String str1 = "Java";
//        String str2 = new String("Java");
//        String str3 = "Java";
//        System.out.println(str1 == str2);
//        System.out.println(str2 == str3); // False т.к. str2 это новый отдельный элемент в Heap.
//        System.out.println(str1 == str3); // True str1 str3 это ссылки на один и тот же объект в StringPool.
//        System.out.println(str1.equals(str2)); // Можно проверить значение этих объектов через метод equals.
//        System.out.println(str1.getBytes(StandardCharsets.UTF_8)); // вернёт строку в байтах.
//        System.out.println(str1.indexOf("v")); // Получение индекса символа в строке(у "v" индекс 2 т.к.
//        // индексация с 0.), если символа нет, то получим -1(такого индекса в природе нет????)
//        System.out.println(str1.toUpperCase()); // Приведение к верхнему регистру.
//        System.out.println(str1.contains("av")); // Включет ли в себя str1 "av".

//        String str = "Home Sweet Home";
//        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println(str);
//
//        System.out.println(str.endsWith("me")); // Заканчивается ли str на "me" => True.


//        String a = "A";
//        String b = "A";
//        System.out.println(a == b); // a и b один и тот же объект в StringPool.
//        a += "1";
//        b += "1";
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a == b); // После конкатенации два отдельных объекта в Heap с ожинаковым значением.

//        Cat cat = new Cat("cat");
//        Plate plate = new Plate(50);
//        Plate plate1 = new Plate(100);
//        //plate.info();
//        cat.info();
//
//        // Чтобы сделать правильно и универсально, нужно чтобы этот метод объединял все эти классы.
//        // Этот метод описывает, что какой-то кот ест из тарелки, опишем это в классе Cat методом eat.
////        plate.setFood(plate.getFood() - cat.getAppetite());
////        cat.setHungry(false);
////        System.out.println(cat.getName() + " поел из тарклки!");
//        cat.eat(plate1);
//
//        plate1.info();
//        cat.info();


        Toy toy = new Toy("Teddy");
        ToyBox toyBox = new ToyBox();
        toyBox.open();
        toyBox.putToy(toy);
        toyBox.close();
        System.out.println(toyBox.extractToy());
        toyBox.open();
        Toy extractedToy = toyBox.extractToy();
        if (extractedToy != null) {
            System.out.println(extractedToy.getName());
        }


        }
}
