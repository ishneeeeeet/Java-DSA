//Count how many times lower case vowels occurred in a String entered by the user.

package Strings;

public class qone {

    public static int vowelCount(String str) {
        String vowel = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < vowel.length(); j++) {

                if (str.charAt(i) == vowel.charAt(j)) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aeiou";
        System.out.println(vowelCount(str));
    }
}
