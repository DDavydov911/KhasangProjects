package ru.khasang.sea_battle;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        doGame();
    }

    private static void createShips(char[] arr, int shipsNum) {
        do {
            int startCell = (int) (Math.random() * (arr.length - 3));
            if (arr[startCell] == '.' && arr[startCell + 1] == '.' && arr[startCell + 2] == '.') {
                arr[startCell] = arr[startCell + 1] = arr[startCell + 2] = Integer.toString(shipsNum).charAt(0);
                shipsNum--;
            }
        } while (shipsNum > 0);
        System.out.println(arr);
    }

    private static void doGame() {
        char[] field = new char[12];
        for (int i = 0; i < field.length; i++) {
            field[i] = '.';
        }
        System.out.println(field);
        createShips(field, 3);
        int sheap1Cells = 3;
        int sheap2Cells = 3;
        int sheap3Cells = 3;
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
                    System.out.println((sheap1Cells == 1) ? "Корабль 1 потоплен" : "Попадание в корабль 1");
                    field[shootCell] = '#';
                    sheap1Cells--;
                    break;
                case '2':
                    System.out.println((sheap2Cells == 1) ? "Корабль 2 потоплен" : "Попадание в корабль 2");
                    field[shootCell] = '#';
                    sheap2Cells--;
                    break;
                case '3':
                    System.out.println((sheap3Cells == 1) ? "Корабль 3 потоплен" : "Попадание в корабль 3");
                    field[shootCell] = '#';
                    sheap3Cells--;
                    break;
                case '*':
                    System.out.println("Уже стреляли");
                    break;
            }
        } while (sheap1Cells > 0 || sheap2Cells > 0 || sheap3Cells > 0);
    }
}
