package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("---№1----");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
        //2
        System.out.println("----№2----");
        int res1 = Ext.expressionFormula(46, 10, 10, 3);
        System.out.println("(46+10)*(10/3)= " + res1);
        Ext.multiplicationNumbers(29, 4, -15);
        //3
        System.out.println("----№3----");
        int number = 10500;
        int resultOne = ((number / 10) / 10);
        System.out.println(resultOne);
        //4
        System.out.println("----№4----");
        Ext.multiplicationNumbers(3.6, 4.1, 5.9);
        //5
        System.out.println("----№5----");
        int textOne = Ext.acceptInput("Введите первое число: ");
        int textTwo = Ext.acceptInput("Введите вторео число: ");
        int textThree = Ext.acceptInput("Введите третье число: ");

        System.out.println("Первое введеное число: " + textOne);
        System.out.println("Второе введеное число: " + textTwo);
        System.out.println("Третье введеное число: " + textThree);
        //6
        System.out.println("----№6----");
        int inputNum = Ext.acceptInput("Введите число:");
        Ext.determiningNumber(inputNum);
    }

}
class Ext
{
    //START TASK1------------
    //метод первой формулы
    public static int expressionFormula(int a, int b, int c, int d) {
        return ((a + b) * (c / d));
    }

    //метод втрой формулы
    public static void multiplicationNumbers(int a, int b, int c) {
        int res = a * b * c;
        System.out.println(a + " * " + b + " * " + c + "= " + res);
    }

    //метод третей формулы
    public static void multiplicationNumbers(double a, double b, double c) {
        double res = a * b * c;
        System.out.println("Произведение чисел" + a + "," + b + "," + c + "равно: " + res);
    }

    //Проверка введёного числа
    public static void determiningNumber(int a) {
        if (a == 0) {
            System.out.println("Вы ввели ноль");
        } else if (a > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (a % 2 != 0) {
            System.out.println("Вы ввели не четное число");
        } else {
            System.out.println("Вы ввели четное число");
        }
    }

    //ввод числа
    public static int acceptInput(String text) {
        System.out.print(text);
        Scanner request = new Scanner(System.in);
        return request.nextInt();
    }
    //END TASK1--------------
}