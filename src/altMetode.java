import java.util.Arrays;

public class altMetode {

        // Insertion Sort
        public static void insertionSort(Integer[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }

        // Selection Sort
        public static void selectionSort(Integer[] arr) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                int minIndex = i;
                for (int j = i+1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Quick Sort
        public static void quickSort(Integer[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        private static int partition(Integer[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            return i + 1;
        }

        // Merge Sort
        public static void mergeSort(Integer[] arr, int l, int r) {
            if (l < r) {
                int m = (l + r) / 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }

        private static void merge(Integer[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;

            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; ++i) {
                L[i] = arr[l + i];
            }
            for (int j = 0; j < n2; ++j) {
                R[j] = arr[m + 1 + j];
            }

            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static void main(String[] args) {
            Integer[] arr = {12, 11, 13, 5, 6};
            System.out.println("Array før sortering: " + Arrays.toString(arr));
            insertionSort(arr);
            System.out.println("Array etter Insertion sort: " + Arrays.toString(arr));

            Integer[] arr2 = {12, 11, 13, 5, 6};
            System.out.println("Array før sortering: " + Arrays.toString(arr2));
            selectionSort(arr2);
            System.out.println("Array etter Selection sort: " + Arrays.toString(arr2));

            Integer[] arr3 = {12, 11, 13, 5, 6};
            System.out.println("Array før sortering: " + Arrays.toString(arr3));
            quickSort(arr3, 0, arr3.length - 1);
            System.out.println("Array etter Quick sort: " + Arrays.toString(arr3));

            Integer[] arr4 = {12, 11, 13, 5, 6};
            System.out.println("Array før sortering: " + Arrays.toString(arr4));
            mergeSort(arr4, 0, arr4.length - 1);
            System.out.println("Array etter Merge sort: " + Arrays.toString(arr4));
        }
    }

