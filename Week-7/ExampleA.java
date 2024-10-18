public class ExampleA {
    // // Factorial using recursion
    // public static int factorial(int number) {

    // }

    // // Palindrome using recursion
    // public static boolean isPalindrome(String word1, String word2) {

    // }

    // Repeater function using recursion
    public static int multiplyBy2(int x) {
        if (x == 0) {
            return 0;
        }

        return 2 + multiplyBy2(x - 1);
    }

    public static void main(String[] args) {
        String s1 = "Hello World";

        System.out.println(s1.substring(0, s1.length() - 1));
    }
}