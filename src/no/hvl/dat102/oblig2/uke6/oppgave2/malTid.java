package no.hvl.dat102.oblig2.uke6oppgave1.oppgave2;

import no.hvl.dat102.oblig2.uke6.oppgave1.InsertSort;
import no.hvl.dat102.oblig2.uke6.oppgave2.QuickSort;
import no.hvl.dat102.oblig2.uke6.oppgave2.SelectionSort;

public class malTid {
	
	public static <T extends Comparable<? super T>> long measureTime(Integer[] a, String measureTime) {
        long startTime = System.nanoTime();
        switch (measureTime) {
            case "insertionSort":
                InsertSort.InsertionSort(a, 0, 1);
                break;
            case "selectionSort":
                SelectionSort.SelectionSort(a);
                break;
            case "mergeSort":
                break;
            case "quickSort":
                QuickSort.QuickSort(a,1,1);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting method name");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}
