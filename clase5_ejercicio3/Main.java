package clase5_ejercicio3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double productPrice = sc.nextInt();

        System.out.print("Ingresa el % de descuento: ");
        double discountRate = sc.nextInt();

        double discount = productPrice * discountRate/100;

        double newPrice = productPrice -  discount;

        System.out.println("El nuevo precio es de " + newPrice + " dólares");

    }

}
