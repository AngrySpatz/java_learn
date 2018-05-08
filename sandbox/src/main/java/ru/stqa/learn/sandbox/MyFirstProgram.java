package ru.stqa.learn.sandbox;

public class MyFirstProgram {


    public static void main(String[] args) {
        hello("world");
        hello("jopa");
        double len = 5;
        System.out.println("ololo 1 " + len + "=" + area(len));

        double a = 4;
        double b = 6;
        System.out.println("ololo 2 " + a + " и " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;

    }

    public static double area (double a, double b) {
        return a * b;
    }

}