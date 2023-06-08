package clase5_ejercicio1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");

        int humanAge = sc.nextInt();

        int dogAge = humanAge * 7;

        System.out.println("Tu edad a edad de perros es de " + dogAge + " años de edad");

    }

}
