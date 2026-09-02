import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Given a string example
        String 1: "hdfkabc yklmn yeugabccat"
replace
String 2: "abc" occurrences with reverse of string 2.

Given an array of integers, find max occurence
        (number & count) {1, 5, 3, 7, 7, 4, 5, 3, 7, 9}*/

class Test{

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7, 7, 4, 5, 3, 7, 9};
         HashMap<Integer, Integer> h = new HashMap<>();
       int  tempValue = 0;
       int tempKey = 0;
        int  tempValue1 = 0;
        int tempKey1 = 0;
        for (int i=0; i<arr.length; i++){

            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i])+1);
                tempKey1 = arr[i];
                tempValue1 = h.get(arr[i]);
                if(tempValue1 > tempValue){
                    tempKey = tempKey1;
                    tempValue = tempValue1;
                }

            }else{
                h.put(arr[i], 1);
            }

        }
        System.out.println(tempKey1 +"->" + tempValue1);

    }

}


