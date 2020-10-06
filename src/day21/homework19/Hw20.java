package day21.homework19;

public class Hw20 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = getSum(array);
        System.out.println("Сумма элементов массива: " + sum);
        int min = findMin(array);
        System.out.println("Минимальный элемент массива: " + min);
        int max = giveMeMax(array);
        System.out.println("Максимальный элемент массива: " + max);
        double average = tellMeAverage(array);
        System.out.println("Среднее арифметическое: " + average);
    }

    private static double tellMeAverage(int[] input) {
        return (double) getSum(input) / input.length;
    }

    private static int giveMeMax(int[] array) {
        int max = Integer.MIN_VALUE;
        max = array[0];
        // min = 0; ошибка
        for (int i = 0; i < array.length; i++) {
            // min = Math.min(min, array[i]);
            max = (max > array[i]) ? max : array[i];
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = Integer.MIN_VALUE;
        min = array[0];
        // min = 0; ошибка
        for (int i = 0; i < array.length; i++) {
            // min = Math.min(min, array[i]);
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }

    private static int getSumSecond(int[] array) {
        return (array[0] + array[array.length - 1]) * array.length / 2;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int elementik : array) {
            sum = sum + elementik;
        }
        return sum;
    }
}
