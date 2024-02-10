package no.hvl.dat102.oblig2.parenteser;

import javax.swing.text.StringContent;
import java.util.Iterator;
import java.util.Set;

public class ParentesSjekker {
	
	private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
	private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
	private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");

	public static boolean sjekkParenteser(String s) {
		
		StabelADT<Character> stabel = new TabellStabel<>();

        for (char c : s.toCharArray()) {
           if (STARTPARENTESER.contains(c)) {
               stabel.push(c);
           } else if (SLUTTPARENTESER.contains(c)) {
               if (stabel.isEmpty()) {
                   return false;
               }
               char top = stabel.pop();
               if(!erParentesPar(top, c)) {
                   return false;
               }
           }
        }
		//TODO Ca. 10-15 kodelinjer her gir en komplett løsning 
		return true;
	}

	private static boolean erStartParentes(char c) {
		//TODO 1 kodelinje her
		return STARTPARENTESER.contains(c) ;
	}
	
	private static boolean erSluttParentes(char c) {
		//TODO 1 kodelinje her
		return SLUTTPARENTESER.contains(c);
	}
	
	private static boolean erParentesPar(char start, char slutt) {
		//TODO 1-2 kodelinje(r) her
        return PARENTESPAR.contains(String.valueOf(start + slutt));
	}
}
