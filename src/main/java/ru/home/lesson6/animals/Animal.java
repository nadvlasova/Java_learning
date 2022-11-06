package ru.home.lesson6.animals;

public abstract class Animal {
//    public String name;  // public - нарушение инкапсуляции
//    public int age;
    //  Чтобы избежать нарушение инкапсуляции убираем модификатор доступа,
    //  создаем пакет animals и все классы кроме MainApp помещаем в этот пакет.
    //  Соответственно теперь в рамках пакета есть доступ к изменению данных переменных,
    //  а в MainApp этого доступа нет!
//    String name; // Дефолтный модификатор доступа. Нет доступа к Horse который вне пакета.
//    int age;

    protected String name; // теперь есть доступ к Horse, но нет в MainApp.
    // Т.е. protected доступен либо в рамках одного пакета либо при наследовании.
    // Если нужно использовать class Cat из пакета animals в пакете lesson5,
    // то в lesson5 MainApp нужно импортировать import ru.home.lesson6.animals.Cat;
    protected int age;

    public void jump() {

        System.out.println(name + " прыжок");
    }

    public void info() {
        System.out.println(name + " " + age);
    }

//    public void voice() {
//        System.out.println(name + " издает какой-то звук.");
//    }
    public abstract void voice();

//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + ":\n - Name -> " + name + "\n - Age -> " + age + "\n";
//    }

    public String toString() {
        return getClass().getSimpleName() + ":\n  -  Name -> " + name + "\n  -  Age -> " + age + "\n";
    }

}
