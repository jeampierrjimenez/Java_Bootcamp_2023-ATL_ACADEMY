package clase5_ejercicio4;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cuenta total: ");
        double totalAmount = sc.nextInt();

        System.out.print("Ingresa el % de propina: ");
        double tipRate = sc.nextInt();

        double tip = totalAmount * tipRate/100;

        System.out.println("El monto de propina a dejar es " + tip + " dólares");

    }

}
