public class Main {
    public static void main(String[] args) {
        Atm atm1 = new Atm(500000);
        Menu menu = new Menu(atm1);
        menu.showMenu();
    }
}