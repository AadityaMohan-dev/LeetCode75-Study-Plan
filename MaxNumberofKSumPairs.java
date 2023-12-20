import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k = 5;
        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int lp = 0, rp = nums.length-1;
            while(lp < rp){
                if(nums[lp]+nums[rp] == k){
                    count++;
                    lp++;
                    rp--;
                }else if(nums[lp]+nums[rp] > k){
                    rp--;
                }else{
                    lp++;
                }
            }
        return count;
    }

}