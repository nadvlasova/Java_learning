package ru.home.lesson6;

import ru.home.lesson6.animals.Animal;
import ru.home.lesson6.animals.Cat;
import ru.home.lesson6.animals.Cow;
import ru.home.lesson6.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
//        Cat cat = new Cat("Tom", 7, 2);
//        cat.info();
//        cat.jump();
//        //cat.meow();
//        cat.voice();
//
//        Dog dog = new Dog("Trek", 14);
//        dog.info();
//        dog.jump();
//        //dog.bark();
//        dog.voice();
//
//        Cow cow = new Cow("Marusia", 5);
//        cow.info();
//        cow.jump();
//        //cow.moo();
//        cow.voice();


//    Animal cat = new Cat("Rio", 5, 5); // Наследуется от подкласса Animal.
//    Dog dog = new Dog("Max", 8); // Наследуется от класса Dog.
//    Object cow = new Cow("Dusy", 6); // Наследуется от глобального класса java Object. Почти никогда так не делают.
//    Animal someAnimal = new Cat("someCat", 8,8); // как понять к какому класу относится someAnimal.
//
//
//    // cat унаследован от Animals и у него можно вызывать методы из Animals, но если метод определён только
//    // в классе Cat придется кастомизировать(?)
//    ((Cat) cat).catThings(); // тут мы конкретно прописываем, что cat это тот который от класса Cat
//        // и у него есть catThings, если вместо Cat поставить Dog будет ошибка кастомизации.
//
//    // или так: если Animal someAnimal = new Dog, то метод не сработает и ничего не выведится в консоль
//        if(someAnimal instanceof Cat) {
//            ((Cat) someAnimal).catThings();
//        }
//
//    cat.info();
//    cat.voice();
//    dog.voice();


        Cat cat = new Cat("cat2", 2, 2);

        Animal[] animals = {
                new Cat("cat",1,1),
                new Dog("dog",2),
                new Cow("cow",3),
                new Horse("horse",4),
                cat
        };

        for (Animal animal : animals) {
            System.out.println(animal);
        }

////        for (int i = 0; i < animals.length; i++) {
////            animals[i].voice();
////        }
//
//
//        // типа for each говорит объяви переменную Animal, которая ссылается на класс animals и пройдись по элементам.
//        for (Animal animal : animals) {
//            animal.voice();
//        }
//
//        for (Animal animal : animals) {
//            if (animal instanceof Cat) {
//                ((Cat) animal).catThings();
//            }
//        }
    }
}
