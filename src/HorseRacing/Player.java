package HorseRacing;
import java.util.Scanner;

public class Player {
    int rate;

    void setRate(Scanner scanner) {
        System.out.println("На какую лошадь сделаете ставку?");
        this.rate = scanner.nextInt();
        scanner.nextLine();
    }
}