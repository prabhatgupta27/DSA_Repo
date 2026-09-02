import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccerance {

    public static void main(String[] args) {
        String str = "welcomehello";

        /*int [][] k = {{1,2,3,4},{4,5,6,7},{7,8,3,4}};
        System.out.println((int)'d');

       List<Integer> listStream =  Arrays.stream(k).flatMapToInt(i -> Arrays.stream(i)).boxed().collect(Collectors.toList());
       Set<Integer> setStream =  Arrays.stream(k).flatMapToInt(i -> Arrays.stream(i)).boxed().collect(Collectors.toSet());

        System.out.println(listStream);
        System.out.println(setStream);*/

        char mostOccurringChar = findMostOccurringChar(str);
        System.out.println("Most occurring character: " + mostOccurringChar);
    }

    public static char findMostOccurringChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }



        int maxCount = -1;
        char mostOccurringChar = '\0';
        int i;
        for (i = 0; i < str.length(); i++) {

            if (charCount[str.charAt(i)] > maxCount) {
                maxCount = charCount[str.charAt(i)];
                mostOccurringChar = str.charAt(i);
            }
        }
      //  System.out.println(Thread.currentThread().getName());
        return mostOccurringChar;
    }


}




