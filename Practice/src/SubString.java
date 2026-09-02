/*
(Lowes, owe)---> true
        (Lowes,list)---> false
*/

public class SubString {

    public static boolean matchSubstring(String s1, String s2){
           int i;
           int j;
          for(i=0; i <= s1.length()-s2.length(); i++){
             j=0;
              while(j < s2.length()){

                  if((s1.charAt(i +j) != s2.charAt(j))){
                      break;
                  }
                  j++;
              }
              if(j == s2.length()){
                  System.out.println("present at " + i);
                  return true;
              }

          }

       return  false;
    }

    public static void main(String[] args) {

        String s1 = "AAAAAAAA";
        String s2 = "AAA";

        System.out.println( matchSubstring(s1,s2));

    }

}
