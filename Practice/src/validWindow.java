public class validWindow {

    private static int match(int[] timestamp, int windowSize){

        if(timestamp == null || timestamp.length == 0){
            return 0;
        }

        int maxRequest = Integer.MIN_VALUE;
        int size = timestamp.length;
        int left = 0;

        for(int right = 0; right < size; right++){

            while(timestamp[right] - timestamp[left] > windowSize){
                left++;
            }

            int currentWindowRequest = right - left + 1;
            maxRequest = Math.max(maxRequest, currentWindowRequest);

        }

        return maxRequest;
    }

    public static void main(String[] args) {

        int[] timestamps = {1,2,3,7,8,9,10};
        int windowSize = 3;
        System.out.println(match(timestamps, windowSize));

    }
}
