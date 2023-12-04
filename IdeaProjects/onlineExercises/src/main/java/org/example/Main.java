package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num * i);

        }

    }
}