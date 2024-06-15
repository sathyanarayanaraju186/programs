package org.dsalgo.sort;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArr = bubbleSort.bubbleSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }

    /**
     * Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and
     * swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. The
     * algorithm, which is a comparison sort, is named for the way smaller or larger elements "bubble" to the top of the
     * list. Although the algorithm is simple, it is too slow and impractical for most problems even when compared to
     * insertion sort. It can be practical if the input is usually in sort order but may occasionally have some
     * out-of-order elements nearly in position.
     *
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     *
     * @param arr
     *
     * @return sorted array
     */
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // iterate through all elements
        for (int i = 0; i < n - 1; i++) {
            // flag to check if any swapping is done in the inner loop
            boolean swapped = false;

            // iterate through all elements except the last i elements
            for (int j = 0; j < n - i - 1; j++) {

                // if the element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
