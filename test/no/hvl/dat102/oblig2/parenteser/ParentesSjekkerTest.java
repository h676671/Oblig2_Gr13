package no.hvl.dat102.oblig2.parenteser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		
		s1 = "{ [ ( ) ] }"; //er korrekt
		s2 = "{ [ ( ) }";   //er ikke korrekt. Mangler sluttparentes ]
		s3 = "[ ( ) ] }";   //er ikke korrekt. Mangler startparentes {
		s4 = "{ [ ( ] ) }"; //er ikke korrekt. Sluttparentes ] kommer for tidlig.
		s5 = """
			class HelloWorld {
			    public static void main(String[] args) {
			        System.out.println("Hello World!");
			    }
			} """; //er korrekt
		s6 = "";
		s7 = "()";
		
		//TODO Test om ParentesSjekkeren virker korrekt for eksemplene s1-s7 over.
	}

    @Test
    void testTrue() {
        assertTrue(ParentesSjekker.sjekkParenteser(s1));
        assertTrue(ParentesSjekker.sjekkParenteser(s5));
        assertTrue(ParentesSjekker.sjekkParenteser(s6));
        assertTrue(ParentesSjekker.sjekkParenteser(s7));
    }

}
