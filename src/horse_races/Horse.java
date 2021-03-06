package horse_races;

public class Horse {
    String name;
    String number;
    int finishNumber;
    int secRun;
    int speed;
    int distance;

    Horse(String name, String number) {
        this.name = name;
        this.number = number;
        this.speed = (int) (Math.random() * 10) + 5;
        this.distance = 0;
        this.secRun = 0;
    }

    void run(){
        distance += speed;
    }
}
