package no.hvl.dat102.oblig2.oppgave1;

public class StabelMod {
    //🦦🦦🦦
    public static <T extends Comparable<? super T>> void InsertionSort(T[] a) {

        int n = a.length;

        for (int i = n - 1; i > 0; i--) {
            if (a[i].compareTo(a[i - 1]) < 0) {
                swap(a, i, i - 1);
            }
        }

        int start = n % 2 == 1 ? 1 : 2;

        for (int i = start; i < n; i += 2) {
            T minste = null;
            T storste = null;

            if (a[i].compareTo(a[i + 1]) < 0) {
                minste = a[i];
                storste = a[i + 1];
            } else {
                minste = a[i + 1];
                storste = a[i];
            }

            int j = i - 1;

            while (storste.compareTo(a[j]) < 0) {
                a[j + 2] = a[j];
                j--;
            }
            a[j + 1] = minste;
        }
    }
    //🦦🦦🦦

    public static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
