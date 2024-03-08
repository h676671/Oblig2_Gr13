package no.hvl.dat102.oblig2.uke6oppgave1.oppgave2;

public class insertionSort {
	
	public static <T extends Comparable<? super T>> void insertionSort(Integer[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }

}
