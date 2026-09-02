public class ReverseString {

    public static void main(String[] args) {

        String str1 = "hdfkabc yklmn yeugabccat";
        String str2 = "abc";

        String reverseStr = new StringBuilder(str2).reverse().toString();

        String result = str1.replace(str2,reverseStr);

        System.out.println(result);
    }
}
