package taskLesson01;

public class Main {
    public static void main(String[] args) {

        System.out.println("a * (b + (c / d)) = " + result(50.72F, 20.47F, 30.73F, 40.65F));

        System.out.println("Ответ к 4 пункту задания: " + inInterval(1, 10));

        printPositivity(8);

        System.out.println("Ответ к 6 пункту задания: " + isNegativeNumber(-5));

        hello("Аристарх");

        printIsLeapYear(101);

    }

// 1. Создать переменные всех пройденных типов данных, и инициализировать их значения.

    public static void kindsOfVariables() {
        byte a1 = 127;
        short b1 = -32768;
        int c1 = 2147483647;
        long d1 = -9223372036854775808L;
        float e1 = 3.45F;
        double f1 = 10.5849;
        char s1 = 'P';
        char s2 = 80;
        boolean g1 = 10 > 20;
        boolean h1 = 10 < 20;
    }

// 2.   Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – входные параметры этого метода

    public static float result(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

// 3. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
//    в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;


    public static boolean inInterval(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

// 2 вариант решения
//    public static boolean sum(int a, int b) {
//        if (a + b >= 10 && a + b <= 20) {
//            return true;
//        } else {
//            return false;
//        }
//    }

// 4. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль положительное ли число передали, или отрицательное;
// Замечание: ноль считаем положительным числом.

    public static void printPositivity(int number) {
        if (number >= 0) {
            System.out.println(number + " - это положительное число");
        } else {
            System.out.println(number + " - это отрицательное число");
        }
    }

// 5. Написать метод, которому в качестве параметра передается целое число,
// метод должен вернуть true, если число отрицательное;

    public static boolean isNegativeNumber (int number) {
        return number < 0;
    }

// 6. Написать метод, которому в качестве параметра передается строка,
// обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

 // 7. Написать метод, который определяет является ли год високосным,
 // и выводит сообщение в консоль. Каждый 4-й год является високосным,
 // кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}
