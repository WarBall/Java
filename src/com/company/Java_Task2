package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("----№1----");
        Ext.outputNumber();
        //2
        System.out.println("----№2----");
        Ext.divisionBy(3);
        Ext.divisionBy(5);
        Ext.divisionBy(3, 5);
        //3
        System.out.println("----№3----");
        int oneNum = Ext.acceptInput("Веедите первое число: ");
        int twoNum = Ext.acceptInput("Веедите второе число: ");
        int threeNum = Ext.acceptInput("Веедите третие число: ");
        Ext.comparingThreeNumbers(oneNum, twoNum, threeNum);
        //4
        System.out.println("----№4----");
        int fourNum = Ext.acceptInput("Веедите первое число: ");
        int fiveNum = Ext.acceptInput("Веедите второе число: ");
        int sixNum = Ext.acceptInput("Веедите третие число: ");
        Ext.comparingNumbers(fourNum, fiveNum, sixNum);
        //5
        System.out.println("----№5----");
        int[] arrayTestOne = {3, 2, -1, 7, 10};
        Ext.checkingArrayThree(arrayTestOne);
        //6
        System.out.println("----№6----");
        int[] arrayTestTwo = {5, 2, -1, 3, 7, 10};
        Ext.checkingArrayNumb(arrayTestTwo);
    }
}

class Ext{
    //START TASK2------------
    //вывод чисел от 1 до 99
    public static void outputNumber() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i + " ");
        }
    }

    //деление на число
    public static void divisionBy(int a) {
        for (int i = 1; i <= 100; i++) {
            if (i % a == 0) {
                System.out.println("Делится на " + a + ": " + i);
            }
        }
    }

    public static void divisionBy(int a, int b) {
        for (int i = 1; i <= 100; i++) {
            if (i % a == 0 & i % b == 0) {
                System.out.println("Делится на " + a + " и на " + b + ": " + i);
            }
        }
    }

    //ввод числа
    public static int acceptInput(String text) {
        System.out.print(text);
        Scanner request = new Scanner(System.in);
        return request.nextInt();
    }

    //Сравнение суммы 2х чисел c 3им
    public static void comparingThreeNumbers(int a, int b, int c) {
        int test = a + b;
        if (test == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Сравнение чисел
    public static void comparingNumbers(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Проверка массива на наличие числа 3
    public static void checkingArrayThree(int[] array) {
        if (array[0] == 3 || array[array.length - 1] == 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Проверка массива на наличие числа 1 или 3
    public static void checkingArrayNumb(int[] arrays) {
        for (int array : arrays) {
            if (array == 1) {
                System.out.println("Массив содержит число 1");
                break;
            } else if (array == 3) {
                System.out.println("Массив содержит число 3");
                break;
            }
        }
    }
    //END TASK2--------------
}
