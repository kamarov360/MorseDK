import java.util.InputMismatchException;
import java.util.Scanner;

public class MorseDK
{
    public static final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";
    public static int wybor = 0;
    //tutaj można umieścić publiczne stałe zmienne z kodami Morse'a

    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.println(autor);
        System.out.println("1. Przerób tekst na kod Morse'a.");
        System.out.println("2. Przerób kod Morse'a na tekst.");
        System.out.println("3. Pomoc.");
        System.out.println("4. Wyjście z programu.");
        do
        {
            try
            {
                System.out.print("Wybór: ");
                wybor = wejscie.nextInt();
                switch (wybor)
                {
                    case 1:
                        System.out.println("opcja 1");
                        break;
                    case 2:
                        System.out.println("opcja 2");
                        break;
                    case 3:
                        System.out.println("opcja 3");
                        break;
                    case 4:
                        System.out.println("Do widzenia.");
                        System.exit(0);
                        break;
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
        while (wybor > 4 || wybor < 1);
    }
}
    //public static void tekstNaMorse(String text)
    //{

    //}
    //public static void morseNaTekst(String text)
    //{

    //}