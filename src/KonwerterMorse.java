//repozytorium Github: https://github.com/kamarov360/MorseDK.git

import java.util.HashMap;//importowanie klasy HashMap, HashMap przechowuje dane w postaci par klucz-wartość i zapewnia dostęp do wartości na podstawie klucza
import java.util.Map;//importuje interfejs Map, który jest ogólnym kontraktem dla struktur danych przechowujących pary klucz-wartość.

public class KonwerterMorse//deklaracja publicznej klasy KonwerterMorse
{
    private static final HashMap<Character, String> przerabianieTekstuNaMorse = new HashMap<>();//tworzy mapę, która przechowuje parę klucz jako character np. "A" i wartość String np. kod Morse ".-".
    private static final HashMap<String, Character> przerabianieMorseNaTekst = new HashMap<>();//tworzy mapę odwrotną do poprzedniej, przechowuje parę klucz jako String (kod Morse) i Character jako literę z alfabetu.
    private static final HashMap<String, Character> przerabianieMorseNaTekstCyrylica = new HashMap<>();//tworzy mapę, która przechowuje parę klucz jako character np. "A" i wartość String np. kod Morse ".-".
    private static final HashMap<Character, String> przerabianieTekstuNaMorseCyrylica = new HashMap<>();//tworzy mapę, która przechowuje parę klucz jako character np. "A" i wartość String np. kod Morse ".-".

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
        przerabianieTekstuNaMorse.put('\'', "--..--");//przypisanie klucza i wartości (key, value)
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

        /*do zmapowania znaków posługiwano się zawartością strony: https://en.wikipedia.org/wiki/Russian_Morse_code
        Cyrylica

        Przykład do testowania: МОЯ СЕМЬЯ, tłumacz online: https://kodMorsetranslator.com/russian-morse-code-translator/

        Obecnie niedostępne*/

        przerabianieTekstuNaMorseCyrylica.put('А', "·−");//przypisanie klucza i wartości (key, value)
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

        przerabianieTekstuNaMorseCyrylica.put('.', ".-.-.-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorseCyrylica.put(',', "--..--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorseCyrylica.put('\'', "--..--");//przypisanie klucza i wartości (key, value)
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

        przerabianieTekstuNaMorseCyrylica.put(' ', "/");//przypisanie klucza i wartości (key, value)

        //przerabianieTekstuNaMorse.put('Odbiór', ".---------."); Nie zadziała ponieważ program oczekuje w kluczu typu danych Char a nie String

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
    }

    public static String przerobNaMorseCyrylica(String morse)//Metoda, która zamienia kod Morse'a na tekst w języku naturalnym

    {
        StringBuilder tekst = new StringBuilder();//Obiekt do budowy tekstu z kodu Morse'a
        String[] morseSymbols = morse.split(" ");//Rozdzielenie kodu Morse'a na symbole według spacji
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

        //
         //
         //cyrylica
          //
        for (Map.Entry<Character, String> entry : przerabianieTekstuNaMorseCyrylica.entrySet())
        {
            przerabianieMorseNaTekstCyrylica.put(entry.getValue(), entry.getKey());
        }
        return tekst.toString(); //Zwracam zbudowany ciąg znaków
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
        return kodMorseCyrylica.toString().trim();//Zwracanie ciągu znaków Morse'a bez zbędnych spacji na końcu
    }

    public static String przerobNaMorse(String morse)//Metoda, która zamienia kod Morse'a na tekst w języku naturalnym

    {
        StringBuilder tekstCyrylica = new StringBuilder();//Obiekt do budowy tekstu z kodu Morse'a
        String[] morseSymbols = morse.split(" ");//Rozdzielenie kodu Morse'a na symbole według spacji
        for (String symbol : morseSymbols)//Iteracja po symbolach Morse'a
        {
            //Jeśli symbol jest obsługiwany, znajdź jego odpowiednik w mapie
            if (przerabianieMorseNaTekstCyrylica.containsKey(symbol))
            {
                tekstCyrylica.append(przerabianieMorseNaTekstCyrylica.get(symbol));
            }
            else if (symbol.equals("/"))//Separator słów w kodzie Morse'a
            {
                tekstCyrylica.append(" ");//Dodanie spacji jako separatora między słowami
            }
            else
            {
                tekstCyrylica.append("?"); //Kod nieobsługiwany
            }
        }
        return tekstCyrylica.toString(); //Zwracam zbudowany ciąg znaków
    }
}