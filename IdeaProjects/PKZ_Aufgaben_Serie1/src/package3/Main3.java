package package3;

public class Main3 {
    public static void main(String[] args)

    {
        String name = "Max Joachimstaller";
        final String adresse = "";
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";  //Variablennamen sinnvoll auf fhKufsteinTirol verkürzt
        //Variable durch Schlüsselwort final in eine Konstante verwandelt und Namen auf FH_KUFSTEIN_TIROL umbennant
        int alter = 21;
        System.out.println(name);
        System.out.println(alter);
         //strg+alt+L formatiert alle zeilen in der main methode
        System.out.println("Java verwendet für Strings \"doppelte Anführungszeichen\" und einzelne Anführungszeichen wie \'c\' um einzelne Zeichen zu definieren.");
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\ ");
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator");
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt die bestehende Zeile. \fist in der Konsole nicht bemerkbar, da es einen Seitenumbruch erzwingt");


    }

}


