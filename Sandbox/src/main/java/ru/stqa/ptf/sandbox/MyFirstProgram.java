package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] arg) {
       hello("word");
        hello("user");
        hello("Aleksei");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));
    double a = 4;
    double b = 6;
        System.out.println("Площадь прямогольника со сторонами " + a + b " = " + area(a,b));
    }

public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
    public static double area(double len) {
        return len * len;
    }
    public static double area(double a, double b){
        return a * b;
    }
}
