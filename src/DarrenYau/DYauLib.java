package DarrenYau;
public class DYauLib {
    /**
     * Says whether or not the input is a palindrome
     * @param str the string to check whether or not it is a palindrome
     * @return true or false
     */
    public static boolean isPalindrome(String str) {
        String result = "";
        for (int i = str.length()-1; i > -1; i--) {
            result += str.substring(i, i+1);
        }
        return str.equals(result);
    }

    /**
     * Converts a date from having slashes to switching the months and days with dashes
     * @param str the input date
     * @return the new date without the dashes
     */
    public static String dateStr(String str) {
        return str.substring(3,5) + "-" + str.substring(0,2) + "-" + str.substring(6);
    }

    /**
     * Determines whether or not a value is part of the Fibonacci sequence starting from 0 and 1
     * @param a an integer to determine whether or not is part of the Fibonacci sequence
     * @return true or false
     */
    public static boolean isFibonnaci(int a) {
        int b = 0;
        int c = 1;
        int sum = 0;
        for (int i = 0; i < a; i++){
            sum = b + c;
            if (sum == a) {
                return true;
            }
            b = c;
            c = sum;
        }
        return false;
    }

    /**
     * Gives the multiplication table of the base up to the range
     * @param a the base
     * @param b the range
     */
    public static void multiplicationTable(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            System.out.println(c += a);
        }
        return;
    }

    /**
     * Determines the sum of all the numbers up to a certain number
     * @param a is the number that should be added last
     * @return the sum
     */
    public static int sumUpTo(int a) {
        int b = 1;
        int c = 0;
        for (int i = 0; i < a; i++) {
            System.out.println(c += b);
            b++;
        }
        return b;
    }
}