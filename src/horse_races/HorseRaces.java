package horse_races;

import java.util.Scanner;

public class HorseRaces {
    public static void main(String[] args) {
        Horse[] tabun = new Horse[5];
        tabun[0] = new Horse("Novichok", "1");
        tabun[1] = new Horse("Ryjik", "2");
        tabun[2] = new Horse("Bystryi", "3");
        tabun[3] = new Horse("Klyacha", "4");
        tabun[4] = new Horse("Kon' pedal'ny", "5");
        showHorses(tabun);
        int horseChoosed;
        chooseHorse();
        System.out.println("\nНа какую лошадь Вы делаете ставку?\n_");
        Scanner scanner = new Scanner(System.in);
        horseChoosed = scanner.nextInt() - 1;
        int Distance = 300;
        System.out.printf("Дистанция забега %d метров", Distance);
        int winNumber = 1;
        int coutFinish = 0;
        races(tabun, Distance, winNumber, coutFinish);
        Horse youHorse = tabun[horseChoosed];
        sort(tabun);
        showPlaces(tabun);
        showYourHorse(youHorse);
    }

    private static void chooseHorse() {
    }

    private static void showHorses(Horse[] tabun) {
        for (int i = 0; i < tabun.length; i++) {
            System.out.print(tabun[i].number + " " + tabun[i].name + "\t");
        }
    }

    private static void showYourHorse(Horse youHorse) {
        System.out.printf("%nВаша лошадь %s заняла место %d", youHorse.name, youHorse.winNumber);
    }

    private static void showPlaces(Horse[] tabun) {
        System.out.println();
        for (Horse horse : tabun) {
            System.out.printf("Лошадь %s заняла %d место%n", horse.name, horse.winNumber);
        }
    }

    private static void races(Horse[] tabun, int Distance, int winNumber, int coutFinish) {
        while (coutFinish < 5) {
            for (int i = 0; i < tabun.length; i++) {
                tabun[i].run();
                if (tabun[i].distance >= Distance && tabun[i].speed > 0) {
                    tabun[i].winNumber = winNumber++;
                    tabun[i].speed = 0;
                    coutFinish++;
                    break;
                }
            }
            showDistance(tabun);
        }
    }

    private static void showDistance(Horse[] tabun) {
        for (int i = 0; i < tabun.length; i++) {
            System.out.printf("\nЛошадь %s пробежала %d метров", tabun[i].name, tabun[i].distance);
        }
    }

    private static void sort(Horse[] tabun) {
        for (int i = 0; i < tabun.length; i++) {
            for (int j = i + 1; j < tabun.length; j++) {
                if (tabun[i].winNumber > tabun[j].winNumber) {
                    Horse temp = tabun[i];
                    tabun[i] = tabun[j];
                    tabun[j] = temp;
                }
            }
        }
    }

}
