import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberofOccurences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(arr);
    }
    public boolean uniqueOccurrences(int[] arr) {
        //createing a hash set 
        HashMap<Integer,Integer> dic = new HashMap<Integer,Integer>();
        
        for(int num : arr){
            dic.put(num , dic.getOrDefault(num , 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for(int x : dic.values()){
            s.add(x);
        }

        return dic.size() == s.size();

    }
}
