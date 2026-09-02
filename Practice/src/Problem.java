import java.util.Arrays;



public class Problem {

    @Override
    public  boolean equals(Object obj){

        if(this == obj){
            System.out.println("after this");
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            System.out.println("after null");
            return false;
        }
        System.out.println("after null block");
        return true;
    }

    public static boolean isNumeric(String str){

        if(str instanceof String){
            return true;
        }else {
            return false;
        }

         /* int i;
          int dot=0;
          int[] allPossible = new int[256];
          for(i=0; i< str.length();i++){
             char c = str.charAt(i);
             allPossible[c]++;
              System.out.println("c => " +(int)c);
              if((c < '0' || (c > '9'))  ){
                  Arrays.stream(allPossible).distinct().sorted().forEach((a)-> System.out.println(a));
                  return false;

              }else if((c == '.' )){

                  dot++;
                  System.out.println(dot);
              }
          }


       return true;*/
    }

    public static void main(String[] args) {

        String s1 = "11112345PR.00000";
        String s2 = "11112345PR.00000";
        Problem p = new Problem();
        System.out.println(s1.equals(s2));

        System.out.println(isNumeric(s1));


    }

}
