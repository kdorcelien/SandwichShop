package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner sandwich = new Scanner(System.in);

        System.out.print("available sandwich size: \n A: Regular: base price $5.45 \n B: Large: base price $8.95 \n ");
        System.out.print(" Please select a size: ");
        String size = sandwich.nextLine();

        System.out.println("Please enter age: ");
        int age = sandwich.nextInt();

        if (age <= 17) {
            System.out.print(" You get a 10% discount");

        } else if (age >= 65) {
            System.out.print("You get a 20% discount");
        }
    }
}