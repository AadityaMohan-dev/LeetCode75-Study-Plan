public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int ele : nums){
           totalSum += ele;
        }
        for(int i = 0 ; i < nums.length; leftSum +=nums[i++]){
           if(leftSum *2 == totalSum -nums[i]){
               return i;
           }
       }
       return -1;
    }
}
