// Finding if an element exists in a SORTED array. If it does, return the index it's at.

/*
 * Say we have an array [1, 3, 4, 5, 13, 20, 25, 40, 42, 44, 53] and we want to find 13.
 * We're going to compare the value we want to the middle value of the array (in this case, it's 20).
 * Since 13 is less than 20, we know it's in the left half of the array and we can discard the elements in the right side.
 * We repeat this process over and over until we find the index of 13.
 *
 * We can implement this recursively or iteratively, but the recursive version has a space complexity of O(log n) while the latter is O(1).
 * https://www.youtube.com/watch?v=hKI93hOfeIk for reference.
 */

import java.util.Arrays;

public class BinarySearch {
    public static int binSearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length-1;

        while (left <= right) {
            int mid = (left + right) / 2; // have to recalculate mid each time

            if (arr[mid] == val) {
                return mid;
            } else if (val < arr[mid]) {
                right = mid - 1;
            } else { // val > arr[mid]
                left = mid + 1;
            }
        }

        return -1; // the left and right boundaries have crossed each other and this means the value doesn't exist in the array
    }

    public static void main(String[] args) {
        int[] test = { 1, 3, 4, 5, 13, 20, 25, 40, 42, 44, 53 };
        System.out.println(Arrays.toString(test));
        System.out.println("13 is at index: " + binSearch(test, 13));
        System.out.println("15 is at index: " + binSearch(test, 15));
    }
}