public class PalindromSubstring {

    static String palin(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            // Odd length
            String odd = expand(str, i, i);

            // Even length
            String even = expand(str, i, i + 1);

            if (odd.length() > result.length()) {
                result = odd;
            }

            if (even.length() > result.length()) {
                result = even;
            }
        }

        return result;
    }

    static String expand(String str, int left, int right) {

        while (left >= 0 &&
               right < str.length() &&
               str.charAt(left) == str.charAt(right)) {

            left--;
            right++;
        }

        return str.substring(left + 1, right);
    }

    public static void main(String[] args) {

        String[] names = {
            "banana",
            "madam",
            "cbbd"
        };

        for (String name : names) {
            System.out.println(name + " -> " + palin(name));
        }
    }
}