package day30.hw28anton;

public class Array03 {
    /* Consider the leftmost and righmost appearances
    of some value in an array. We’ll say that the “span”
    is the number of elements between the two inclusive.
    A single value has a span of 1. Returns the largest span
     found in the given array. (Efficiency is not a priority.)
     */
    public static void main(String[] args) {

        System.out.println(maxSpan(1, 2, 1, 1, 3));// →4
        System.out.println(maxSpan(1, 4, 2, 1, 4, 1, 4));// →6
        System.out.println(maxSpan(1, 4, 2, 1, 4, 4, 4));// →6

    }

    private static int findMin(int... arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    private static int findMyMax(int... input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }

    private static int maxSpan(int... args) {
        int countMin = 0;
        int countMax = 0;
        for (int element : args) {
            if (element == findMin(args)) {
                countMin++;
            }
            if (element == findMyMax(args)) {
                countMax++;
            }
        }
        return countMax + countMin;
    }
}
