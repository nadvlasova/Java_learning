package ru.home.lesson5;

// Если в классе нет никаких статических переменных, то, чтобы не создавать экземпляр класса
// и не засорять память, методы в классе делаем статическими и м MainApp обращаемся к методам самого класса.
public class Math {
    public static int sum(int... a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

    public static double pow3(double a) {
        return a * a * a;
    }
}
