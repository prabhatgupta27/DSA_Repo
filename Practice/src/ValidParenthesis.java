import java.util.Stack;

public class ValidParenthesis {

    private static boolean isValid(String str){

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){

            if(c=='(' || c== '{' || c== '['){
                stack.push(c);

            }else{
                if(stack.isEmpty() || !isMatch(stack.pop(),c)){
                    return false;
                }
            }

        }


        return stack.isEmpty();
    }

    private static boolean isMatch(char pop, char c) {
        if(pop == '(' && c ==')' || pop == '{' && c =='}' || pop == '[' && c ==']'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

      //  String s = "({[)}]";
        String s = "({[]})";
        System.out.println(isValid(s));
    }

}
