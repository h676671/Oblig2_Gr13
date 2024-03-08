package no.hvl.dat102.oblig2.uke6oppgave1;

public class InsertionV2 {

    public static <T extends Comparable<? super T>> void InsertionSort(T[] a, int forste, int siste) {

        for (int i = forste + 1; i <= siste; i++) {
            //Temp verdi for å lagre a[i] sin verdi
            T temp = a[i];
            int j = i - 1;

            T storste = max(a[j], temp);
            T minste = min(a[j], temp);

            while (j >= 0 && temp.compareTo(storste) > 0) {

                a[j + 2] = a[j];
                j--;

            }
            a[j + 2] = temp;

            if (j >= 0) {
                a[j + 1] = minste;
                a[j] = storste;
            }
        }
    }

    //Hjelpe metode for å finne max og min
    private static <T extends Comparable<? super T>> T max(T element1, T element2) {
        if (element1.compareTo(element2) < 0) {
            return element1;
        } else {
            return element2;
        }
    }

    private static <T extends Comparable<? super T>> T min (T element1, T element2) {
        if (element1.compareTo(element2) > 0) {
            return element1;
        } else {
            return element2;
        }
    }
}
