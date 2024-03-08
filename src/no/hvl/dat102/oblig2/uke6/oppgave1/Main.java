package no.hvl.dat102.oblig2.uke6.oppgave1;

import no.hvl.dat102.oblig2.uke6.oppgave2.MergeSort;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Integer[] tab = random(32000);

        long startTid = System.currentTimeMillis();
        //InsertSort.InsertionSort(tab, 0, tab.length-1);
        //InsertionMod.InsertionSort(tab);
        //SelectionSort.SelectionSort(tab);
        MergeSort.mergesort(tab);
        long endTid = System.currentTimeMillis();

        long tid = endTid - startTid;

        System.out.println("Tidsbruk: " + tid/1000 + " sekunder");



    }

    public static <T> T[] random (int lengde) {
      Integer[] array = new Integer[lengde];
      Random random = new Random();
      for(int i = 0; i < lengde; i++) {
          array[i] = random.nextInt(Integer.MAX_VALUE);
      }

      return ((T[]) array);
    }

}
