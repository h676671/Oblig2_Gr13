package no.hvl.dat102.oblig2.uke6.oppgave2;

public class MergeSort {

    public static <T extends Comparable<? super T>> void mergesort(T[] a, int n) {
        mergesort(a, 0, n - 1);
    }

    public static <T extends Comparable<? super T>> void mergesort(T[] a) {
        mergesort(a, 0, a.length - 1);
    }

    public static <T extends Comparable<? super T>> void mergesort(T[] a, int first, int last) {
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Comparable<?>[a.length];
        mergesort(a, tempArray, first, last);
    }

    private static <T extends Comparable<? super T>> void mergesort(T[] a, T[] tempTab, int forste, int siste) {

        if (forste >= siste) {
            /**
             * Basis: Denne gjør ingenting
             * Et triks for å vise at vi har tenkt på basistilfelle
              */
        } else {
            int midpunkt = (forste + siste) / 2;
            mergesort(a, tempTab, forste, midpunkt);
            mergesort(a, tempTab, midpunkt + 1, siste);
            merge(a, tempTab, forste, midpunkt, siste);
        }
    }

    private static <T extends Comparable<? super T>> void merge(T[] a, T[] tempTab, int forste, int midten, int siste) {

        int fV = forste;
        int sluttV = midten;
        int fH = midten + 1;
        int sluttH = siste;

        int index = fV;
        for (; (fV <= sluttV) && (fH <= sluttH); index++) {
            if (a[fV].compareTo(a[fH]) < 0) {
                tempTab[index] = a[fV];
                fV++;
            } else {
                tempTab[index] = a[fH];
                fH++;
            }
        }

        for (; fV <= sluttV; fV++, index++) {
            tempTab[index] = a[fV];
        }

        for (; fH <= sluttH; fH++, index++) {
            tempTab[index] = a[fH];
        }

        for (index = forste; index <= siste; index++) {
            a[index] = tempTab[index];
        }
    }

}
