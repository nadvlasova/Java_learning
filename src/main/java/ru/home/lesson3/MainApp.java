package ru.home.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
//        int x0 = 0;
//        int x1 = 0;
//        int x2 = 0;
//        int x3 = 0;
//        int x4 = 0;

//        int[] arr = new int[5]; // создаем массив из 5-ти int-ов
//        arr[0] = 10;  // значение 1-го элемента в массиве теперь =10
//        arr[2] = 20;  // значение 3-го этлемента = 20, нумерация индексов с нуля, 5-ка не входит
//        System.out.println(arr[2]);
//        System.out.println(Arrays.toString(arr));
//        int sum = arr[0] + arr[2];
//        System.out.println(sum);



//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
//        int[] arr = new int[10];
//        System.out.println(arr.length);
////        for (int i = 0; i < 10; i++) {
////            arr[i] = 8;
////        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 8;
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {1, 2, 3};
//        int[] arr2 = arr;
//
//        arr[0] = 10;
//        arr2[1] = 20;
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));


//        int arr[] = new int[10];
//        for (int i = 0; i < arr.length / 2; i++) {
//            arr[i] = 3;
//        }
//        System.out.println(Arrays.toString(arr));  // [3, 3, 3, 3, 3, 0, 0, 0, 0, 0]
//        for (int i = arr.length / 2; i < arr.length; i++) {
//            arr[i] = 3;
//        }
//        System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0, 3, 3, 3, 3, 3]

//        for (int i = 2; i < arr.length - 2; i++) {
//            arr[i] = 3;
//        }
//        System.out.println(Arrays.toString(arr));  // [0, 0, 3, 3, 3, 3, 3, 3, 0, 0]

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        System.out.println(Arrays.toString(arr));  // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

//        for (int i = 0; i < arr.length; i++) {
////            arr[i] = (arr.length -1) -i;
//            arr[i] = 9 -i;
//        }
//        System.out.println(Arrays.toString(arr));  // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]


//        String[] arr = {"Java", "Python", "C#"};
//        System.out.println(Arrays.toString(arr));  // [Java, Python, C#]


//        int arr[] = new int[20];
//        for (int i = 1; i <= 20; i++) {
//            arr[i - 1] = i;
//        }
//        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//
//        clearArray(arr);
//        System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//    }
//
//    public static void clearArray(int[] in) {
//        for (int i = 0; i < in.length; i++) {
//            in[i] = 0;
//        }

//        int[] arr = {1, 2, 3, 10, 20, 30, 100, 200, 300};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > 100) {
//                arr[i] = 0;
//            }
//        }
//        System.out.println(Arrays.toString(arr));


        // Двумерный массив.
//        int [][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
////        int [][] arr = {
////                {1, 2, 3},
////                {4, 5, 6},
////                {7, 8, 9}
////        };
//        System.out.println(arr[2][1]);

//        int rows = 5;
//        int columns = 5;
//        int[][] arr = new int[rows][columns];
//
//        arr[2][2] = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int rows = 5;
//        int columns = 5;
//        int[][] arr = new int[rows][];
//
//        // Заполняем массив полуёлочкой.
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[i + 1];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Заполняем массив с рамкой, единицы по всем сторонам.
//        int rows = 5;
//        int columns = 5;
//        int[][] arr = new int[rows][columns];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if(i == 0 || j == 0 || i == (arr.length - 1) || j == (arr[i].length - 1)) {
//                    arr[i][j] = 1;
//                }
//            }
//        }
//        printArray(arr);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите любое число: ");
//        int x = sc.nextInt();
//        System.out.println("Вы ввели: " + x);


        // выносим это в отдельный метод selectNumber с выводом сканера в глобальную переменную строка 7
//        Scanner sc = new Scanner(System.in);
//        int x = 0;
//        do {
//            System.out.println("Write number from 1 to 10 ");
//            x = sc.nextInt();
//        }while (x < 1 || x > 10);
//        System.out.println("Your number - " + x);


//        int[][] arr = new int[6][6];
//        int y = selectNumber("Write Y ", 0, 5);
//        int x = selectNumber("Write X ", 0, 5);
//        arr[y][x] = 8;
//        printArray(arr);

        System.out.println(sum(new int[5], 1, 2, 3));

        }

    // Аргументы произвольной длины.
    public static int sum(int[] a, int...arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }


    public static int selectNumber(String description, int min, int max) {
        int x = 0;
        do {
            System.out.println(description + " [ from " + min + " to " + max + " ] ");
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }


    public static void printArray(int[][] in) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                System.out.print(in[i][j] + " ");
            }
            System.out.println();
        }
    }
}
