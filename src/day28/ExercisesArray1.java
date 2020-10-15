package day28;

import day20.FillAndPrintIntArray;

public class ExercisesArray1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7, 4, 6, 2};
        FillAndPrintIntArray.myPrintIntArray(makeEnds(arr1)); // → [1, 3]
        FillAndPrintIntArray.myPrintIntArray(makeEnds(arr2)); // → [1, 4]
        FillAndPrintIntArray.myPrintIntArray(makeEnds(arr3)); // → [7, 2]
    }

    private static int[] makeEnds(int[] arr) {
        int[] output = new int[]{arr[0], arr[arr.length - 1]};
        return output;
    }
}
