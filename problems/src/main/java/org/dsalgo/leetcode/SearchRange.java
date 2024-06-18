package org.dsalgo.leetcode;

/**
 * Given a sorted array of numbers, find the starting and ending index of a given number in the array using binary
 * search. If the number is not present, return [-1, -1].
 * <p>
 * example: arr = {1, 2, 2, 2, 3, 4, 5}, target = 2, output = [1, 3] example: arr = {1, 2, 3, 4, 5}, target = 6, output
 * = [-1, -1]
 */
public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 58;
//        int[] result = searchRangeBrutForce(arr, target);
        int[] result = searchRange(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }

    // find the starting and ending index of the target element using binary search
    // time complexity: O(log n)
    private static int[] searchRange(final int[] arr, final int target) {
        int start = binarySearch(arr, target, true);
        int end = binarySearch(arr, target, false);
        return new int[]{start, end};
    }

    // find the target element using binary search and return the starting or ending index based on the flag
    private static int binarySearch(final int[] arr, final int target, final boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                // if the target element is found then update the ans
                // and search for the target element in the left or right based on the flag.
                if (findFirst) {
                    ans = mid;
                    end = mid - 1;
                } else {
                    ans = mid;
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    // find the starting and ending index of the target element using brute force solution by traversing the array
    // time complexity: O(n)
    private static int[] searchRangeBruteForce(final int[] arr, final int target) {
        int[] result = {-1, -1};
        boolean findFirst = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (!findFirst) {
                    result[0] = i;
                    result[1] = i;
                    findFirst = true;
                }
                result[1] = i;
            }
        }
        return result;
    }
}
