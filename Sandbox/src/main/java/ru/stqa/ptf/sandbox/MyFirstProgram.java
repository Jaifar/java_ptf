package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] arg) {
       hello("word");
        hello("user");
        hello("Aleksei");
Square s = new Square(5);
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

      Rectangle r = new Rectangle(4, 6);

        System.out.println("Площадь прямогольника со сторонами " + r.a + "и" + r.b + " = " + r.area());


    }

public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }



}
