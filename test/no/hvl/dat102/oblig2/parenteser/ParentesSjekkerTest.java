package no.hvl.dat102.oblig2.parenteser;
import org.junit.Before;
import org.junit.jupiter.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.config.JupiterConfiguration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParentesSjekkerTest {


	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	private String s7;

	@BeforeEach
	void nullstill() {
		String s1 = "{ [ ( ) ] }"; //er korrekt
		String s2 = "{ [ ( ) }";   //er ikke korrekt. Mangler sluttparentes ]
		String s3 =	"[ ( ) ] }";   //er ikke korrekt. Mangler startparentes {
		String s4 = "{ [ ( ] ) }";  //er ikke korrekt. Sluttparentes ] kommer for tidlig.

		String s5 = """
			class HelloWorld {
			    public static void main(String[] args) {
			        System.out.println("Hello World!");
			    }
			} """; //er korrekt

		String s6 = "";
		String s7 = "()";
	}
	@Test
	void testTrue() {
		assertTrue(ParentesSjekker.sjekkParenteser(s1));
		assertTrue(ParentesSjekker.sjekkParenteser(s5));
		assertTrue(ParentesSjekker.sjekkParenteser(s6));
		assertTrue(ParentesSjekker.sjekkParenteser(s7));

	}

	@Test
	void testFalse() {
		assertFalse(ParentesSjekker.sjekkParenteser(s2));
		assertFalse(ParentesSjekker.sjekkParenteser(s3));
		assertFalse(ParentesSjekker.sjekkParenteser(s4));
	}

}
