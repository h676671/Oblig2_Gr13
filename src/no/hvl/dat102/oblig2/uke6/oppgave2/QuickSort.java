package no.hvl.dat102.oblig2.uke6.oppgave2;

import no.hvl.dat102.oblig2.uke6.oppgave1.InsertSort;

import java.util.Arrays;

public class QuickSort {
    public static <T extends Comparable<? super T>> void quicksort(T[] a) {
        quicksort(a, 0, a.length - 1);
        InsertSort.InsertionSort(a, 0, a.length-1);
    }

    private static final int MIN_GRENSE = 3;
    public static <T extends Comparable<? super T>> void quicksort(T[] a, int forste, int siste) {

        if (siste - forste + 1 < MIN_GRENSE) {
            /*
             * Basistilfelle: Gjør ingenting
             * Boken kaller for sortering ved innsetting på elementer
             */
        } else {
            int delepunkt = partition(a, forste, siste);
            quicksort(a, forste, delepunkt - 1);
            quicksort(a, delepunkt + 1, siste);
        }
    }

    private static <T extends Comparable<? super T>> int partition(T[] a, int forste, int siste) {
        int midten = (forste + siste) / 2;

        sortFirstMiddleLast(a, forste, midten, siste);
        swap(a, midten, siste - 1);
        int pivotIdx = siste - 1;
        T pivotVerdi = a[pivotIdx];

        int fraV = forste + 1;
        int fraH = siste - 2;

        boolean ferdig = false;

        while (!ferdig) {
            while (a[fraV].compareTo(pivotVerdi) < 0) {
                fraV++;
            }

            while (a[fraH].compareTo(pivotVerdi) > 0) {
                fraH--;
            }

            if (fraV < fraH) {
                swap(a, fraV, fraH);
                fraV++;
                fraH--;
            } else {
                ferdig = true;
            }
        }
        swap(a, pivotIdx, fraV);
        pivotIdx = fraV;

        return pivotIdx;
       
        

    }

    private static <T extends Comparable<? super T>> void sortFirstMiddleLast(T[] a, int first, int mid, int last) {
        order(a, first, mid); // Make a[first] <= a[mid]
        order(a, mid, last); // Make a[mid] <= a[last]
        order(a, first, mid); // Make a[first] <= a[mid]
    } // end sortFirstMiddleLast

    private static <T extends Comparable<? super T>> void order(T[] a, int i, int j) {
        if (a[i].compareTo(a[j]) > 0) {
            swap(a, i, j);
        }
    }
    public static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    /*
    Vi hadde desverre ikke tid til å måle å teste hver sorterings-metode :(
     */
}
