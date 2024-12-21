//repozytorium Github: https://github.com/kamarov360/MorseDK.git

import java.util.HashMap;//importowanie klasy HashMap, HashMap przechowuje dane w postaci par klucz-wartość i zapewnia dostęp do wartości na podstawie klucza
import java.util.Map;//importuje interfejs Map, który jest ogólnym kontraktem dla struktur danych przechowujących pary klucz-wartość.

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

        Obecnie niedostępne

        przerabianieTekstuNaMorse.put('А', "·−");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Б', "-...");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('В', ".--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Г', "--.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Д', "-..");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Е', ".");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ж', "....-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('З', "--..");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('И', "..");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Й', ".---");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('К', "-.-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Л', ".-..");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('М', "--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Н', "-.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('О', "---");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('П', ".--.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Р', ".-.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('С', "...");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Т', "-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('У', "..-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ф', "..-.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Х', "....");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ц', "-.-.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ч', "---.");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ш', "----");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Щ', "--.-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ъ', "--.--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ы', "-.--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ь', "-..-");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Э', "..-..");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Ю', "..--");//przypisanie klucza i wartości (key, value)
        przerabianieTekstuNaMorse.put('Я', ".-.-");//przypisanie klucza i wartości (key, value)
        */

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