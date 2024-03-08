package no.hvl.dat102.oblig2.uke6oppgave1.oppgave2;

public class QuickSort {

    public static <T extends Comparable<? super T>> void QuickSort(T[] a, int forste, int siste) {

        if (forste < siste) {
            int pivotIdx = partition(a, forste, siste);
            QuickSort(a, forste, siste);
            QuickSort(a, pivotIdx + 1, siste);
        }

    }

    private static <T extends Comparable<? super T>> int partition(T[] a, int forste, int siste) {
        int pivotIdx = (forste + siste) / 2;

        T pivotVerdi = a[pivotIdx];
        forste--;
        siste++;

        while (true) {
            do {
                forste++;
            } while (a[forste].compareTo(pivotVerdi) < 0);

            do {
                siste--;
            } while (a[siste].compareTo(pivotVerdi) > 0);

            if (forste >= siste) {
                return siste;
            }

            T temp = a[forste];
            a[forste] = a[siste];
            a[siste] = temp;

        }

    }

    /*
    Vi hadde desverre ikke tid til å måle å teste hver sorterings-metode :(
     */
}
