import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSumSubarray {

    public static int targetSum(int[] arr, int target) {

        int start = 0, count = 0, total = 0;
        int startIndex = -1, endIndex = -1;
        int prefixSum = 0;

        // prefixSum -> index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            int requiredSum = prefixSum - target;

            if (map.containsKey(requiredSum)) {

                // EXACT same style as string solution
                start = map.get(requiredSum) + 1;
                count = i - map.get(requiredSum);

                if (count > total) {
                    total = count;
                    startIndex = start;
                    endIndex = i;
                }
            }

            map.putIfAbsent(prefixSum, i);
        }

        if (startIndex != -1) {
            System.out.println(startIndex + " -> " + endIndex);

            System.out.println(Arrays.toString(
                    Arrays.copyOfRange(arr, startIndex, endIndex + 1)
            ));
        }

        return total;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println("Length: " + targetSum(arr, target));
    }
}