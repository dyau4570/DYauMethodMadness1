package DarrenYau;

public class DYauLib {
    public static boolean isPalindrome(String str) {
        String result = "";
        for (int i = str.length()-1; i > -1; i--) {
            result += str.substring(i, i+1);
        }
        return str.equals(result);
    }

    public static String dateStr(String str) {
        return str.substring(3,5) + "-" + str.substring(0,2) + "-" + str.substring(6,10);
    }

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

    public static void multiplicationTable(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            System.out.println(c += a);
        }
        return;
    }

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
