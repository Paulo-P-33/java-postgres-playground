package com.example;

import java.util.Scanner;

public class AppClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your finance: ");
        double finance = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Insert your cpf: ");
        String cpf = scanner.nextLine();

        System.out.println("Insert your gender: ");
        char gender = scanner.nextLine().charAt(0);
        
        Client client = new Client(finance, cpf, gender);
        System.out.println("This is your finance -> R$" + client.getFinance());
        System.out.println("This is your cpf -> " + client.getCpf());
        System.out.println("This is your gender -> " + client.getGender());
        client.isSpecial();
        System.out.println();
    }
}
