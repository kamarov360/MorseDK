import java.util.InputMismatchException;
import java.util.Scanner;

public class MorseDK
{
    public static final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";
    public static int wybor = 0;
    //tutaj można umieścić publiczne stałe zmienne z kodami Morse'a

    public static void main(String[] args)
    {
        System.out.println(autor);
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
                        System.out.println("Program służy do przerabiania tekstu na kod Morse'a lub kodu Morse'a na tekst.\nWybierz odpowiednią opcję z menu za pomocą cyfry aby przejść do danego wyboru.");
                        break;
                    case 2:
                        System.out.println("opcja 2");
                        break;
                    case 3:
                        System.out.println("opcja 3");
                        break;
                    case 4:
                        System.out.println("Dziękuję za skorzystanie z programu, do widzenia.");
                        System.exit(0);
                    default:
                        System.out.println("Nieprawidłowe dane switch.");
                        System.out.print("Podaj prawidłową opcję: ");
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Podałeś nieprawidłową opcję.");
            }
        }
        while (wybor > 4 || wybor < 2);
    }
}
    //public static void tekstNaMorse(String text)
    //{

    //}
    //public static void morseNaTekst(String text)
    //{

    //}