import java.util.Arrays;

public class ShiftOneRight {

    public static int[] shiftOne(int[] nums) {
        int j=0, oneCount=0;
        for(int n : nums){
            if(n != 1){
                nums[j++] = n;
            }else{
                oneCount++;
            }
        }

        while(j<nums.length){
            nums[j++]=1;
        }
        System.out.println(oneCount);
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,1,0,6,1,5,1,9,6,4};

        System.out.println(Arrays.toString(shiftOne(arr)));

    }
}
