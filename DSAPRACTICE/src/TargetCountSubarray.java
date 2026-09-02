import java.util.HashMap;
import java.util.Map;

class TargetCountSubarray {

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixSumFreq = new HashMap<>();

        prefixSumFreq.put(0, 1);

        int currentPrefixSum = 0;
        int count = 0;

        for (int num : nums) {

            currentPrefixSum += num;

            int targetPrefixSum = currentPrefixSum - k;

            if (prefixSumFreq.containsKey(targetPrefixSum)) {
                count += prefixSumFreq.get(targetPrefixSum);
            }

            prefixSumFreq.put(
                    currentPrefixSum,
                    prefixSumFreq.getOrDefault(currentPrefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        TargetCountSubarray solution = new TargetCountSubarray();

        int[] nums1 = {1, 1, 1};
        System.out.println(solution.subarraySum(nums1, 2));

        int[] nums2 = {1, 2, 3};
        System.out.println(solution.subarraySum(nums2, 3));

        int[] nums3 = {1, -1, 0};
        System.out.println(solution.subarraySum(nums3, 0));

        int[] nums4 = {1, 2, 1, 2, 1};
        System.out.println(solution.subarraySum(nums4, 3));
    }
}