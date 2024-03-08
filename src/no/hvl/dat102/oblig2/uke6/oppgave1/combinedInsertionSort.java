package no.hvl.dat102.oblig2.uke6.oppgave1;

public class combinedInsertionSort {
	
	//oppgave c
	
	public static <T extends Comparable<? super T>> void combinedInsertionSort(Object[] a) {
	    moveSmallestToFront(a);
	    insertionSortWithDoubleInsert(a);
	}

	private static void moveSmallestToFront(Object[] a) {
	    int minIndex = 0;
	    for (int i = 1; i < a.length; i++) {
	    	if (a[i].compareTo(a[minIndex]) < 0) {
	            minIndex = i;
	        }
	    }
	    Object temp = a[0];
	    a[0] = a[minIndex];
	    a[minIndex] = temp;
	}

	private static void insertionSortWithDoubleInsert(Object[] a) {
	    int n = a.length;
	    for (int i = 1; i < n; i += 2) {
	        Object temp1 = a[i];
	        Object temp2 = a[i - 1];
	        int j = i - 2;
	        while (j >= 0 && a[j].compareTo(temp1) > 0) {
	            a[j + 2] = a[j];
	            a[j + 1] = a[j - 1];
	            j -= 2;
	        }
	        a[j + 2] = temp1;
	        a[j + 1] = temp2;
	    }
	}

}
