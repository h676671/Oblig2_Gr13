package no.hvl.dat102.oblig2.uke6oppgave1.oppgave2;

public class malTid {
	
	public static <T extends Comparable<? super T>> long measureTime(Integer[] a, String mal) {
        long startTime = System.nanoTime();
        switch (mal) {
            case "insertionSort":
                insertionSort(a);
                break;
            case "selectionSort":
                selectionSort(a);
                break;
            case "mergeSort":
                mergeSort(a);
                break;
            case "quickSort":
                quickSort(a, 0, a.length - 1);
                break;
            default:
                throw new IllegalArgumentException("Invalid sorting method name");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

}
