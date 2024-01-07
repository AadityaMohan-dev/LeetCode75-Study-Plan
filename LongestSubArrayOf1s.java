public class LongestSubArrayOf1s {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));

    }
    public static int longestSubarray(int[] nums) {
        int start = 0 ;
        int end = 0 ;
        int zeros = 1;
        int maxlen = 0;
        for(int i = start; i < nums.length; i++){
            if(nums[i] == 0 && zeros > 0){
                zeros--;
            }
            if(nums[i] == 0 & zeros <= 0){
                start++;
                maxlen = Math.max(maxlen,end + 1);
                
                end = 0 ;
            }
            end++;
        }
        return maxlen;
      }
      
}
