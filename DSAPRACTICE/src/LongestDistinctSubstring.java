import java.util.HashMap;
import java.util.Map;

public class LongestDistinctSubstring {

    public static int longestSubstring(String str){

        int start=0, count=0, total=0, j=0, startIndex=0 ,endIndex=0;
        // will use character and index mapping in hashmap
        Map<Character, Integer> map = new HashMap<>();

        char[] c = str.toCharArray();

        for(int i=0; i<c.length; i++){
            if(map.containsKey(c[i]) && map.get(c[i]) >= start){

                start = map.get(c[i]) + 1;
                count = i - map.get(c[i]);

            }else{
                count++;
            }

            map.put(c[i],i);

            if(count > total){
                total = count;
                startIndex = start;
                endIndex = i;
            }
        }
        System.out.println(startIndex +"->"+ endIndex);
        System.out.println(str.substring(startIndex,endIndex+1));


        return total;
    }


    public static void main(String[] args) {

        String str = "abba";
        System.out.println(longestSubstring(str));

    }
}
