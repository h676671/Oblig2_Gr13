package no.hvl.dat102.oblig2.uke6.oppgave2;

public class main {
	
	 public static void main(String[] args) {
	        // Example usage and time measurement
	        Integer[] a = {5, 2, 9, 1, 5, 6};
	        long timeTaken = measureTime(a, "quickSort");
	        System.out.println("Time taken: " + timeTaken + " nanoseconds");
	        System.out.println(Arrays.toString(a));
	    }

}
