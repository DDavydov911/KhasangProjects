package bayard_pattern_in_sea_battle;

import java.util.ArrayList;

public class SeaBattleByBPattern {
    public static ArrayList<Character> list;
    public static ArrayList<Integer> listInt;
    public static void main(String[] args) {
        list = new ArrayList<>();
        listInt = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add('.');
            listInt.add(i);
        }
        generateRandomXO();
        generateRandomXO();
        generateRandomXO();
        System.out.println(list);
        System.out.println(listInt);
    }
    private static void generateRandomXO() {
        int rndIndex = (int) (Math.random() * listInt.size());
        list.set(listInt.get(rndIndex), 'X');
        if (rndIndex == 0) {
            listInt.remove(rndIndex + 1);
            listInt.remove(rndIndex);
        } else if (rndIndex == listInt.size() - 1) {
            listInt.remove(rndIndex);
            listInt.remove(rndIndex - 1);
        } else {
            listInt.remove(rndIndex + 1);
            listInt.remove(rndIndex);
            listInt.remove(rndIndex - 1);
        }
    }
}
