package org.dsalgo.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Selection sort is an in-place comparison sorting algorithm. It has an O(n^2) time complexity, which makes it
     * inefficient on large lists, and generally performs worse than the similar insertion sort. Selection sort is noted
     * for its simplicity and has performance advantages over more complicated algorithms in certain situations,
     * particularly where auxiliary memory is limited.
     * <p>
     * Time complexity: O(n^2) Space complexity: O(1)
     *
     * @param arr
     *        array to be sorted
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
