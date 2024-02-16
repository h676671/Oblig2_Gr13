package no.hvl.dat102.oblig2.oppgave1;

public class StabelMod {

    public static <T extends Comparable<? super T>> void InsertionSort(T[] a, int forste, int siste) {

        for (int i = forste + 1; i <= siste; i++) {
            //Temp verdi for å lagre a[i] sin verdi
            T temp = a[i];
            int j = i - 1;


            while (j >= 0 && temp.compareTo(a[j]) > 0) {

                if (j >= 1) {

               } else {
                   a[j + 1] = a[j];
                   j--;
               }

            }
            a[j + 1] = temp;
        }
    }
}
