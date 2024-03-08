package no.hvl.dat102.oblig2.parenteser;

import java.util.Set;

public class ParentesSjekker {

    private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
    private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
    private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");

    public static boolean sjekkParenteser(String s) {

        StabelADT<Character> stabel = new TabellStabel<>();

        //Legger til alle chars som finnes i strengen og som er i STARTPARENTSER
        for (char c : s.toCharArray()) {
            if (STARTPARENTESER.contains(c)) {
                stabel.push(c);

            //Hvis vi har en SLUTTPARENTES i strenger sjekker vi først om stabel er tom.
            //Er stabel tom, betyr det at vi har sluttparentes uten startparentes
            } else if (SLUTTPARENTESER.contains(c)) {
                if (stabel.isEmpty()) {
                    return false;

                }

                //Lagrer top verdien som top
                char top = stabel.pop();
                if (!erParentesPar(top, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean erStartParentes(char c) {
        return STARTPARENTESER.contains(c);
    }

    private static boolean erSluttParentes(char c) {
        return SLUTTPARENTESER.contains(c);
    }
    //Endret litt på parentesPar metoden
    private static boolean erParentesPar(char start, char slutt) {
        return PARENTESPAR.contains(String.valueOf(start) + String.valueOf(slutt));
    }
}
