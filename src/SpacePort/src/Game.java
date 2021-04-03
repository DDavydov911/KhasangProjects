import java.security.PublicKey;

public class Game {
    SpacePort spacePort;
    private static Game instance;

    private Game() {
    }

    public static Game getInstance() {
        if (instance == null) {
            return new Game();
        }
        return instance;
    }

    public void init() {
        spacePort = new SpacePort("Baikonur");

        MissionControlCenter missionControlCenter = new MissionControlCenter();
        spacePort.missionControlCenter = missionControlCenter;

        SpaceShip spaceShip = new SpaceShip();
        spacePort.initWithSpaceShip(spaceShip);

        Pilot pilot = new Pilot("Jurii");
        spaceShip.setPilot(pilot);
    }

    public void start() {
        spacePort.missionControlCenter.launch();
    }
}
