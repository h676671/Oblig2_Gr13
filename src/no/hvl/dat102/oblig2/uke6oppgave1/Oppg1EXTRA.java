package no.hvl.dat102.oblig2.uke6oppgave1;

public class Oppg1EXTRA {

    public static void main(String[] args) {

        //while (j >= 0 && a[j].compareTo(temp) < 0);

        int[] liste = generateRandomArray(100);
        long startTime = System.currentTimeMillis();

        //Flytter minste elementet først
        moveSmallestToFront(liste);

        //Setter inn to elementer om gangen
        insertionSortWithTwoElements(liste);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Tid på brukt sortering: " +duration+ "millisekunder");


    }

    //Metode for å generere tilfeldige tall i en tabell
    public static int[] generateRandomArray(int n) {

        int[] liste = new int[n];
        for(int i = 0; i < n; i++) {
            liste[i] = (int)(Math.random() * 1000); //Tilfeldige tall melom 0 og 999
        }
        return liste;
    }

    //Metode for å flytte minste element til starten av tabellen

    public static void moveSmallestToFront(int[] liste) {
        int minIndex = 0;
        for (int i = 1; i < liste.length; i++) {
            if (liste[i] < liste[minIndex]) {
                minIndex = i;
            }
        }

        int temp = liste[0];
        liste[0] = liste[minIndex];
        liste[minIndex] = temp;
    }

    //Setter inn to elementer om gangen
    public static void insertionSortWithTwoElements(int[] liste) {

        for (int i = 2; i < liste.length; i++) {

            int j = i-2;
            int min = liste[i-1];
            int max = liste[i];

            while(j>=1 && liste[j] > max) {
                liste[j+2] = liste[j];
                liste[j+1] = liste[j-1];
            }

            liste[j+2] = min;
            liste[j+1] = max;
        }

    }
}
