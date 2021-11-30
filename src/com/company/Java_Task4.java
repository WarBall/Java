package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("-----1-----");
        String[] strAr = {"Denis", "Ivan", "Vladimir"};
        Ext.stringLength(strAr);
        //2
        System.out.println("-----2-----");
        Ext.palindrome(Ext.acceptStr("Введите слово: "));
        //3
        System.out.println("-----3-----");
        String test = "Ну ты и бяка я с тобой не играю.";
        Ext.censorship(test);
        //4
        System.out.println("-----4-----");
        Ext.substrings();
        //5
        System.out.println("-----5-----");
        Ext.revereStr();
    }
}

class Ext {
    //Ввод числа
    public static int acceptNum(String text) {
        System.out.print(text);
        Scanner request = new Scanner(System.in);
        return request.nextInt();
    }

    //Ввод строки
    public static String acceptStr(String text) {
        System.out.print(text);
        Scanner request = new Scanner(System.in);
        return request.nextLine();
    }

    //Поиска самой длинной строки
    public static void stringLength(String[] aray) {
        String tem = aray[0];
        for (int i = 1; i < aray.length; i++) {
            String strAr = aray[i];
            if (tem.length() <= strAr.length()) {
                tem = strAr;
            }
        }
        System.out.print(Arrays.toString(aray));
        String text = String.format("Самая длинная строка: %s", tem);
        System.out.println(text);
    }

    //Является ли слово палиндромом
    public static void palindrome(String text) {
        String copy = text.toLowerCase();
        StringBuilder rev = new StringBuilder(copy).reverse();

        if (copy.equals(rev.toString())) {
            System.out.println("Это слово полиндром");
        } else {
            System.out.println("Это слово не полиндром");
        }
    }

    //Цензура
    public static void censorship(String text) {
        System.out.printf("Оригинальный ввод: %s%n", text);
        text = text.replace("бяка", "[вырезано цензурой]");
        System.out.printf("Цензура: %s%n", text);
    }

    //Подстрока
    public static void substrings() {
        String str = "Кстати я люблю вкусно покушать. А еще, я люблю отдыхать на природе.";
        String check = "я люблю";
        int res = (str + "\0").split(check).length - 1;

        System.out.printf("Введено: %s\nИщем: %s\nВстречается количество раз: %d%n", str, check, res);
    }

    //Строка наоборот
    public static void revereStr() {
        String input = acceptStr("Sample Output: ");
        System.out.printf("The given string is: %s%n", input);

        StringBuilder reversed = new StringBuilder();
        for (String word : input.split(" ")) {
            reversed.append(new StringBuilder(word).reverse());
            reversed.append(' ');
        }
        System.out.printf("The string reversed word by word is: %s%n", reversed.toString());
    }

}
