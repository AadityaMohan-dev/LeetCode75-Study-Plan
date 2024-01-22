import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDiffrenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //Creating two hash set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //using for each loop we add elements of nums1,nums2 in set1,set2 
        //respectively , to remove duplicates.
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        //creating two ArrayList and add sets to them
        List<Integer> diff1 = new ArrayList<>(set1);
        List<Integer> diff2 = new ArrayList<>(set2);

        //now removing element of set2 and set1 from diff1,diff2 respectively
        diff1.removeAll(set2);
        diff2.removeAll(set1);

        //now add diffrences to the result in form of seprate arrays
        List<List<Integer>> result = new ArrayList<>();
        result.add(diff1);
        result.add(diff2);

        return result;

    }
}
