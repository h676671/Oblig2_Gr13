package no.hvl.dat102.oblig2.uke6oppgave1;

public class Stabel {

    public static <T extends Comparable<? super T>> void InsertionSort(T[] a, int forste, int siste) {

        for (int i = forste + 1; i <= siste; i++) {

            //Temp verdi for å lagre a[i] sin verdi
            T temp = a[i];
            int j = i - 1;

            //CompareTo er veldig sakte når den blir brukt på arrays
            //while løkken brukte ca 4,184 ms mens for løkken brukte bare 1,252ms
            while (j >= 0 && temp.compareTo(a[j]) < 0) {

                //Denne linjen bruker mye tid
                a[j + 1] = a[j];

                j--;
            }
            a[j + 1] = temp;
        }
    }
}
