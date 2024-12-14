public static final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";

public static void main(String[] args) {
    System.out.println(autor);

    Scanner scanner = new Scanner(System.in);

    while (true) {
        try {
            System.out.println("\nMenu:");
            System.out.println("1. Pomoc");
            System.out.println("2. Przerób kod Morse'a na tekst");
            System.out.println("3. Przerób tekst na kod Morse'a");
            System.out.println("4. Wyjście");
            System.out.print("Wybór: ");

            int wybor = scanner.nextInt();
            scanner.nextLine(); // Czyszczenie bufora

            switch (wybor) {
                case 1:
                    System.out.println("\nProgram umożliwia konwersję tekstu na kod Morse'a oraz odwrotnie.");
                    System.out.println("Wybierz opcję z menu, aby kontynuować.");
                    break;

                case 2:
                    System.out.print("Podaj kod Morse'a (znaki rozdzielone spacją): ");
                    String kodMorse = scanner.nextLine();
                    System.out.println("Tekst: " + KonwerterMorse.przerobNaMorse(kodMorse));
                    break;

                case 3:
                    System.out.print("Podaj tekst do konwersji na kod Morse'a: ");
                    String text = scanner.nextLine();
                    System.out.println("\nKod Morse'a: " + KonwerterMorse.przerobNaTekst(text));
                    break;

                case 4:
                    System.out.println("Dziękuję za skorzystanie z programu. Do widzenia.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Błąd: wprowadź liczbę całkowitą.");
            scanner.nextLine(); // Czyszczenie bufora po błędzie
        }
    }
}
