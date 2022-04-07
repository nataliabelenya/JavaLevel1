package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossAndCircle3 {
    public static void main(String[] args) {
        String[][] map = initField(3);
        boolean isGameActive = true;
        System.out.println("Игра началась!");
        printMap(map);

        while (true) {

            playerTurn(map);
            printMap(map);
            if (isWinner("X", map) || isDraw(map)) {
                System.out.println("GAME OVER!");
                break;
            }

            computerTurn(map);
            printMap(map);
            if (isWinner("0", map) || isDraw(map)){
                System.out.println("GAME OVER!");
                break;
            }
        }
    }

    public static boolean isWinner (String mark, String[][]map){

        // Проверка строк на выигрыш
        if (isCheckRaw(mark, map)) {
            System.out.println(mark + " победил");
            return true;
        // Проверка стобцов на выигрыш
        } else if (isCheckColumn(mark, map)) {
            System.out.println(mark + " победил");
            return true;

            // Проверка диагоналей на выигрыш
        } else if (isCheckDiag(mark, map)) {
            System.out.println(mark + " победил");
            return true;

        } else {
            return false;
        }

    }

    public static boolean isCheckRaw(String mark, String[][] map){
        for (int i = 0; i < map.length; i++){
            boolean flag = true;
            for (int j = 0; j < map.length; j++){
                if (!map[i][j].equals(mark)){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                return true;
            }
        }

        return false;
    }

    public static boolean isCheckColumn(String mark, String[][] map){
        for (int i = 0; i < map.length; i++){
            boolean flag = true;
            for (int j = 0; j < map.length; j++){
                if (!map[j][i].equals(mark)){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                return true;
            }
        }

        return false;
    }

    public static boolean isCheckDiag(String mark, String[][] map){
        for (int i = 0; i < map.length; i++){
            boolean flag = true;
            for (int j = 0; j < map.length; j++){
                if (i == j) {
                    if (!map[j][i].equals(mark)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag){
                return false;
            }
        }

        return true;
    }

    public static boolean isDraw (String[][]map){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {

                if (map[i][j].equals("*")) {
                    return false;
                }
            }
        }
        System.out.println("Ничья! :-)");
        return true;
    }

    public static void computerTurn (String[][]map){

        System.out.println("Компьютер ходит, подождите");

        Random random = new Random();

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = random.nextInt(map[0].length);
            int y = random.nextInt(map.length);

            if (map[x][y].equals("*")) {
                map[x][y] = "0";
                isActiveTurn = false;
            }
        }
        System.out.println("Компьютер сходил");
    }

    public static void playerTurn (String[][]map){

        System.out.println("Игрок ходит, на какие клетки вы ходите?");

        Scanner sc = new Scanner(System.in);

        boolean isActiveTurn = true;

        while (isActiveTurn) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x > 0 && x <= map[0].length) && (y > 0 && y <= map.length)) {
                if (map[x - 1][y - 1].equals("*")) {
                    map[x - 1][y - 1] = "X";
                    isActiveTurn = false;
                } else {
                    System.out.println("Вы сходили на занятую ячейку");
                }
            } else {
                System.out.println("Вы вышли за пределы поля");
            }

        }
    }

    public static void printMap (String[][]map){

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] initField ( int size){

        String[][] map = new String[size][size];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "*";
            }
        }

        return map;
    }
}
