//repozytorium Github: https://github.com/kamarov360/MorseDK.git

import java.util.InputMismatchException;//import klasy InputMismatchException do obsługi wyjątków
import java.util.Scanner;//import klasy Scanner, potrzebnej do wykorzystania w celu odczytania danych z konsoli od użytkownika.
public class MorseDK //deklaracja publicznej klasy MorseDK.
{
    private final String autor = "Program stworzony przez Kubę Witkowskiego. Społeczna Akademia Nauk w Łodzi, kierunek - Informatyka.\nNumer albumu - 106263, grupa - IV, semestr - I.";//Deklaracja zmiennej autor, jest dostępna tylko wewnątrz klasy. Ma wartość stałą, jej typ danych to String, czyli łańcuch tekstu.

    public static void main(String[] args)//Metoda main jest punktem wejścia do programu, który jest wywoływany przez JVM.
    {
        MorseDK obj = new MorseDK();//Ta linia tworzy nowy obiekt klasy MorseDK i przypisuje jego referencję do zmiennej obj. Obiekt ten będzie używany do interakcji z metodami i właściwościami klasy MorseDK
        System.out.println(obj.autor);//Wyświetla tekst w konsoli na podstawie zmiennej prywatnej autor. Inicjalizacja możliwa dzięki powołaniu się na obiekt.

        Scanner scanner = new Scanner(System.in);//Scanner to klasa wbudowana w bibliotekę Java. "scanner" to nazwa zmiennej obiektowej, używam tej zmiennej do wywoływania metod klasy Scanner. "new" Tworzy nowy obiekt klasy Scanner. Scanner jest skonstruowany z System.in, będzie odczytywał dane wpisane przez użytkownika z klawiatury.

        while (true)//Nieskończona pętla while, pętla posiada warunek true. Dzięki niej program działa cały czas, chyba że użytkownik zakończy działanie, wybierając opcję 4 z menu.
        {
            try//Blok try jest używany do "opakowania" kodu, który może wygenerować wyjątek (błąd) w trakcie wykonania.
            {
                System.out.println("\nMenu:");//Wyświetla użytkownikowi napis "Menu:" i przechodzi do nowej linii. Znak \n pomaga w stworzeniu pustej linii po wyświetleniu zawartości zmiennej autor.
                System.out.println("1. Pomoc");//Wyświetla użytkownikowi napis "1. Pomoc" i przechodzi do nowej linii.
                System.out.println("2. Przerób kod Morse'a na tekst");//Wyświetla użytkownikowi napis "2. Przerób kod Morse'a na tekst" i przechodzi do nowej linii.
                System.out.println("3. Przerób tekst na kod Morse'a");//Wyświetla użytkownikowi napis "3. Przerób tekst na kod Morse'a" i przechodzi do nowej linii.
                System.out.println("4. Wyjście");//Wyświetla użytkownikowi napis "4. Wyjście" i przechodzi do nowej linii.
                System.out.print("Wybór: ");//Wyświetla użytkownikowi napis "Wybór: ".

                int wybor = scanner.nextInt();//Deklaracja zmiennej wybor w postaci integer i wykorzystanie obiektu klasy Scanner jako nasłuch liczby całkowitej
                scanner.nextLine(); //Czyszczenie bufora

                switch (wybor) //wywołanie instrukcji switch dla zmiennej wybór
                {
                    case 1: //wybór 1
                        System.out.println("\nProgram umożliwia konwersję tekstu na kod Morse'a oraz odwrotnie.");//Program wyświetla napis i przechodzi do nowej linii. Element "\n" służy do przejścia do nowej linii przed wyświetleniem tekstu co pozwala na zwiększenie czytelności.
                        System.out.println("Więcej informacji na temat kodu Morse dostępna na stronie: https://pl.wikipedia.org/wiki/Kod_Morse%E2%80%99a");//Program wyświetla napis oraz hiperłącze i przechodzi do nowej linii.
                        System.out.println("Tłumaczenie https://alfabetmorsa.pl/");//Program wyświetla napis oraz hiperłącze i przechodzi do nowej linii.
                        System.out.println("Wybierz opcję z menu, aby kontynuować.");//Program wyświetla napis i przechodzi do nowej linii.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                    case 2: //wybór 2
                        System.out.print("Podaj kod Morse'a (znaki rozdzielone spacją): ");//Wyświetla napis w konsoli.
                        String kodMorse = scanner.nextLine();//Program przypisuje całą wczytaną linię (jako ciąg znaków String) do zmiennej "kodMorse".
                        System.out.println("\nTekst na podstawie kodu: " + KonwerterMorse.przerobNaMorse(kodMorse));//wywołanie metody przerobNaMorse() z klasy KonwerterMorse, przekazywany argument to kodMorse czyli tekst w kodzie Morse wprowadzony przez użytkownika.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                    case 3: //wybór 3
                        System.out.print("Podaj tekst do konwersji na kod Morse'a: ");//Wyświetla napis w konsoli.
                        String tekst = scanner.nextLine();//Program przypisuje całą wczytaną linię (jako ciąg znaków String) do zmiennej "tekst".
                        System.out.println("\nKod Morse'a na podstawie tekstu: " + KonwerterMorse.przerobNaTekst(tekst));//wywołanie metody przerobNaTekst() z klasy KonwerterMorse, przekazywany argument to tekst po przerobieniu z kodu Morse który wprowadził wcześniej użytkownik.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                    case 4: //wybór 4
                        System.out.print("Dziękuję za skorzystanie z programu. Do widzenia.");//Wyświetla napis w konsoli.
                        scanner.close();//zamknięcie nasłuchu scanner
                        System.exit(0); //Program zamyka się na żądanie użytkownika ze statusem 0 (prawidłowym).
                    default://Instrukcja w przypadku kiedy użytkownik wpisze liczbę całkowitą, ale spoza zakresu 1-4 np. 6
                        System.out.println("\nNieprawidłowy wybór, nie ma takiej pozycji w menu. Spróbuj ponownie wpisując wartość z zakresu od 1 do 4.");//Wyświetla w konsoli napis i przechodzi do nowej linii. Dodatkowo przed "\n" pozwala na przejście do nowej linii co jest udogodnieniem w czytelności programu.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                }
            }
            catch (InputMismatchException e) //Obsługa wyjątku w przypadku kiedy użytkownik wpisze tekst zamiast liczby całkowitej przy wyborze z menu
            {
                System.out.println("\nBłąd: wprowadź liczbę całkowitą."); //Informacja o błędnie wpisanej wartości, przejście do nowej linii. Elemnt "\n" oddziela linię "Wybór".
                scanner.nextLine(); //Czyszczenie bufora po błędzie
                //Po powyższych operacjach pętla się nie kończy i ponownie program oczekuje na poprawny wybór
            }
        }
    }
}