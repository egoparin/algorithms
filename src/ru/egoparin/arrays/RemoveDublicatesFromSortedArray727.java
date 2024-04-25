package ru.egoparin.arrays;

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
// Then return the number of unique elements in nums.
//
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
//
// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

public class RemoveDublicatesFromSortedArray727 {

    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[n - 1];

        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int[] testArray = {0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] testArray2 = {1, 1, 2};

        System.out.println(removeDuplicates(testArray2));
    }

}
