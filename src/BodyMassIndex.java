public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.printf("%.1f%n", bmi(104, 1.88));
    }

    private static double bmi(double mass, double height) {
        return mass / (height * height);
    }
}
