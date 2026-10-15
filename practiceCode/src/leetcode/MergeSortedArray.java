package leetcode;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        mergeArrays(arr1, arr2);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
//https://www.geeksforgeeks.org/dsa/merge-two-sorted-arrays-o1-extra-space/
    private static void mergeArrays(int[] nums1, int[] nums2) {

    }
}
