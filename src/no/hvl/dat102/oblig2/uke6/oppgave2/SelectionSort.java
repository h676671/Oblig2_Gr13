package no.hvl.dat102.oblig2.uke6.oppgave2;

public class SelectionSort {


    public static <T extends Comparable<? super T>> void SelectionSort(T[] a) {

        for (int i = 0; i < a.length; i++) {

            //Lagrer en kopi av index
            int min = i;

            for (int j = i + 1; j < a.length; j++ ) {

                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                T temp = a[i];
                a[i] = a[min];
                a[min] = temp;
             }
        }
    }


   
}
