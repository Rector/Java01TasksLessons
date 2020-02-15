package taskLesson03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        guessNumber(10, 3);
        guessWord(15);
    }

// 1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
// или меньше. После победы или проигрыша выводится запрос –
// «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void guessNumber(int maxNumber, int maxCount) {
        while (true) {
            cycleForGuess(maxNumber, maxCount);
            System.out.println("Повторить игру еще раз?\n1 – да / 0 – нет (1 – повторить, 0 – нет)");
            int exitNumber = sc.nextInt();
            while (exitNumber != 0 && exitNumber != 1) {
                System.out.println("Введите 1 - чтобы повторить игру еще раз либо 0 – чтобы закончить");
                exitNumber = sc.nextInt();
            }
            if (exitNumber == 0) {
                System.out.println("Игра окончена.");
                break;
            }
        }
    }

    public static void cycleForGuess(int maxNumber, int maxCount) {
        int answer = rand.nextInt(maxNumber);
        System.out.println("Загадайте число от 0 до " + (maxNumber - 1));
        for (int i = 1; i <= maxCount; i++) {
            int userAnswer = sc.nextInt();
            if (userAnswer == answer) {
                System.out.println("Вы угадали !!!");
                break;
            } else if (userAnswer > answer) {
                System.out.println("Вы ввели слишком большое число.");
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число.");
            }
            if (i == maxCount) {
                System.out.println("Вы проиграли.");
            }
        }

    }


//2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
// "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
// "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//  При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//  сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
//  Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//  apple – загаданное
//  apricot - ответ игрока
//  ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//  Для сравнения двух слов посимвольно, можно пользоваться:
//  String str = "apple";
//  str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//  Играем до тех пор, пока игрок не отгадает слово
//  Используем только маленькие буквы


    public static void guessWord(int quantitySymbols) {
        int number = rand.nextInt(words.length - 1);
        String answer = words[number];
        char[] printChar = new char[quantitySymbols];
        for (int i = 0; i < printChar.length; i++) {
            printChar[i] = '#';
        }

        System.out.println("Отгадайте английское слово. Ответ вводите только строчными буквами.");
        String userAnswer = sc.nextLine();
        userAnswer = sc.nextLine();
        while (answer != userAnswer) {
            for (int j = 0; j < answer.length() && j < userAnswer.length(); j++) {
                for (int k = 0; k < answer.length(); k++) {
                    if (userAnswer.charAt(j) == answer.charAt(k)) {
                        printChar[k] = answer.charAt(k);
                    }
                }
            }
            if (answer == userAnswer) {
                System.out.println("Поздравляю! Вы угадали слово");
            }
            System.out.println(printChar);
            System.out.println("Вы не угадали. Попробуйте ещё раз");
            userAnswer = sc.nextLine();
        }

        sc.close();
    }
}
