package org.dsalgo.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is
     * much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
     * <p>
     * Time complexity: O(n^2) Space complexity: O(1)
     *
     * @param arr
     *        array to be sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
