package no.hvl.dat102.oblig2.uke6.oppgave2;

public class merge {

protected static <T extends Comparable<? super T>> void merge(Integer[] a, Integer[] venstre, Integer[] høyre) {
	
	int i = 0, j = 0, k= 0;
	while (i< venstre.length && j < høyre.length) {
		if (venstre[i] <= høyre[j]) {
			a[k++] = venstre[i++];
			
		} else {
			a[k++] = høyre[j++];
		}
}
        while (i < venstre.length) {
        	a[k++] = venstre[i++];
        	
        }
        
        while (j < høyre.length) {
        	a[k++] = høyre[j++];
        }
}
}
