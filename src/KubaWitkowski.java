//repozytorium Github: https://github.com/kamarov360/MorseDK.git

import java.util.InputMismatchException;//import klasy InputMismatchException do obsługi wyjątków
import java.util.HashMap;//importowanie klasy HashMap, HashMap przechowuje dane w postaci par klucz-wartość i zapewnia dostęp do wartości na podstawie klucza
import java.util.Map;//importuje interfejs Map, który jest ogólnym kontraktem dla struktur danych przechowujących pary klucz-wartość.
import java.util.Scanner;//import klasy Scanner, potrzebnej do wykorzystania w celu odczytania danych z konsoli od użytkownika.
public class KubaWitkowski //deklaracja publicznej klasy MorseDK.
{
    private final String autor = "\nProgram stworzony przez Kubę Witkowskiego. Numer albumu - 106263, grupa - IV, semestr - I.\nSpołeczna Akademia Nauk, kierunek - Informatyka. Łódź, Polska.";//Deklaracja zmiennej autor, jest dostępna tylko wewnątrz klasy. Ma wartość stałą, jej typ danych to String, czyli łańcuch tekstu.

    public static void main(String[] args)//Metoda main jest punktem wejścia do programu, który jest wywoływany przez JVM.
    {
        Scanner scanner = new Scanner(System.in);//Scanner to klasa wbudowana w bibliotekę Java. "scanner" to nazwa zmiennej obiektowej, używam tej zmiennej do wywoływania metod klasy Scanner. "new" Tworzy nowy obiekt klasy Scanner. Scanner jest skonstruowany z System.in, będzie odczytywał dane wpisane przez użytkownika z klawiatury.
        KubaWitkowski obj = new KubaWitkowski();//Ta linia tworzy nowy obiekt klasy MorseDK i przypisuje jego referencję do zmiennej obj. Obiekt ten będzie używany do interakcji z metodami i właściwościami klasy MorseDK
        while (true)//Nieskończona pętla while, pętla posiada warunek true. Dzięki niej program działa cały czas, chyba że użytkownik zakończy działanie, wybierając opcję 4 z menu.
        {
            try//Blok try jest używany do "opakowania" kodu, który może wygenerować wyjątek (błąd) w trakcie wykonania.
            {
                System.out.println(obj.autor);//Wyświetla tekst w konsoli na podstawie zmiennej prywatnej autor. Inicjalizacja możliwa dzięki powołaniu się na obiekt.
                System.out.println("\nMenu:");//Wyświetla użytkownikowi napis "Menu:" i przechodzi do nowej linii. Znak \n pomaga w stworzeniu pustej linii po wyświetleniu zawartości zmiennej autor.
                System.out.println("1. Pomoc");//Wyświetla użytkownikowi napis "1. Pomoc" i przechodzi do nowej linii.
                System.out.println("2. Przerób kod Morse'a na tekst (alfabet łaciński z obsługą polskich znaków diaktrycznych)");//Wyświetla użytkownikowi napis "2. Przerób kod Morse'a na tekst (alfabet łaciński z obsługą polskich znaków diaktrycznych)" i przechodzi do nowej linii.
                System.out.println("3. Przerób tekst na kod Morse'a (alfabet łaciński z obsługą polskich znaków diaktrycznych)");//Wyświetla użytkownikowi napis "3. Przerób tekst na kod Morse'a (alfabet łaciński z obsługą polskich znaków diaktrycznych)" i przechodzi do nowej linii.
                System.out.println("4. Przerób kod Morse'a na tekst (cyrylica rosyjska)");//Wyświetla użytkownikowi napis "4. Przerób kod Morse'a na tekst (cyrylica rosyjska)" i przechodzi do nowej linii.
                System.out.println("5. Przerób tekst na kod Morse'a (cyrylica rosyjska)");//Wyświetla użytkownikowi napis "5. Przerób tekst na kod Morse'a (cyrylica rosyjska)" i przechodzi do nowej linii.
                System.out.println("6. Wyjście z programu");//Wyświetla użytkownikowi napis "6. Wyjście" i przechodzi do nowej linii.
                System.out.print("Wybór: ");//Wyświetla użytkownikowi napis "Wybór: ".

                int wybor = scanner.nextInt();//Deklaracja zmiennej wybor w postaci integer i wykorzystanie obiektu klasy Scanner jako nasłuch liczby całkowitej
                scanner.nextLine(); //Czyszczenie bufora

                switch (wybor) //wywołanie instrukcji switch dla zmiennej wybór
                {
                    case 1: //wybór 1
                        System.out.println("\nProgram umożliwia konwersję tekstu na kod Morse'a oraz odwrotnie.");//Program wyświetla napis i przechodzi do nowej linii. Element "\n" służy do przejścia do nowej linii przed wyświetleniem tekstu co pozwala na zwiększenie czytelności.
                        System.out.println("Więcej informacji na temat kodu Morse dostępna na stronie: https://pl.wikipedia.org/wiki/Kod_Morse%E2%80%99a");//Program wyświetla napis oraz hiperłącze i przechodzi do nowej linii.
                        System.out.println("Tłumaczenie: 'https://alfabetmorsa.pl/' oraz 'https://en.wikipedia.org/wiki/Russian_Morse_code'");//Program wyświetla napis oraz hiperłącze i przechodzi do nowej linii.
                        System.out.println("W przypadku konwersji kodu Morse na tekst proszę jako spacji używać znaku ' / ', przykładowo: '.--. .-. --.. -.-- -.- .-..- .- -.. --- .-- -.-- / - . -.- ... -'");
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
                    case 4: //wybór 2
                        System.out.print("Podaj kod Morse'a (znaki rozdzielone spacją): ");//Wyświetla napis w konsoli.
                        String kodMorseCyrylica = scanner.nextLine();//Program przypisuje całą wczytaną linię (jako ciąg znaków String) do zmiennej "kodMorseCyrylica".
                        System.out.println("\nTekst na podstawie kodu: " + KonwerterMorseCyrylica.przerobNaMorseCyrylica(kodMorseCyrylica));//wywołanie metody przerobNaMorseCyrylica() z klasy KonwerterMorseCyrylica, przekazywany argument to kodMorseCyrylica czyli tekst w kodzie Morse wprowadzony przez użytkownika.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                    case 5: //wybór 3
                        System.out.print("Podaj tekst do konwersji na kod Morse'a: ");//Wyświetla napis w konsoli.
                        String tekstCyrylica = scanner.nextLine();//Program przypisuje całą wczytaną linię (jako ciąg znaków String) do zmiennej "tekstCyrylica".
                        System.out.println("\nKod Morse'a na podstawie tekstu: " + KonwerterMorseCyrylica.przerobNaTekstCyrylica(tekstCyrylica));//wywołanie metody przerobNaTekstCyrylica() z klasy KonwerterMorseCyrylica, przekazywany argument to tekst po przerobieniu z kodu Morse który wprowadził wcześniej użytkownik.
                        break; //program wychodzi tylko z switch i wraca na początek pętli while (ponieważ jej warunek true nadal jest spełniony).
                    case 6: //wybór 4
                        System.out.print("\nDziękuję za skorzystanie z programu. Do widzenia.");//Wyświetla napis w konsoli.
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
    //repozytorium Github: https://github.com/kamarov360/MorseDK.git

    public class KonwerterMorse//deklaracja publicznej klasy KonwerterMorse
    {
        private static final HashMap<Character, String> przerabianieTekstuNaMorse = new HashMap<>();//tworzy mapę, która przechowuje parę klucz jako character np. "A" i wartość String np. kod Morse ".-".
        private static final HashMap<String, Character> przerabianieMorseNaTekst = new HashMap<>();//tworzy mapę odwrotną do poprzedniej, przechowuje parę klucz jako String (kod Morse) i Character jako literę z alfabetu.

        static//Blok static to specjalny blok kodu, który jest wykonywany tylko raz, w momencie ładowania klasy do pamięci (zanim zostaną utworzone jakiekolwiek obiekty tej klasy). Statyczne pola są wspólne dla całej klasy i nie są powielane dla każdego obiektu, co oszczędza pamięć.
        {
        /*do zmapowania znaków posługiwano się zawartością strony: https://alfabetmorsa.pl/
        Znaki alfabetu łacińskiego:*/

            przerabianieTekstuNaMorse.put('A', ".-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('B', "-...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('C', "-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('D', "-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('E', ".");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('F', "..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('G', "--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('H', "....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('I', "..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('J', ".---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('K', "-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('L', ".-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('M', "--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('N', "-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('O', "---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('P', ".--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Q', "--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('R', ".-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('S', "...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('T', "-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('U', "..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('V', "...-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('W', ".--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('X', "-..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Y', "-.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Z', "--..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('1', ".----");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('2', "..---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('3', "...--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('4', "....-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('5', ".....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('6', "-....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('7', "--...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('8', "---..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('9', "----.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('0', "-----");//przypisanie klucza i wartości (key, value)

            przerabianieTekstuNaMorse.put(' ', "/");//przypisanie klucza i wartości (key, value)

            //Znaki diakrytyczne
            przerabianieTekstuNaMorse.put('Ą', ".-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ć', "-.-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ę', "..-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ł', ".-..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ń', "--.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ó', "---.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ś', "...-...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ż', "--..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('Ź', "--..-");//przypisanie klucza i wartości (key, value)

            //Znaki interpunkcyjne i symbole
            przerabianieTekstuNaMorse.put('.', ".-.-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put(',', "--..--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('\'', ".----.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('\"', ".-..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('_', "..--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put(':', "---...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put(';', "-.-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('?', "..--..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('!', "-.-.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('-', "-....-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('+', ".-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('/', "-..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('(', "-.--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put(')', "-.--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('=', "-...-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('@', ".--.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('$', "...-..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorse.put('&', ".-...");//przypisanie klucza i wartości (key, value)

            //Tworzenie odwrotnej mapy używając interfejsu "Map"
            for (Map.Entry<Character, String> entry : przerabianieTekstuNaMorse.entrySet())
            {
                przerabianieMorseNaTekst.put(entry.getValue(), entry.getKey());
            }
        }

        public static String przerobNaTekst(String tekst)
        {
            StringBuilder kodMorse = new StringBuilder();
            for (char c : tekst.toUpperCase().toCharArray())
            {
                if (przerabianieTekstuNaMorse.containsKey(c))
                {
                /*Dodanie do kodu Morse'a odpowiednika znaku 'c' (pobrany z mapy przerabianieTekstuNaMorse),
                a następnie dodanie spacji jako separatora między kodami Morse'a dla kolejnych znaków*/
                    kodMorse.append(przerabianieTekstuNaMorse.get(c)).append(" ");
                }
                else
                {
                    kodMorse.append("? "); //Znak nieobsługiwany
                }
            }
            return kodMorse.toString().trim();//Zwracanie ciągu znaków Morse'a bez zbędnych spacji na końcu
            //Zwracanie ciągu znaków Morse'a bez zbędnych spacji na końcu
        }

        public static String przerobNaMorse(String morse)//Metoda, która zamienia kod Morse'a na tekst w języku naturalnym

        {
            StringBuilder tekst = new StringBuilder();//Obiekt do budowy tekstu z kodu Morse'a
            String[] morseSymbols = morse.split(" ");//Rozdzielenie kodu Morse'a na symbole według spacji
            for (String symbol : morseSymbols)//Iteracja po symbolach Morse'a
            {
                //Jeśli symbol jest obsługiwany, znajdź jego odpowiednik w mapie
                if (przerabianieMorseNaTekst.containsKey(symbol))
                {
                    tekst.append(przerabianieMorseNaTekst.get(symbol));
                }
                else if (symbol.equals("/"))//Separator słów w kodzie Morse'a
                {
                    tekst.append(" ");//Dodanie spacji jako separatora między słowami
                }
                else
                {
                    tekst.append("?"); //Kod nieobsługiwany
                }
            }
            return tekst.toString(); //Zwracam zbudowany ciąg znaków
        }
    }
    //Cyrylica, nowa klasa
    public class KonwerterMorseCyrylica
    {
        private static final HashMap<Character, String> przerabianieTekstuNaMorseCyrylica = new HashMap<>();//tworzy mapę, która przechowuje parę klucz jako character np. "A" i wartość String np. kod Morse ".-".
        private static final HashMap<String, Character> przerabianieMorseNaTekstCyrylica = new HashMap<>();//tworzy mapę odwrotną do poprzedniej, przechowuje parę klucz jako String (kod Morse) i Character jako literę z alfabetu Cyrylicy.

        static
        {
            //do zmapowania znaków posługiwano się zawartością strony: https://en.wikipedia.org/wiki/Russian_Morse_code
            //Przykład do testowania: МОЯ СЕМЬЯ, tłumacz online: https://convertmorse.com/
            przerabianieTekstuNaMorseCyrylica.put('А', ".-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Б', "-...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('В', ".--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Г', "--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Д', "-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Е', ".");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ж', "....-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('З', "--..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('И', "..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Й', ".---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('К', "-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Л', ".-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('М', "--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Н', "-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('О', "---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('П', ".--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Р', ".-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('С', "...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Т', "-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('У', "..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ф', "..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Х', "....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ц', "-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ч', "---.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ш', "----");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Щ', "--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ъ', "--.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ы', "-.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ь', "-..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Э', "..-..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ю', "..--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Я', ".-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('Ё', ".--.--"); // przypisanie klucza i wartości (key, value)
            //alfabet cyrylicy zawiera 33 znaki tak jak powyżej

            //cyfry
            przerabianieTekstuNaMorseCyrylica.put('1', ".----");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('2', "..---");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('3', "...--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('4', "....-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('5', ".....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('6', "-....");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('7', "--...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('8', "---..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('9', "----.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('0', "-----");//przypisanie klucza i wartości (key, value)

            //spacja
            przerabianieTekstuNaMorseCyrylica.put(' ', "/");//przypisanie klucza i wartości (key, value)

            //Znaki interpunkcyjne i symbole
            przerabianieTekstuNaMorseCyrylica.put('.', ".-.-.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put(',', "--..--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('\'', ".----.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('\"', ".-..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('_', "..--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put(':', "---...");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put(';', "-.-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('?', "..--..");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('!', "-.-.--");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('-', "-....-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('+', ".-.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('/', "-..-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('(', "-.--.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put(')', "-.--.-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('=', "-...-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('@', ".--.-.");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('$', "...-..-");//przypisanie klucza i wartości (key, value)
            przerabianieTekstuNaMorseCyrylica.put('&', ".-...");//przypisanie klucza i wartości (key, value)

            //Tworzenie odwrotnej mapy używając interfejsu "Map"
            for (Map.Entry<Character, String> entry : przerabianieTekstuNaMorseCyrylica.entrySet())
            {
                przerabianieMorseNaTekstCyrylica.put(entry.getValue(), entry.getKey());
            }
        }
        public static String przerobNaTekstCyrylica(String tekstCyrylica)
        {
            StringBuilder kodMorseCyrylica = new StringBuilder();
            for (char c : tekstCyrylica.toUpperCase().toCharArray())
            {
                if (przerabianieTekstuNaMorseCyrylica.containsKey(c))
                {
            /*Dodanie do kodu Morse'a odpowiednika znaku 'c' (pobrany z mapy przerabianieTekstuNaMorseCyrylica),
            a następnie dodanie spacji jako separatora między kodami Morse'a dla kolejnych znaków*/
                    kodMorseCyrylica.append(przerabianieTekstuNaMorseCyrylica.get(c)).append(" ");
                }
                else
                {
                    kodMorseCyrylica.append("? "); //Znak nieobsługiwany
                }
            }

            return kodMorseCyrylica.toString().
            trim();//Zwracanie ciągu znaków Morse'a bez zbędnych spacji na końcu
        }
        public static String przerobNaMorseCyrylica(String morseCyrylica)//Metoda, która zamienia kod Morse'a na tekst w języku naturalnym
        {
            StringBuilder tekst = new StringBuilder();//Obiekt do budowy tekstu z kodu Morse'a
            String[] morseSymbols = morseCyrylica.split(" ");//Rozdzielenie kodu Morse'a na symbole według spacji
            for (String symbol : morseSymbols)//Iteracja po symbolach Morse'a
            {
                //Jeśli symbol jest obsługiwany, znajdź jego odpowiednik w mapie
                if (przerabianieMorseNaTekstCyrylica.containsKey(symbol))
                {
                    tekst.append(przerabianieMorseNaTekstCyrylica.get(symbol));
                }
                else if (symbol.equals("/"))//Separator słów w kodzie Morse'a
                {
                    tekst.append(" ");//Dodanie spacji jako separatora między słowami
                }
                else
                {
                    tekst.append("?"); //Kod nieobsługiwany
                }
            }
            return tekst.toString(); //Zwraca zbudowany ciąg znaków
        }
    }
}