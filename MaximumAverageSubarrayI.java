public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int [] nums ={1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        for(int j = 0 ; j < nums.length; j++){
            sum += nums[j];
        }
        int starting_index = 0 ;
        int gap_index = 0 ;
        int last_index = nums.length - 1;
       
        
        while(gap_index < last_index){
            double total =0 ;
            gap_index = starting_index + k;
            for(int i = starting_index ; i < gap_index; i++){
                total += nums[i];
            }
            sum = Math.max(sum,total);
            starting_index++;
        }
        return sum/k;
    }
}

/*correct answer */
/*
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i=k; i<nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(sum, maxSum); 
        }
        return (double)maxSum/k;
*/