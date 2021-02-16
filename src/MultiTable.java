public class MultiTable {
    public static void main(String[] args) {
        //case1
        for (int i = 2; i < 7; i += 4) {
            for (int j = 1; j < 11; j++) {
                for (int k = i; k < i + 4; k++) {
                    System.out.print(k + " * " + j + " = " + k * j + "\t");
                    if (k % (i + 3) == 0) System.out.println();
                }
                if (j == 10) {
                    System.out.println();
                }
            }

        }

        //case2
        for (int j = 1; j <= 10; j++) {
            for (int k = 2; k <= 5; k++) {
                System.out.print(k + " * " + j + " = " + k * j + "\t");
                if (k % 5 == 0) System.out.println();
            }
        }
        System.out.println();
        for (int j = 1; j <= 10; j++) {
            for (int k = 6; k < 10; k++) {
                System.out.print(k + " * " + j + " = " + k * j + "\t");
                if (k % 9 == 0) System.out.println();
            }
        }

        //case3
        multLine(2, 5);
        multLine(6, 9);


    }

    static void multLine(int from, int to) {
        for (int j = 1; j <= 10; j++) {
            for (int k = from; k <= to; k++) {
                System.out.print(k + " * " + j + " = " + k * j + "\t");
                if (k % to == 0) System.out.println();
            }
        }
        System.out.println();
    }
}
