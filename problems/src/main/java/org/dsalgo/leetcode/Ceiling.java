package org.dsalgo.leetcode;

/**
 * Smallest number greater than or equal to target. Given a sorted array of numbers, find the index of the smallest
 * number greater than or equal to a given number in the array using binary search. If the number is not present, return
 * -1. The array can be sorted in ascending or descending order.
 * <p>
 * This is a variation of the OrderAgnosticBS.java problem. basically, it follows the binary search algorithm.
 */
public class Ceiling {
    public static void main(String[] args) {
        int[] ascArr = {4, 6, 10, 12, 15};
        int[] descArr = {15, 12, 10, 6, 4};

        int target = 10;
        System.out.println(ceiling(descArr, target));
    }

    // find the smallest number greater than or equal to target
    private static int ceiling(final int[] arr, final int target) {
        boolean isAsc = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;

        // find the target element
        while (start <= end) {

            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2;

            // if the array is sorted in ascending order
            if (isAsc) {
                // if the mid element is greater than or equal to target and the previous element is less than target
                if (arr[mid] >= target && (mid == 0 || arr[mid - 1] < target)) {
                    return mid;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // if the array is sorted in descending order
            else {
                // if the mid element is greater than or equal to target and the next element is less than target
                if (arr[mid] >= target && (mid == arr.length - 1 || arr[mid + 1] < target)) {
                    return mid;
                }
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
