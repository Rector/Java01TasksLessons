package taskLesson02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        replacementArray();
        fillingArray();
        multiplicationArray();
        replacementDiagonal(5);
        minMaxNumber();
        int[] arr = {2, 2, 2, 1, 2, 2};
        checkBalance(arr);
        shiftArr(arr, 1);
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

    public static void replacementDiagonal(int size) {
        System.out.println("Решение задачи № 4:");
        int[][] arr2d = new int[size][size];
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (i == j || i + j == size - 1) {
                    arr2d[i][j] = 1;
                }
                System.out.printf("%d\t", arr2d[i][j]);
            }
            System.out.println();
        }
    }

// 2 вариант
//    public static int[][] replacementDiagonal(int size) {
//        System.out.println("Решение задачи № 4:");
//        int[][] arr2d = new int[size][size];
//        for (int i = 0; i < n; i++) {
//            arr[i][i] = 1;
//            arr[i][n - 1 - i] = 1;
//        }
//        return arr2d;
//    }

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


//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
// эти символы в массив не входят.

    public static boolean checkBalance(int[] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        if (summ % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < summ / 2) {
            sumLeft += arr[i];
            i++;
        }
        return sumLeft == summ / 2;
    }

// 7. **** Написать метод, которому на вход подается одномерный массив
// и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//

    public static int[] shiftArr(int[] arr, int n) {
        int k = n % arr.length + arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr;
    }

}
