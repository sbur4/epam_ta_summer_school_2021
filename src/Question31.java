public class Question31 {
    public static void main(String[] args) {
        int result = sum(5, 2);
        System.out.println(result);
    }

    public static int sum(int A, int B) {
        if (B > A) {
            return B + sum(A, B - 1);
        } else if (A > B) {
            return A + sum(A - 1, B);
        } else {
            return 0;
        }
    }
}