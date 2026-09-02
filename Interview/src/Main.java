/*
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static char findFirstNonRepeatedChar(String str){

        Map<Character,Integer> charCount = new LinkedHashMap<>();

        str.chars().forEach(c->charCount.put((char)c,charCount.getOrDefault((char)c,0)+1));

        char leastRepeating = charCount.entrySet().stream()
                .filter(f->f.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');
        return leastRepeating;
    }

    public static void main(String[] args) {

        String str = "aabbccddeeffg";
        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);
        System.out.println("First non-repeated character: " + firstNonRepeatedChar);

    }

}*/



// Online IDE - Code Editor, Compiler, Interpreter
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static int subarraySumK(int[] nums, int k){

        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int prefixSum=0;
        int count=0;

        for(int s : nums){
            prefixSum+=s;

            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");

        int[] nums ={1,2,1,2};
        int k = 2;

        System.out.println(subarraySumK(nums, k));
    }
}

