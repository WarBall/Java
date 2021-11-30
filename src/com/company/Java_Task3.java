package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arrayTest1 = {1,2,3,1,2,4};
        //1
        System.out.println("\n----№1----");
        Ext.checkingArraySort(arrayTest1);
        //2
        System.out.println("\n----№2----");
        Ext.createArray(Ext.acceptInput("Array length: "));
        //3
        System.out.println("\n----№3----");
        Ext.rearrangingElementsArray(arrayTest1);
        //4
        System.out.println("\n----№4----");
        Ext.uniqueNumber(arrayTest1);
        //5
        System.out.println("\n----№5----");
        System.out.println(Ext.fib(Ext.acceptInput("Введите число: ")));
        //6
        System.out.println("\n----№6----");
        Ext.mergeSort(Ext.acceptInput("Укажите размер массива: "));
    }
}

class Ext {
    //ввод числа
    public static int acceptInput(String text) {
        System.out.print(text);
        Scanner request = new Scanner(System.in);
        return request.nextInt();
    }

    //Проверка отсортирован ли массив
    public static void checkingArraySort(int[] array) {
        boolean sorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    //Создание массива
    public static void createArray(int elementsCount) {
        Scanner scanner = new Scanner(System.in);
        int[] newAre = new int[elementsCount];
        System.out.println("Numbers of array: ");
        for (int i = 0; i < newAre.length; i++) {
            int element = scanner.nextInt();
            newAre[i] = element;
        }
        System.out.print("Result: ");
        System.out.print(Arrays.toString(newAre));
        //System.out.println();
    }

    //Перестановка элементов массива
    public static void rearrangingElementsArray(int[] array) {
        System.out.print("Array 1: ");
        System.out.print(Arrays.toString(array));
        int len = array.length;
        int firstElement = array[0];
        int lastElement = array[len - 1];
        array[0] = lastElement;
        array[len - 1] = firstElement;
        System.out.println();
        System.out.print("Array 2: ");
        System.out.print(Arrays.toString(array));
    }

    //Уникальное число массива
    public static void uniqueNumber(int[] array) {
        int[] counts = new int[max(array) + 1];
        for (int k : array) counts[k]++;

        for (int i : array) {
            if (counts[i] == 1) {
                System.out.print("Первое уникальное число: " + i);
                break;
            }
        }
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) max = j;
        }
        return max;
    }

    //Число Фибоначчи
    public static int fib(int n) {
        int fn = 1;
        int f0 = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                fn += f0;
                f0 = fn - f0;
            }
        } else {
            for (int i = 0; i > n; i--) {
                fn -= f0;
                f0 = fn - f0;
            }
        }
        System.out.print("Число Фибоначчи: ");
        return f0;
    }

    //Сортировка слиянием
    public static void mergeSort(int elementsCount) {
        int[] array = randomArray(elementsCount);
        System.out.println("Созданный массив: ");
        System.out.print(Arrays.toString(array));

        int[] copy1 = Arrays.copyOf(array, array.length);
        int[] copy2 = new int[array.length];
        int[] result = merge(copy1, copy2, 0, array.length);
        System.out.println("\nОтсортированый массив: ");
        System.out.print(Arrays.toString(result));
    }

    public static int[] merge(int[] array1, int[] array2, int startInd, int endInd) {
        if (startInd >= endInd - 1) {
            return array1;
        }

        int middle = startInd + (endInd - startInd) / 2;
        int[] sorted1 = merge(array1, array2, startInd, middle);
        int[] sorted2 = merge(array1, array2, middle, endInd);

        int index1 = startInd;
        int index2 = middle;
        int destIndex = startInd;

        int[] result = sorted1 == array1 ? array2 : array1;

        while (index1 < middle && index2 < endInd) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endInd) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static int[] randomArray(int elementsCount) {
        int[] myArray = new int[elementsCount];
        for (int i = 0; i < myArray.length; i++) {
            int ran = (int) (Math.random() * (200 + 1));
            myArray[i] = ran;
        }
        return myArray;
    }
}




class MergeSort
{
    void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}
