/**
 * Write a program to solve the problem.
 * You are given an array of numbers.
 * Double those positive elements of the array that are less than the average of all the elements.
 */
public class Question1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1};

        int sumArr = getSumOfArray(arr);
        int arrLength = arr.length;
        double average = (double) sumArr / arrLength;

        for (int i : arr) {
            if (i < average && i > 0) {
                System.out.print(i + " ");
            }
        }
//        Arrays.stream(arr).filter(i -> i < average && i > 0).mapToObj(i -> i + " ").forEach(System.out::print);
    }

    private static int getSumOfArray(int[] arr) {
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;
        }
        return sumArr;
//        return Arrays.stream(arr).sum();
    }
}