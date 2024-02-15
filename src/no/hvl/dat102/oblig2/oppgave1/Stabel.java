package no.hvl.dat102.oblig2.oppgave1;

public class Stabel<T> {

    private T[] a;
    private int topIndex;

    public static <T extends Comparable<? super T>> void InsertionSort(T[] a, int forste, int siste) {

        for (int i = forste + 1; i <= siste; i++) {
            //Temp verdi for å lagre a[i] sin verdi
            T temp = a[i];
            int j = i - 1;

            //Isteden for compareTo kan vi bare ha temp >= a[j], compareTo metoden er veldig sakte når vi sorterer lister
            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

    }
}
