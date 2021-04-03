public class SpacePort {
    MissionControlCenter missionControlCenter;
    SpaceShip spaceShip;
    String name;

    public SpacePort(String name) {
        this.name = name;
    }

    void cleaning() {

    }

    void initWithSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
        missionControlCenter.currentSpaceShip = spaceShip;
    }
}
