public class LongestSubArrayOf1s {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(longestSubarray(nums));

    }
    public static int longestSubarray(int[] nums) {
        int i = 0;
      int j = 0;
      int ans = 0;
      int cnt = 1;
      int n = nums.length;

      while( j < n ){
          if(nums[j] == 0){
              cnt = cnt - 1;
          }
          while(cnt < 0){
              if(nums[i] == 0){
                  cnt = cnt + 1;
              }
              i = i + 1;
          }
          ans = Math.max(ans,j-i);
          j = j+1;
      }
      return ans;
      }
      
}
