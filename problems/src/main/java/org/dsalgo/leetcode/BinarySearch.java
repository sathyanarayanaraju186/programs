package org.dsalgo.leetcode;

/**
 * Given a sorted array of numbers, find the index of a given number in the array using binary search. If the number is
 * not present, return -1. The array can be sorted in ascending order.
 */
public class BinarySearch {
    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.print(binarySearch(arr, target));
    }

    // find the target element
    private static int binarySearch(final int[] arr, final int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2; // to get mid = (start + end) / 2, handle integer range.

            // if the middle element is greater than the target element
            if (arr[mid] > target) {
                end = mid - 1;
            }
            // if the middle element is less than the target element
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            // return mid (obviously equals to target)
            else {
                return mid;
            }
        }
        // if the target element is not found
        return -1;
    }

}
