package taskLesson04;

import java.util.Random;
import java.util.Scanner;

public class GameCrossZero {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Random ranrom = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Победил игрок!!!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил искусственный интеллект!!!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

//  1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты, где X - столбец, а  Y - строка");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

//  4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

    public static void aiTurn() {
        int x, y;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        do {
            x = ranrom.nextInt(SIZE);
            y = ranrom.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

//  2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
//  например, с использованием циклов.
//  3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
//  Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    if (checkLineX(i, j, symbol)) {
                        return true;
                    }
                    if (checkLineY(i, j, symbol)) {
                        return true;
                    }
                    if (checkDiagonal1(i, j, symbol)) {
                        return true;
                    }
                    if (checkDiagonal2(i, j, symbol)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean checkLineX(int y, int x, char symbol) {
        int score = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (x >= SIZE) {
                break;
            } else if (map[y][x] == symbol) {
                score++;
            }
            x++;
        }
        if (score == DOTS_TO_WIN) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkLineY(int y, int x, char symbol) {
        int score = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (y >= SIZE) {
                break;
            } else if (map[y][x] == symbol) {
                score++;
            }
            y++;
        }

        if (score == DOTS_TO_WIN) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDiagonal1(int y, int x, char symbol) {
        int score = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (y >= SIZE || x >= SIZE) {
                break;
            } else if (map[y][x] == symbol) {
                score++;
            }
            x++;
            y++;
        }

        if (score == DOTS_TO_WIN) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDiagonal2(int y, int x, char symbol) {
        int score = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (y >= SIZE || x >= SIZE || y < 0) {
                break;
            } else if (map[y][x] == symbol) {
                score++;
            }
            x++;
            y--;
        }

        if (score == DOTS_TO_WIN) {
            return true;
        } else {
            return false;
        }
    }
}
