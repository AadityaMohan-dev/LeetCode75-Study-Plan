public class MoveZeros {
    public static void main(String[] args) {
        int[] nums ={0,1,0,3,4,5};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

       
         while(nonZeroIndex<nums.length){
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
