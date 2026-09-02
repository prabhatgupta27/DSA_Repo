//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int longestDistinctNaive(String s) {

        int result = 0;
        boolean[] visited;

        for (int i = 0; i < s.length(); i++) {
            visited = new boolean[256];
            for (int j = i; j < s.length(); j++) {

                if(visited[s.charAt(j)] == true){
                    break;
                }else{
                    result = Math.max(result, j-i+1);
                    visited[s.charAt(j)]=true;
                }

            }

        }

        return result;
    }

    public static void main(String args[])
    {
        String str = "abcadbd";//"geeksforgeeks";
        int len = longestDistinctNaive(str);
        System.out.print("The length of the longest distinct characters substring is "+ len);

        String s1="shrinkant" ;
        System.out.println(s1.hashCode());
        String s2 = new String("shrikant");
        System.out.println(s2.hashCode());
        String s3 = "shrikant"             ;
        System.out.println(s3.hashCode());
        String s4 = new  String("shrikant");
        System.out.println(s4.hashCode());
    }



}