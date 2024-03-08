package no.hvl.dat102.oblig2.uke6.oppgave2;

public class malTid {
	
	public static <T extends Comparable<? super T>> long measureTime(Integer[] a, String measureTime) {
        long startTime = System.nanoTime();
        switch (measureTime) {
            case "selectionSort":
                SelectionSort.SelectionSort(a);
                break;
            case "mergeSort":
                mergeSort.merge(a, a.length);
                break;
            case "quickSort":
                QuickSort.QuickSort(a, a.length, 1);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting method name");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

		//Insertion Sort ligger i oblig2.uke6.oppgave
	

}
