public class CrossZero {

    public static void main(String[] args) {
        startField();
    }
    public static void startField() {
        char[][] field = new char[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '_';
            }
        }
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar +" ");
            }
            System.out.println();
        }
    }
}
