/**
 * Write a program to solve the problem.
 * You are given an array of numbers.
 * Determine and print the indexes of three smallest numbers of the array.
 * Develop such an algorithm that only one common loop will be used to find the three smallest elements.
 */

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < first) {
                third = second;
                second = first;
                first = i;
            } else if (i < second) {
                third = second;
                second = i;
            } else if (i < third)
                third = i;
        }

        System.out.printf("%d %d %d%n", first, second, third);
    }
}