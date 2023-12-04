import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kod = 9955; // Koden till bankomatkortet
        int saldo = 10000; // Saldo på kortet

        System.out.println("Välkommen till bankomaten!");

        while (true) {
            System.out.println("Välj en åtgärd:");
            System.out.println("1. Sätt in ditt kort");
            System.out.println("2. Lämna bankomaten");

            int val = scanner.nextInt();

            if (val == 1) {
                System.out.println("Ange din kod: ");
                int angivenKod = scanner.nextInt();

                if (angivenKod != kod) {
                    System.out.println("Felaktig kod. Försök igen.");
                    continue; // Börja om från början av loopen.
                }
                int insattTotalt = 0;

                while (true) {
                    System.out.println("Välj en åtgärd:");
                    System.out.println("1: Sätt in pengar");
                    System.out.println("2: Ta ut pengar.");
                    System.out.println("3: Ta tillbaka kortet och lämna bankomaten");

                    int innerVal = scanner.nextInt();

                    if (innerVal == 1) {
                        System.out.println("Ange valörer som ska sättas in:");
                        int tusenLappar = scanner.nextInt();
                        int femhundraLappar = scanner.nextInt();
                        int tvahundraLappar = scanner.nextInt();
                        int hundraLappar = scanner.nextInt();
                        int femtioLappar = scanner.nextInt();
                        int tjugoLappar = scanner.nextInt();
                        int tioKronor = scanner.nextInt();
                        int femKronor = scanner.nextInt();
                        int enKronor = scanner.nextInt();
                    }
                }
            }
        }

    }
}