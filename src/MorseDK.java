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
                        System.out.println("\nProgram służy do przerabiania tekstu na kod Morse'a lub kodu Morse'a na tekst.\nWybierz odpowiednią opcję z menu za pomocą cyfry, aby przejść do danego wyboru.\n");
                        break;
                    case 2:
                        poprawnyWybor = true;
                        System.out.print("Wpisz kod Morse'a który chcesz przerobić na tekst: ");
                        break;
                    case 3:
                        poprawnyWybor = true;
                        System.out.println("Wpisz tekst który chcesz przerobić na kod Morse'a: ");
                        break;
                    case 4:
                        poprawnyWybor = true;
                        System.out.println("Dziękuję za skorzystanie z programu, do widzenia.");
                        System.exit(0);//Kończy program ze statusem 0 - prawidłowym na żądanie użytkownika
                    default:
                        System.out.println("Nieprawidłowa opcja. Wybierz ponownie.");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Podałeś nieprawidłową wartość. Podaj liczbę całkowitą.");
                wejscie.next();//Służy do oczyszczenia bufora wejściowego w przypadku, gdy użytkownik poda nieprawidłowe dane
            }
        }
        while (!poprawnyWybor);//pętla będzie działać cały czas do momentu kiedy poprawnyWybor = false

        wejscie.close();//zamyka scanner
    }
}
//zrobie jedna klase w ktorej bedzie przerabianie tekstu na Morse'a i Morse na tekst
class KonwerterMorse
{

}