import java.util.HashMap;
import java.util.Map;

public class KonwerterMorse {

    private static final HashMap<Character, String> przerabianieTekstuNaMorse = new HashMap<>();
    private static final HashMap<String, Character> przerabianieMorseNaTekst = new HashMap<>();

    static {
        // Znaki alfabetu
        przerabianieTekstuNaMorse.put('A', ".-");
        przerabianieTekstuNaMorse.put('B', "-...");
        przerabianieTekstuNaMorse.put('C', "-.-.");
        przerabianieTekstuNaMorse.put('D', "-..");
        przerabianieTekstuNaMorse.put('E', ".");
        przerabianieTekstuNaMorse.put('F', "..-.");
        przerabianieTekstuNaMorse.put('G', "--.");
        przerabianieTekstuNaMorse.put('H', "....");
        przerabianieTekstuNaMorse.put('I', "..");
        przerabianieTekstuNaMorse.put('J', ".---");
        przerabianieTekstuNaMorse.put('K', "-.-");
        przerabianieTekstuNaMorse.put('L', ".-..");
        przerabianieTekstuNaMorse.put('M', "--");
        przerabianieTekstuNaMorse.put('N', "-.");
        przerabianieTekstuNaMorse.put('O', "---");
        przerabianieTekstuNaMorse.put('P', ".--.");
        przerabianieTekstuNaMorse.put('Q', "--.-");
        przerabianieTekstuNaMorse.put('R', ".-.");
        przerabianieTekstuNaMorse.put('S', "...");
        przerabianieTekstuNaMorse.put('T', "-");
        przerabianieTekstuNaMorse.put('U', "..-");
        przerabianieTekstuNaMorse.put('V', "...-");
        przerabianieTekstuNaMorse.put('W', ".--");
        przerabianieTekstuNaMorse.put('X', "-..-");
        przerabianieTekstuNaMorse.put('Y', "-.--");
        przerabianieTekstuNaMorse.put('Z', "--..");
        przerabianieTekstuNaMorse.put('1', ".----");
        przerabianieTekstuNaMorse.put('2', "..---");
        przerabianieTekstuNaMorse.put('3', "...--");
        przerabianieTekstuNaMorse.put('4', "....-");
        przerabianieTekstuNaMorse.put('5', ".....");
        przerabianieTekstuNaMorse.put('6', "-....");
        przerabianieTekstuNaMorse.put('7', "--...");
        przerabianieTekstuNaMorse.put('8', "---..");
        przerabianieTekstuNaMorse.put('9', "----.");
        przerabianieTekstuNaMorse.put('0', "-----");
        przerabianieTekstuNaMorse.put(' ', "/");

        // Znaki diakrytyczne
        przerabianieTekstuNaMorse.put('Ą', ".-.-");
        przerabianieTekstuNaMorse.put('Ć', "-.-..");
        przerabianieTekstuNaMorse.put('Ę', "..-..");
        przerabianieTekstuNaMorse.put('Ł', ".-..-");
        przerabianieTekstuNaMorse.put('Ń', "--.--");
        przerabianieTekstuNaMorse.put('Ó', "---.");
        przerabianieTekstuNaMorse.put('Ś', "...-...");
        przerabianieTekstuNaMorse.put('Ż', "--..-.");
        przerabianieTekstuNaMorse.put('Ź', "--..-");

        // Interpunkcja
        przerabianieTekstuNaMorse.put('.', ".-.-.-");
        przerabianieTekstuNaMorse.put(',', "--..--");

        // Tworzenie odwrotnej mapy
        for (Map.Entry<Character, String> entry : przerabianieTekstuNaMorse.entrySet()) {
            przerabianieMorseNaTekst.put(entry.getValue(), entry.getKey());
        }
    }

    public static String przerobNaTekst(String text) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            if (przerabianieTekstuNaMorse.containsKey(c)) {
                morseCode.append(przerabianieTekstuNaMorse.get(c)).append(" ");
            } else {
                morseCode.append("? "); // Znak nieobsługiwany
            }
        }
        return morseCode.toString().trim();
    }

    public static String przerobNaMorse(String morse) {
        StringBuilder text = new StringBuilder();
        String[] morseSymbols = morse.split(" ");
        for (String symbol : morseSymbols) {
            if (przerabianieMorseNaTekst.containsKey(symbol)) {
                text.append(przerabianieMorseNaTekst.get(symbol));
            } else if (symbol.equals("/")) {
                text.append(" ");
            } else {
                text.append("?"); // Kod nieobsługiwany
            }
        }
        return text.toString(); // Zwracamy zbudowany ciąg znaków
    }
}