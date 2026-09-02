public class CountCharacterAppend {

    private static String compressString(String s){

       if(s == null || s.isEmpty()){
           return "";
       }

       int i = 0;
       int n = s.length();
       StringBuilder sb = new StringBuilder();
       while(i < n){

           int j = i;
           char currentChar = s.charAt(i);

           while((j < n) && s.charAt(j) == currentChar){
               j++;
           }

           int count = j-i;
           sb.append(currentChar);

           if(count > 1){
               sb.append(count);
           }

           i = j;

       }
       return sb.toString();
    }


    public static void main(String[] args) {

       String s = "aaaabeee";

        System.out.println(compressString(s));


    }
}
