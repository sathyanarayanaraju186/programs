package org.dsalgo.leetcode;

import java.text.MessageFormat;
import java.util.logging.Logger;

/**
 * This is a mountain array, which means the array is sorted in increasing order and then in decreasing order. Given a
 * mountain array, return the minimum index of the target element.
 * <p>
 * example: arr = {1, 2, 3, 4, 5, 3, 1}, target = 3, output = 2 example: arr = {1, 2, 3, 4, 5, 3, 1}, target = 100,
 * output = -1 example: arr = {1, 2, 3, 4, 5, 3, 1}, target = 1, output = 0 example: arr = {1, 2, 3, 4, 5, 3, 1}, target
 * = 5, output = 4
 * <p>
 * The solution is to find the peak element in the mountain array and then search for the target element in the left and
 * right of the peak element. The time complexity is O(log n) where n is the number of elements in the array.
 */

public class MinIndexInMountainArray {
    public static void main(String[] args) {
        // logger
        Logger log = Logger.getLogger(MinIndexInMountainArray.class.getName());
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        log.info(MessageFormat.format("The minimum index of the target element in the mountain array is: {0}",
                minIndexInMountainArray(arr, target)));

    }

    // Step 1:
    // find the peak element in the mountain array using binary search
    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // find the peak element, the element which is greater than its neighbors
        // continue the loop until the start and end are not equal
        while (start < end) {
            // find the middle element, avoid integer overflow for large numbers by using start + (end - start) / 2
            int mid = start + (end - start) / 2;

            // if the middle element is greater than the next element, then the peak element is on the left side
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
            // if the middle element is less than the next element, then the peak element is on the right side
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        // return the peak element
        // At the end start == end, so we can return either start or end, because above two conditions will always have a peak element
        return start;
    }

    // Step 2:
    // find the minimum index of the target element in the mountain array
    private static int minIndexInMountainArray(int[] arr, int target) {
        int peak = MinIndexInMountainArray.peakIndexInMountainArray(arr);
        int left = binarySearch(arr, target, 0, peak);
        if (left != -1) {
            return left;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    // Step 3:
    // find the target element using binary search which is order agnostic
    private static int binarySearch(final int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] <= arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
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

