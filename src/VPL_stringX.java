/**
 * ## Verflixtes Zeichenketten formatieren mit `stringX()`
 *
 * Entwickeln Sie nun bitte eine Methode `stringX()`, die
 * alle 'x' aus einer Zeichenkette entfernt, es sei denn sie stehen am Anfang oder
 * am Ende der Zeichenkette.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * Hinweise:
 *
 * - Denken Sie über den Einsatz folgender String-Methoden nach.
 *   Die Wirkungsweise finden Sie im Handout der Unit 02 oder unter diesem
 *   [API Link](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html).
 * - `substring()`
 * - `replaceAll()`
 *
 */

public class VPL_stringX {

    public static String stringX(String s) {
        return "Unfug";
    }

    public static void main(String[] args) {
        String result = stringX("xxHix");
        System.out.println(result); // => xHix

        System.out.println(stringX("abxxxcd")); // => abcd
        System.out.println(stringX("xabxxxcdx")); // => xabcdx
    }
}

