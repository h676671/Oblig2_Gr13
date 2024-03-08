package no.hvl.dat102.oblig2.uke6oppgave1.oppgave2;

import java.util.Arrays;

public class mergeSort extends merge {
	
	private static <T extends Comparable<? super T>> void mergeSort(Integer[] a) {
		
		if (a.length > 1) {
			int mid = a.length / 2;
			Integer[] venstre = Arrays.copyOfRange(a, 0, mid);
			Integer[] høyre = Arrays.copyOfRange(a, mid, a.length);
			mergeSort(venstre);
			mergeSort(høyre);
			merge(a, venstre, høyre);
		}
	}


		
	}


