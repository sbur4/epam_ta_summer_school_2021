/**
 * Write a program to solve the problem.
 * You are given two integer numbers A and B.
 * Print all the numbers from A to B inclusive in ascending order, if A<B, or in descending order otherwise.
 * For this purpose you cannot use loops, C, arrays and collections
 */

public class Question3 {
    public static void main(String[] args) {
        int A = 5, B = 10;

        System.out.println(recursion(A, B));
        System.out.println(recursion(B, A));
    }

    public static String recursion(int A, int B) {
        if (A > B) {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + recursion(A - 1, B);
        } else {
            if (A == B) {
                return Integer.toString(A);
            }
            return A + " " + recursion(A + 1, B);
        }
    }
}