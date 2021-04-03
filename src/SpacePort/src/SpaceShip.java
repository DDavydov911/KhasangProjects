public class SpaceShip {
    int speed;
    String name;
    Pilot pilot;
    public int size;
    public double id;

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
        System.out.printf("Pilot %s take a seat in a starship%n", pilot.name);
    }

    void launch() {
        System.out.println("Взлетели");
    }

    void landing() {

    }
}
