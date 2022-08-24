package Strings;

public class palindrome {
    public static boolean checkPalindrome(String str) {
        int n = str.length() - 1;


        for(int i =0; i <= n; i++) {

            if(str.charAt(i) != str.charAt(n-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(checkPalindrome(str));
    }
}
