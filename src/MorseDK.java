import java.util.InputMismatchException;
import java.util.Scanner;
public class MorseDK
{
    private final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";

    public static void main(String[] args)
    {
        MorseDK obj = new MorseDK();
        System.out.println(obj.autor);

        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            try
            {
                System.out.println("\nMenu:");
                System.out.println("1. Pomoc");
                System.out.println("2. Przerób kod Morse'a na tekst");
                System.out.println("3. Przerób tekst na kod Morse'a");
                System.out.println("4. Wyjście");
                System.out.print("Wybór: ");

                int wybor = scanner.nextInt();
                scanner.nextLine(); // Czyszczenie bufora

                switch (wybor)
                {
                    case 1:
                        System.out.println("\nProgram umożliwia konwersję tekstu na kod Morse'a oraz odwrotnie.");
                        System.out.println("Wybierz opcję z menu, aby kontynuować.");
                        break; //zakończenie pętli while
                    case 2:
                        System.out.print("Podaj kod Morse'a (znaki rozdzielone spacją): ");
                        String kodMorse = scanner.nextLine();
                        System.out.println("\nTekst na podstawie kodu: " + KonwerterMorse.przerobNaMorse(kodMorse));
                        break; //zakończenie pętli while
                    case 3:
                        System.out.print("Podaj tekst do konwersji na kod Morse'a: ");
                        String text = scanner.nextLine();
                        System.out.println("\nKod Morse'a na podstawie tekstu: " + KonwerterMorse.przerobNaTekst(text));
                        break; //zakończenie pętli while
                    case 4:
                        System.out.println("Dziękuję za skorzystanie z programu. Do widzenia.");
                        scanner.close();
                        System.exit(0);
                    default://instrukcja w przypadku kiedy użytkownik wpisze liczbę całkowitą ale spoza zakresu 1-4 np. 6
                        System.out.println("\nNieprawidłowy wybór, nie ma takiej pozycji w menu. Spróbuj ponownie wpisując wartość z zakresu od 1 do 4.");
                        break; //zakończenie pętli while
                }
            }
            catch (InputMismatchException e) //Obsługa wyjątku w przypadku kiedy użytkownik wpisze tekst zamiast liczby całkowitej przy wyborze z menu
            {
                System.out.println("Błąd: wprowadź liczbę całkowitą."); //Informacja o błędnie wpisanej wartości
                scanner.nextLine(); //Czyszczenie bufora po błędzie
                //Po powyższych operacjach pętla się nie kończy i ponownie program oczekuje na poprawny wybór
            }
        }
    }
}