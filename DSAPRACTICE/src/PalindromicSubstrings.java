import java.util.*;
public class PalindromicSubstrings  {
    
    static Set<String> result = new HashSet<>();


    public static void main(String[] args) {

        String s = "banana";

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            findPalindrome(s, i, i);
            System.out.println(i+"-----------------------------------");

            // Even length
            findPalindrome(s, i, i + 1);
        }

        System.out.println(result);

    }

    static void findPalindrome(String s, int left, int right) {
        
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
                   
            result.add(s.substring(left, right + 1));

         //   System.out.println(s.substring(left, right + 1));

            left--;
            right++;
        }
    }
}