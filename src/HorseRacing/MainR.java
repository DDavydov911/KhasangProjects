package HorseRacing;
import java.util.Arrays;
import java.util.Scanner;

public class MainR {
    public static void main(String[] args) {
        rasingGame();
    }

    static void rasingGame() {
        Scanner scanner = new Scanner(System.in);
        HorseManager horseManager = new HorseManager();
        Distance distance = new Distance();
        Player player = new Player();

        distance.setMetrDist(scanner);
        horseManager.setCountHorse(scanner);
        horseManager.init();
        horseManager.setSpeed();
        horseManager.setNameNum();
        horseManager.showName();
        player.setRate(scanner);

        int winner = 0; // счётчик победителя, для выхода из цикла
        int nameWinner = 0;
        while (winner == 0) { // основной цикл игры
            for (int i = 0; i < horse.horses.length; i++) { // изменение пройденного расстояния за одну единицу времени
                horse.horses[i].interval += horse.horses[i].speed;
                System.out.println(horse.horses[i].interval);
            }
            System.out.println();
            for (int i = 0; i < horse.horses.length; i++) {
                if (horse.horses[i].interval >= distance.metrDist) { // проверка массива лошадей на пересечение финишной точки
                    for (int j = 0; j < horse.horses.length; j++) { // сортировка лошадей, чтобы записать победителя, потому что без сортировки победить может тот, кто идёт первый в списке, а не тот, кто был быстрее
                        for (int k = j + 1; k < horse.horses.length; k++) {
                            if (horse.horses[j].speed > horse.horses[k].speed) {
                                Horse temp = horse.horses[j];
                                horse.horses[j] = horse.horses[k];
                                horse.horses[k] = temp;
                            }
                        }

                    }
                    nameWinner = horse.horses[horse.horses.length - 1].nameNum;
                    winner++;
                    break;
                }
            }
        }
        if(player.rate == nameWinner){
            System.out.println("Поздравлямба!!! Ваша ставка сыграла!");
        }else {
            System.out.println("Sorry. You are not a winner((( Выиграла лошадь " + nameWinner);
        }

    }
}

/*
Забег лошадей. Там возникло две проблемы. Одна : это создание массива лошадей внутри класса лошадей.
Из-за чего приходилось обращаться к методам через класс.массив.метод.. В общем, не сразу понял, потом уже не исправил.

Видимо, массив нужно было создавать только внутри игрового процесса, а не внутри класса.

И, обращаясь к методу, передавать массив в параметрах к свойствам. Тут я неверно разделил, только под конец понял.
Второе - я столкнулся с тем, что перебор данных о пройденной дистанции в массиве может неверно определить победителя,
т.к. первая лошадь в списке может быть медленнее, но выиграет,
т.к. тоже перескла точку финиша, и она первая в массиве.
В общем, вычисления идут не параллельно и "наблюдаем" мы как бы рывками.
Пришлось это компенсировать сортировкой по скорости (в конце игры).
Хотя, опять же, скорости могут совпадать у нескольких лошадей.
Нужно еще делать проверку на одинаково максимальные скорости, чтобы быть до конца честным))
 */

