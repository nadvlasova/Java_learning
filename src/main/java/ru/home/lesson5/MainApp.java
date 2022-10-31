package ru.home.lesson5;

public class MainApp {
    public static void main(String[] args) {
//        // Создаем экземпляр класса Cat
//        Cat Tom = new Cat("Tom", "Green", 3);
////        Tom.name = "Tom";
////        Tom.color = "Green";
////        Tom.age = 3;
////        Tom.weight = 7;
//
//        Cat Sam = new Cat();
////        Sam.name = "Sam";
////        Sam.color = "Red";
////        Sam.age = 5;
////        Sam.weight = 10;
//
//        Tom.info();
//        Tom.jump();
//        Tom.sleep();
//
//        Sam.info();
//        Sam.jump();
//
//        System.out.println(Tom.isCurrentCat(Sam));
//        System.out.println(Tom.isCurrentCat(Tom));

//        Cat cat = new Cat("Tom", "Green", 3);
//        Cat cat1 = new Cat("Sam", "Red", 5);
//        Cat cat2 = new Cat("Bob", "Black", 7);
//
////        // Чтобы получать и менять поля private существуют get set.
////        System.out.println("Возраст Tom: " + cat.getAge());
////
////        // Меняем значение private поля age с помощью setAge.
////        cat.setAge(9);
////        System.out.println("Возраст Tom: " + cat.getAge());
//
////        cat.info();
////        cat1.info();
////        cat2.info();
//
//        // Благодаря public static int age; age будет равно у всех по последнему =7.
//        //Tom Green 7
//        //Sam Red 7
//        //Bob Black 7
//        //---------------------------------------------------
//
//        cat.info();
//        cat1.info();
//
//        Cat.age = 1;
//
//        cat2.info();
////        Tom Green 7
////        Sam Red 7
////        Bob Black 1

//        Math math = new Math();
//        System.out.println(math.sum(2, 3, 4, 5));
//        System.out.println(math.pow3(2));


//        System.out.println(Math.sum(2, 3, 4, 5));
//        System.out.println(Math.pow3(2));

        Cat[] cats = new Cat[3];
        System.out.println(cats[0]); // Так сработает, просто выдаст null
        // Почему здесь не сработал конструктор экземпляров класса по умолчанию????????????????????
        // потому что, экземпляр класса это ссылочный элемент с нулевым значением????? интересно,
        // ага при изменении возраста в конструкторе по умолчанию отработал корректно. Понятно.
        cats[0] = new Cat("Tom", "Green", 3);
        cats[1] = new Cat("Sam", "Red", 5);
        cats[2] = new Cat("Bob", "Black", 7);
        //        System.out.println(cats[0].getAge());

        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }

    }
}
