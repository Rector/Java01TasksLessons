package taskLesson02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        replacementArray();
        fillingArray();
        multiplicationArray();
        replacementDiagonal();
        minMaxNumber();
    }

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void replacementArray() {
        int[] arr1 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println("Решение задачи № 1: " + Arrays.toString(arr1));
    }

//    2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillingArray() {
        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
        }
        System.out.println("Решение задачи № 2: " + Arrays.toString(arr1));
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    public static void multiplicationArray() {
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < 6) {
                arr1[i] *= 2;
            }
        }
        System.out.println("Решение задачи № 3: " + Arrays.toString(arr1));
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами

    public static void replacementDiagonal() {
        System.out.println("Решение задачи № 4:");
        int[][] arr2d = new int[5][5];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (i == j || i + j == arr2d.length - 1) {
                    arr2d[i][j] = 1;
                }
                System.out.printf("%d\t", arr2d[i][j]);
            }
            System.out.println();
        }
    }

//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета).

    public static void minMaxNumber() {
        int[] arr1 = {10, 20, 30, 5, 80, 70, 50, 40};
        int minNumber = arr1[0];
        int maxNumber = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minNumber) {
                minNumber = arr1[i];
            }
            if (arr1[i] > maxNumber) {
                maxNumber = arr1[i];
            }
        }
        System.out.printf("Решение задачи № 5:\nМинимальное число массива:\t%d\nМаксимальное число массива:\t%d\n", minNumber, maxNumber);
    }
}
