package no.hvl.dat102.oblig2.uke6.oppgave2;

import java.util.Arrays;

import no.hvl.dat102.oblig2.uke6oppgave1.oppgave2.malTid;

public class main {
	
	 public static void main(String[] args) {
	        // Example usage and time measurement
	        Integer[] a = {5, 2, 9, 1, 5, 6};
	        long timeTaken = malTid.measureTime(a, "quickSort");
	        System.out.println("Time taken: " + timeTaken + " nanoseconds");
	        System.out.println(Arrays.toString(a));
	    }

}
