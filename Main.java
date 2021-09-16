package cs.vsu.ru.kapustin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Enter the water temperature in the first vessel (in degrees): ");
        double t1 = readCharacteristics();

        System.out.print("Enter the water temperature in the second vessel (in degrees): ");
        double t2 = readCharacteristics();

        System.out.print("Enter the volume of water in the first vessel (in litters): ");
        double v1 = readCharacteristics();

        System.out.print("Enter the volume of water in the second vessel (in litters): ");
        double v2 = readCharacteristics();
      

        double v3 = findTheVolume(v1, v2);
        double t3 = findTemperature(t1, t2, v1, v2);

        printMixCharacteristics(v3, t3);
    }
    private static double readCharacteristics() {
        Scanner scanner = new Scanner(System.in);

        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.print("Invalid value! Try again. ");
            return readCharacteristics();
        }
        return num;
    }
    private static double findTheVolume(double v1, double v2) {
        double v3 = v1+v2;
        return v3;
    }
    private static double findTemperature(double t1, double t2, double v1, double v2) {
        double t3 = (t1*v1+t2*v2)/(v1+v2);
        return t3;
    }
    private static void printMixCharacteristics(double v3, double t3) {
        System.out.println("Mixture temperature is: "+t3);
        System.out.print("The volume of the mixture is: "+v3);
    }
}

