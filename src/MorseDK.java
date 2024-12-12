import java.util.InputMismatchException;
import java.util.Scanner;

public class MorseDK
{
    public static final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";
    public static int wybor = 0;

    public static void main(String[] args)
    {
        System.out.println(autor);
        boolean poprawnyWybor = false;
        Scanner wejscie = new Scanner(System.in);

        do
        {
            try
            {
                System.out.println("1. Pomoc.");
                System.out.println("2. Przerób kod Morse'a na tekst.");
                System.out.println("3. Przerób tekst na kod Morse'a.");
                System.out.println("4. Wyjście z programu.");
                System.out.print("Wybór: ");
                wybor = wejscie.nextInt();

                switch (wybor)
                {
                    case 1:
                        System.out.println("Program służy do przerabiania tekstu na kod Morse'a lub kodu Morse'a na tekst.\nWybierz odpowiednią opcję z menu za pomocą cyfry, aby przejść do danego wyboru.");
                        poprawnyWybor = true;
                        break;
                    case 2:
                        System.out.println("opcja 2");
                        poprawnyWybor = true;
                        break;
                    case 3:
                        System.out.println("opcja 3");
                        poprawnyWybor = true;
                        break;
                    case 4:
                        System.out.println("Dziękuję za skorzystanie z programu, do widzenia.");
                        poprawnyWybor = true;
                        System.exit(0);
                    default:
                        System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Podałeś nieprawidłową wartość. Podaj liczbę całkowitą.");
                wejscie.next();//służy do oczyszczenia bufora wejściowego w przypadku, gdy użytkownik poda nieprawidłowe dane
                poprawnyWybor = false;
            }
        }
        while (!poprawnyWybor);

        wejscie.close();//zamyka scanner
    }
}

//scanner.close();
    //public static void tekstNaMorse(String text)
    //{

    //}
    //public static void morseNaTekst(String text)
    //{

    //}