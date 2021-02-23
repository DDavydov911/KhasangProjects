import java.util.Arrays;

public class CrossZero {
    public static void main(String[] args) {
        Field field = new Field();
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        showField(field.arr);
        while (true) {
            makeStep(player1, player2, field);
            chekField(field, player1);
            chekField(field, player2);
            if (field.winState) {
                return;
            } else if (field.winNobody) {
                System.out.println("Ничья");
                return;
            }
        }
    }

    private static void showField(char[][] arr) {
        for (char[] chars : arr) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public static void chekField(Field fi, Player pl) {
        int countX = 0;
        int countY = 0;
        for (char[] arr : fi.arr) {
            for (char i : arr) {
                if (i == 'X') {
                    countX++;
                }
                if (i == 'O') {
                    countY++;
                }
            }
        }
        if (fi.arr[0][0] == pl.sign && fi.arr[0][1] == pl.sign && fi.arr[0][2] == pl.sign ||
            fi.arr[1][0] == pl.sign && fi.arr[1][1] == pl.sign && fi.arr[1][2] == pl.sign ||
            fi.arr[2][0] == pl.sign && fi.arr[2][1] == pl.sign && fi.arr[2][2] == pl.sign ||
            fi.arr[0][0] == pl.sign && fi.arr[1][0] == pl.sign && fi.arr[2][0] == pl.sign ||
            fi.arr[0][1] == pl.sign && fi.arr[1][1] == pl.sign && fi.arr[2][1] == pl.sign ||
            fi.arr[0][2] == pl.sign && fi.arr[1][2] == pl.sign && fi.arr[2][2] == pl.sign ||
            fi.arr[0][0] == pl.sign && fi.arr[1][1] == pl.sign && fi.arr[2][2] == pl.sign ||
            fi.arr[2][0] == pl.sign && fi.arr[1][1] == pl.sign && fi.arr[0][2] == pl.sign) {
            fi.winState = true;
            System.out.printf("Победил игрок %s", pl.name);
        } else if (countX + countY == 9) {
            fi.winNobody = true;
        }
    }

    public static void makeStep(Player player1, Player player2, Field fi) {
        int x, y;
        do {
            System.out.println("Введите координату клетки по оси X от 0 до 2");
            x = (int) (Math.random() * 3);
            System.out.println("Ведена " + x);
            System.out.println("Ведите координату клетки по оси Y от 0 до 2");
            y = (int) (Math.random() * 3);
            System.out.println("Введена " + y);
            if (fi.arr[y][x] != '.') {
                System.out.println("Ячейка занята, выберите другую");
            }
        } while (fi.arr[y][x] != '.');

        if (fi.nextStepByPlayer == 1) {
            fi.arr[y][x] = player1.sign;
            fi.nextStepByPlayer = 2;
        } else {
            fi.arr[y][x] = player2.sign;
            fi.nextStepByPlayer = 1;
        }
        showField(fi.arr);
    }
}

class Player {
    char sign;
    String name;

    Player(String name, char sign) {
        this.sign = sign;
        this.name = name;
    }
}

class Field {
    char[][] arr;
    boolean winState;
    boolean winNobody;
    int nextStepByPlayer;

    Field() {
        this.arr = new char[3][3];
        this.nextStepByPlayer = 1;
        for (int i = 0; i < this.arr.length; i++) {
            Arrays.fill(this.arr[i], '.');
        }
    }
}
/*
Старт
создать поле
показать поле
создать игроков
запросить ход 1 игрока
 поверить доступность ячейки
 внести изменения на поле
 показать поле
 проверить выигрыш/продолжение игры
выигрыш => объявляем, выходим
продолжение => запросить ход 2 игрока

 */