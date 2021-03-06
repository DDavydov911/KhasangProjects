package HorseRacing;
import java.util.Scanner;

public class HorseManager {
    int countHorses;
    Horse[] horses;

    void setCountHorse(Scanner scanner) {
        System.out.println("Введите количество лошадей");
        countHorses = scanner.nextInt();
        scanner.nextLine();
        this.horses = new Horse[countHorses];
    }

    void init() {
        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse();
        }
    }

    void setSpeed() {
        for (int i = 0; i < horses.length; i++) {
            horses[i].speed = (int) (1 + Math.random() * 10);
        }
    }

    void setNameNum() {
        for (int i = 0; i < horses.length; i++) {
            horses[i].nameNum = i + 1;
        }
    }

    void showName() {
        for (int i = 0; i < horses.length ; i++) {
            System.out.println(this.horses[i].nameNum);
        }
    }
}