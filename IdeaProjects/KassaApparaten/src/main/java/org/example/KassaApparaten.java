package org.example;

import java.util.Scanner;

public class KassaApparaten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = 1000.0; // Användarens startbudget
        double totalKostnad = 0.0; // Kostnaden vi börjar med
        boolean rabatt = false;

        System.out.println("Hej! Välkommen till Makeup Store.");
        System.out.println("Vi säljer mascara, läppstift, foundation, ögonskugga, rouge och puder.");
        System.out.println("Du har 1000.0 kr att handla för.");

        while (true) {
            System.out.println("Välj en vara du vill köpa, eller om du vill använda en rabattkupong.");
            String vara = scanner.nextLine();

            if (vara.equalsIgnoreCase("avsluta")) {
                break; // Avsluta inköp om användaren skriver avsluta
            }

            double pris = 0.0;

            if (vara.equalsIgnoreCase("Mascara")) {
                pris = 120.0;
            } else if (vara.equalsIgnoreCase("Läppstift")) {
                pris = 85.0;
            } else if (vara.equalsIgnoreCase("Foundation")) {
                pris = 250.0;
            } else if (vara.equalsIgnoreCase("Ögonskugga")) {
                pris = 150.0;
            } else if (vara.equalsIgnoreCase("Rouge")) {
                pris = 75.0;
            } else if (vara.equalsIgnoreCase("Puder")) {
                pris = 175.0;
            } else if (vara.equalsIgnoreCase("Rabattkupong")) {
                pris = 0.0;
                rabatt = true;
            } else {
                System.out.println("Okänd vara, välj något annat.");
                continue;
            }

            totalKostnad += pris;
            System.out.println("Varan kostar " + pris + " kr.");

            System.out.println("Din totala kostnad hittills är: " + totalKostnad + " kr.");

            System.out.println("Vill du fortsätta handla?");
            String fortsattHandla = scanner.nextLine();


            if (fortsattHandla.equalsIgnoreCase("ja")) {
                continue;
            } else break;
        }

        if (rabatt) {
            totalKostnad *= 0.8; // 20 % rabatt på hela köpet
        }

        if (totalKostnad <= budget) {
            System.out.println("Tack för ditt köp! Du har handlat för " + totalKostnad + " kr.");
            System.out.println("Du har " + (budget - totalKostnad) + " kr kvar.");
            System.out.println("Välkommen åter!");
        } else {
            System.out.println("Du har överskridit ditt saldo. Köpet går tyvärr inte igenom.");
        }
    }
}
