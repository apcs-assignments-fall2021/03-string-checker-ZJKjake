import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {

        int r = str.length();
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 0; i < r; i++) {
            char t = str.charAt(i);
            if (t == 'a') {
                x++;
            }
            if (t == 'b') {
                y++;
            }
            if (t == 'c') {
                z++;
            }
        }
        return x + y + z;


    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        int x = str.length() - 3;
        for (int i = 0; i < x; i++) {
            String y = str.substring(i, i + 3);
            if (y.equals("The") || y.equals("the")) {
                return true;
            }
        }
        return false;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("What is your string?");
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        System.out.println("Your string has " + countABC(x) + " a's,b's or c's.");
        if (containsThe(x)) {
            System.out.println("Your string has the in it.");
        } else {
            System.out.println("Your string doesn't has the in it.");
        }
        if (isPalindrome(x)) {
            System.out.println("Your string is a Palindrome.");
        } else {
            System.out.println("Your string is not a Palindrome.");


            // YOUR CODE HERE
        }
    }
}

