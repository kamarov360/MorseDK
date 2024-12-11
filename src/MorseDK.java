import java.util.Scanner;

public class MorseDK
{
    public static final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";

    public static void main(String[] args)
    {
        System.out.println(autor);
        System.out.println("1. Przerób tekst na kod Morse'a.");
        System.out.println("2. Przerób kod Morse'a na tekst.");
        System.out.println("3. Pomoc.");
        System.out.println("4. Wyjście z programu.");
        Scanner wejscie = new Scanner(System.in);
        int wybor = wejscie.nextInt();
    }
}
