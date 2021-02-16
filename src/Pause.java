public class Pause {
    public static void main(String[] args) {
        System.out.println("1");
        pause(1000);
        System.out.println("2");
    }

    private static void pause(int msec) {
        try{
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
