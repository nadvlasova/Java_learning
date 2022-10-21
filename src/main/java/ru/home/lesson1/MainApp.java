package ru.home.lesson1;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
        System.out.println(567);
        int a = 8;
        float b = 12.2456789123456789123456789f;
        double c = 3.1456789123456789123456789;
        // long d = 5_000_000_000_000_000_000_000_000_000_000_000_000_000L;
        System.out.println(a +7);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Java" + 1 + 1);
        System.out.println("Java" + (1 + 1));
        System.out.println(1 + 1 + "Java");

        int n = 7;
        n = n + 2;
        System.out.println(n);
        n += 2;
        System.out.println(n);
        n = n - 2;
        System.out.println(n);
        n -= 2;
        System.out.println(n);
        n = n * 2;
        System.out.println(n);
        n *= 2;
        System.out.println(n);
        n = n / 2;
        System.out.println(n);
        n /= 2;
        System.out.println(n);
        n = n % 2;
        System.out.println(n);
        n %= 2;
        System.out.println(n);


    }
}
