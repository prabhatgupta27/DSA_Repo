public class NaiveLongestDistict {

    public static int longestDistinctNaive(String str){

        int result=0, n= str.length();
        boolean visited[] ;//= new boolean[256];
        int i;
        for (i=0; i<n; i++){
            visited = new boolean[256];
            for(int j=i; j<n; j++){

                if(visited[str.charAt(j)] == true){
                    break;
                }else{
                    result = Math.max(result,j-i+1);
                    visited[str.charAt(j)] = true;
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
    }
}
