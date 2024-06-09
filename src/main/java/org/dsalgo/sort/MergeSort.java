package org.dsalgo.sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * Merge sort is an efficient, stable, comparison-based, divide and conquer sorting algorithm. Most implementations
     * produce a stable sort, which means that the implementation preserves the input order of equal elements in the
     * sorted output. Merge sort is a general-purpose sort and has an average-case time complexity of O(n log n).
     * <p>
     * Time complexity: O(n log n) Space complexity: O(n)
     *
     * @param input
     *         array to be sorted
     * @param start
     *         starting index
     * @param end
     *         ending index
     */
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    /**
     * This function merges two sorted arrays into one sorted array.
     *
     * @param input
     *         array to be sorted
     * @param start
     *         starting index
     * @param mid
     *         middle index
     * @param end
     *         ending index
     */
    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j]
                                ? input[i++]
                                : input[j++];
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
