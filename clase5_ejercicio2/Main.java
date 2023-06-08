package clase5_ejercicio2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una cantidad de millas: ");

        int milla = sc.nextInt();

        double km = milla * 1.60934;

        System.out.println("La distancia de millas a Kms es " + km + " Kilómetros");

    }

}
