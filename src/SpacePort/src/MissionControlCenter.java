public class MissionControlCenter {
    int staffAmount;
    SpaceShip currentSpaceShip;

    void launch() {
        if (countDown()) {
            currentSpaceShip.launch();
        }
    }

    boolean countDown() {
        System.out.println("Ключ на старт!");
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
            pause();
        }
        return true;
    }

    private void pause() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
