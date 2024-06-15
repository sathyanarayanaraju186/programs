package org.dsalgo.leetcode;

/**
 * Given a sorted array of numbers, find the index of a given number in the array using binary search. If the number is
 * not present, return -1. The array can be sorted in ascending or descending order.
 */
public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {9, 8, 5, 3, 1};
        int target = 5;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[0] < arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;

        // find the target element
        while (start <= end) {
            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // if the array is sorted in ascending order
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // if the array is sorted in descending order
            else {
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
