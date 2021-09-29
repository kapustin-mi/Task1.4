package cs.vsu.ru.kapustin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        double t1 = readCharacteristics("first temperature");
        double t2 = readCharacteristics("second temperature");
        double v1 = readCharacteristics("first volume");
        double v2 = readCharacteristics("second volume");

        double v3 = findVolume(v1, v2);
        double t3 = findTemperature(t1, t2, v1, v2);

        printMixCharacteristics(v3, t3);

    }

    private static double readCharacteristics(String dataType) {
        System.out.print("Enter the " + dataType + ": ");
        Scanner scanner = new Scanner(System.in);
        double num;
        
            while(!scanner.hasNextDouble()) {
                System.out.print("Invalid value! Please, try again: ");
                scanner.next();
            }
            num = scanner.nextDouble();

        return num;
    }

    private static double findVolume(double v1, double v2) {
        return v1 + v2;
    }

    private static double findTemperature(double t1, double t2, double v1, double v2) {
        return (t1 * v1 + t2 * v2) / (v1 + v2);
    }

    private static void printMixCharacteristics(double v3, double t3) {
        System.out.println("Mixture temperature is: " + t3);
        System.out.print("The volume of the mixture is: " + v3);
    }
}

