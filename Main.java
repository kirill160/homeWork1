package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Main {
    private static boolean isWin = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int player = (int) (Math.random() * 2 + 1);
        if (player == 1) {
            System.out.println("ходит первый игрок");
        } else {
            System.out.println("ходит второй игрок");
        }
        char[][] field = {{'1', '2', '3'},
                         {'4', '5', '6'},
                         {'7', '8', '9'}};
        int switcher = 0;
        char crossOrZero;
        while (true) {
            if (switcher % 2 == 0) {
                crossOrZero = 'x';
            } else {
                crossOrZero = '0';
            }
            printField(field);
            int num;
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("ввести число");
                continue;
            }

            if (Arrays.deepToString(field).contains(Integer.toString(num)) && num <= 9 && num > 0) {
                switch (num) {
                    case 1:
                        field[0][0] = crossOrZero;
                        break;
                    case 2:
                        field[0][1] = crossOrZero;
                        break;
                    case 3:
                        field[0][2] = crossOrZero;
                        break;
                    case 4:
                        field[1][0] = crossOrZero;
                        break;
                    case 5:
                        field[1][1] = crossOrZero;
                        break;
                    case 6:
                        field[1][2] = crossOrZero;
                        break;
                    case 7:
                        field[2][0] = crossOrZero;
                        break;
                    case 8:
                        field[2][1] = crossOrZero;
                        break;
                    case 9:
                        field[2][2] = crossOrZero;
                        break;
                }
            } else {
                System.out.println("Введите число из оставшихся на поле!");
                continue;
            }

            checkLogicField(field);
            if(isWin){
                printField(field);
                System.out.println("выиграл");
                break;
            }


        }
    }


    static void printField(char field[][]) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j != 2) {
                    System.out.print(field[i][j] + "|");
                } else {
                    System.out.print(field[i][j]);
                }
            }
            System.out.println();
        }
    }

    static void checkLogicField(char field[][]) {
        for (int i = 0; i < field.length; i++) {
            if  (field[i][0] == field[i][1] && field[i][0] == field[i][2] ||
                    field[0][i] == field[1][i] && field[0][i] == field[2][i] ||
                    field[0][0] == field[1][1] && field[0][0] == field[2][2] ||
                    field[2][0] == field[1][1] && field[2][0] == field[0][2]) {

                isWin = true;
                break;


    }
}
    }
}


