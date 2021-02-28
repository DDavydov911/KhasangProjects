package ru.khasang.sea_battle;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        doGame();
    }

    private static void createShips(char[] arr, int shipsLength) {
        int x = shipsLength;
        int startCell;
        do {
            do {
                startCell = (int) (Math.random() * (arr.length - 2));
            } while (isBusyPlace(arr, startCell));
            arr[startCell] = arr[startCell + 1] = arr[startCell + 2] = Integer.toString(x).charAt(0);
            x--;
        } while (x > 0);
        System.out.println(arr);
    }

    private static boolean isBusyPlace(char[] arr, int startCell) {
        if (arr[startCell] != '.' || arr[startCell + 1] != '.' || arr[startCell + 2] != '.') {
            return true;
        }
        if (startCell != arr.length - 3 && arr[startCell + 3] != '.') {
            return true;
        }
        if (startCell != 0 && arr[startCell - 1] != '.') {
            return true;
        }
        return false;
    }

    private static void doGame() {
        char[] field = new char[17];
        for (int i = 0; i < field.length; i++) {
            field[i] = '.';
        }
        System.out.println(field);
        createShips(field, 3);
        int sheap1Length = 3;
        int sheap2Length = 3;
        int sheap3Length = 3;
        getSoot(field, sheap1Length, sheap2Length, sheap3Length);
    }

    private static void getSoot(char[] field, int sheap1Length, int sheap2Length, int sheap3Length) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(field);
            System.out.println("Введите ячейку цели");
            int shootCell = scanner.nextInt();
            switch (field[shootCell]) {
                case '.':
                    System.out.println("Мимо");
                    field[shootCell] = '*';
                    break;
                case '1':
                    System.out.println((sheap1Length == 1) ? "Корабль 1 потоплен" : "Попадание в корабль 1");
                    field[shootCell] = '#';
                    sheap1Length--;
                    break;
                case '2':
                    System.out.println((sheap2Length == 1) ? "Корабль 2 потоплен" : "Попадание в корабль 2");
                    field[shootCell] = '#';
                    sheap2Length--;
                    break;
                case '3':
                    System.out.println((sheap3Length == 1) ? "Корабль 3 потоплен" : "Попадание в корабль 3");
                    field[shootCell] = '#';
                    sheap3Length--;
                    break;
                case '*':
                    System.out.println("Уже стреляли");
                    break;
            }
        } while (sheap1Length > 0 || sheap2Length > 0 || sheap3Length > 0);
    }
}
