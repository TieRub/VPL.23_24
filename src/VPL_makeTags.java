/**
 * ## HTML (und andere) Tags erzeugen
 *
 * Entwickeln Sie nun bitte eine Methode `makeTags()`, die HTML-artige Zeichenketten
 * wie `"<em>Yay</em>"` aus zwei Zeichenketten erzeugen kann.
 *
 * - Eine Zeichenkette beschreibt ein Tag und eine Zeichenkette den Inhalt,
 *   der durch dieses Tag gekennzeichnet werden soll.
 * - Tags werden grundsätzlich klein geschrieben.
 * - Wird kein Tag angegeben (leere Zeichenkette "" oder null) soll nur der
 *   Inhalt zurückgegeben werden.
 * - Der Inhalt in Tags hat nie führende oder abschließende Leerzeichen.
 * - Tags und Inhalte sollen in der Ausgabe keine führenden oder abschließenden Whitespaces
 *   haben.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die String Methoden `trim()`, `isEmpty()` und `toLowerCase()` sind vermutlich hilfreich.
 * - Dadurch ist die Lösung letztlich viel einfacher als es aussieht.
 *
 */

public class VPL_makeTags {
    public static String makeTags(String tag, String content) {
        return null;
    }

    public static void main(String[] args) {
        String result = makeTags("em", " Yay ");
        System.out.println(result); // => "<em>Yay</em>"

        System.out.println(
                makeTags("CITE ", "Programmieren lernt man nur durch programmieren.")
        );
        // => "<cite>Programmieren lernt man nur durch programmieren.</cite>"

        System.out.println(makeTags("", "No tags")); // => No tags
    }
}
