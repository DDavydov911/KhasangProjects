package HorseRacing;
import java.util.Scanner;

public class Distance {
    int metrDist;

    void setMetrDist(Scanner scanner) {
        System.out.println("Введите дистанцию (в метрах)");
        this.metrDist = scanner.nextInt();
        scanner.nextLine();
    }
}