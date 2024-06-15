package org.dsalgo.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Quick sort is an in-place sorting algorithm. It is a divide and conquer algorithm which works by selecting a
     * pivot element from the array and partitioning the other elements into two sub-arrays according to whether they
     * are less than or greater than the pivot. The sub-arrays are then sorted recursively. This can be done in-place,
     * requiring small additional amounts of memory to perform the sorting.
     * <p>
     * Time complexity: O(n log n) average case, O(n^2) worst case Space complexity: O(log n)
     *
     * @param arr
     *         array to be sorted
     * @param low
     *      starting index
     * @param high
     *     ending index
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * This function takes last element as pivot, places the pivot element at its correct position in sorted array, and
     * places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot.
     *
     * @param arr
     *         array to be sorted
     * @param low
     *      starting index
     * @param high
     *     ending index
     *
     * @return index of pivot element
     */
    public static int partition(int[] arr, int low, int high) {
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
}
