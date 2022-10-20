package pl.vistula.bmi;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        float WagaStepien, WzrostStepien, BMIStepien;



        Scanner Enter = new Scanner(System.in);

        System.out.println("Podaj swój wzrost (w metrach): ");
        WzrostStepien = Enter.nextFloat();

        System.out.println("Podaj swoją wagę (w kg)");
        WagaStepien = Enter.nextFloat();

        BMIStepien = WagaStepien / (float)Math.pow(WzrostStepien, 2);
        System.out.println("Twoje BMI to: " + BMIStepien);

        if(BMIStepien < 16) System.out.println("Twoje BMI znajduje się w przedziale: Wygłodzenie.");
        else if (BMIStepien < 16.99) System.out.println("Twoje BMI znajduje się w przedziale: Wychudzenie.");
        else if (BMIStepien < 18.49) System.out.println("Twoje BMI znajduje się w przedziale: Niedowaga.");
        else if (BMIStepien < 22.99) System.out.println("Twoje BMI znajduje się w przedziale: Norma niski przedział.");
        else if (BMIStepien < 24.99) System.out.println("Twoje BMI znajduje się w przedziale: Norma wysoki przedział.");
        else if (BMIStepien < 27.49) System.out.println("Twoje BMI znajduje się w przedziale: Nadwaga niski przedział.");
        else if (BMIStepien < 29.99) System.out.println("Twoje BMI znajduje się w przedziale: Nadwaga wysoki przedział.");
        else if (BMIStepien < 34.9) System.out.println("Twoje BMI znajduje się w przedziale: Otyłość I stopnia.");
        else if (BMIStepien < 39.9) System.out.println("Twoje BMI znajduje się w przedziale: Otyłość II stopnia.");
        else System.out.println("Twoje BMI znajduje się w przedziale: Otyłość III stopnia.");

    }
}
