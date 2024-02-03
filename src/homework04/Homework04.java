package homework04;

public class Homework04 {
    public static void main(String[] args) {
        // 1 Aufgabe
        // Создайте переменную с типом String,
        // в которой будет хранится Ваше имя.
        //Сколько букв в вашем имени?
        // Выведите значение на экран
        //Создайте две переменные типа char.
        // Одной присвойте первый символ имени,
        // второй - последний символ
        //Выведите на экран десятичный код первого
        // и последнего символа вашего имени

        String name = "Anna";
        System.out.println("My name is: " + name);
        System.out.println("Numbers in my name: " + (name.length()));

        char first = 'A';
        char second = 'n';
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());








    }
}
