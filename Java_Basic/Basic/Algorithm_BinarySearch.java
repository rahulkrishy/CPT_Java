// Binary search
/*
Binary search is a widely-used algorithm for finding a target value within a sorted array. 
It works by repeatedly dividing the search interval in half.

Algorithm:
1. Binary search starts by examining the middle element of the sorted array.
2. If the middle element is equal to the target value, the search is successful, and the index of the target is returned.
3. If the middle element is greater than the target value, the search continues on the left half of the array.
4. If the middle element is less than the target value, the search continues on the right half of the array.
5. The process repeats until the target value is found or the search interval becomes empty.

Implementation:
Binary search can be implemented iteratively or recursively.

Iterative approach:
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Found the target
        } else if (arr[mid] < target) {
            left = mid + 1; // Search in the right half
        } else {
            right = mid - 1; // Search in the left half
        }
    }
    return -1; // Target not found
}

Recursive approach:
public int binarySearch(int[] arr, int target, int left, int right) {
    if (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Found the target
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        } else {
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        }
    }
    return -1; // Target not found
}

Time Complexity:
Binary search has a time complexity of O(log n), where n is the number of elements in the array.
This makes it significantly faster than linear search for large arrays, as the search space is halved in each step.

Requirements:
Binary search requires the array to be sorted in ascending order for it to work correctly.
If the array is not sorted, the results of binary search will be unpredictable.

Usage:
Binary search is commonly used in scenarios where fast searching in sorted arrays is required, such as searching in dictionaries, phonebooks, or databases.

*/

// Code:

/* 
The Arrays.binarySearch() method in Java is a utility method provided in the java.util.Arrays class.
It performs a binary search on a sorted array to find the index of a specified target element efficiently.

Syntax:
public static int binarySearch(int[] a, int key)

Parameters:
a: The sorted array to be searched.
key: The value to be searched for in the array.

Return Value:
If the key value is found in the array, the method returns the index of the matching element.
If the key value is not found in the array, the method returns a 'negative value', which is the insertion point (index where the key would be inserted to maintain the sorted order).
*/

import java.util.Arrays;

public class Algorithm_BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;

        // Using Arrays.binarySearch() method
        int index = Arrays.binarySearch(sortedArray, target);

        if (index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

    }
}
