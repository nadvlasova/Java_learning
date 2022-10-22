package ru.home.lesson1;

//Перегрузка метода
public class MainApp {
    public static void main(String[] args) {
//        checkSumSign(1, 10);
//        checkSumSign(1, -10, -5);
//        int summary = sum(1,2,3);
//        System.out.println(summary);
//        System.out.println(sum(1, 2, 3));
//        System.out.println(pow3(2.6));



        //Цикл for.
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Java");
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i+=3) {
//            System.out.print(i + " ");
//
//        }

//        printWordMayTimes("Java", 3);
//        printWordMayTimes("Python", 3);
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        printMap(5, 5);

        //Цикл While.
//        int n = 100;
//        while (n <= 100_000){
//            n = (n + 10) * 4 - n / 2 + 21;
//            System.out.println(n);
//        }

//        int a = 10;
//        while (a< 100) {
//            a *= 2;
//            System.out.println(a);
//        }

//        int a = 200;
//        do {
//            a *= 2;
//            System.out.println(a);
//        } while (a < 100);


        //switch.

        int color = 5;

        switch (color) {
            case 1:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("YELLOW");
                break;
            case 3:
                System.out.println("GREEN");
                break;
            default:
                System.out.println("UNKNOWN!!!");
        }

        }

//    public static void printMap(int columns, int rows) {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public static void printWordMayTimes(String word, int iterations) {
//        for (int i = 0; i < iterations; i++) {
//            System.out.println(word);
//        }
//    }

//    public static double pow3(double number){
//        return number * number * number;
//    }
//    public static int sum(int a, int b, int c) {
//        int sum = a + b + c;
//        return sum;
//        return a + b + c;
//    }
//    public static void checkSumSign(int a, int b) {
////        int a = 1;
////        int b = 10;
//        int sum = a + b;
//
//        if(sum >= 0) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        System.out.println(sum);
//    }
//
//    public static void checkSumSign(int a, int b, int c) {
////        int a = 1;
////        int b = 10;
//        int sum = a + b + c;
//
//        if(sum >= 0) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        System.out.println(sum);
//    }
}
