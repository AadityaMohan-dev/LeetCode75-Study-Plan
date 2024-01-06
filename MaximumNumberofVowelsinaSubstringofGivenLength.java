import java.util.HashSet;
import java.util.Set;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("weallloveyou", 7));
    }
    public static int maxVowels(String s, int k) {
        // creating a HashSet.
        Set<Character> set = new HashSet<Character> ();

        // add vowels in set.
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

         // if any value in upper case change it to lower case.
        s = s.toLowerCase();
        int max_count = 0;
        int start = 0;
        int curr = k ;
        int end = s.length();

        while (start < end && curr < end) {
            int vowels_count = 0 ;
            
            for(int i = start; i < curr; i++){
                if(set.contains(s.charAt(i))) vowels_count = vowels_count + 1;    
                
            }

            start++;
            curr = curr + start;
    
            max_count = Math.max(max_count,vowels_count);
            
        }
        
        return max_count;
    }
}


/*
 * int []pf=new int[S.length()];
    for(int i=0;i<S.length();i++){
        char ch=S.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            if(i==0){
                pf[i]=1;
            }else{
                pf[i]=pf[i-1]+1;
            }
        }else{
            if(i==0){
                pf[i]=0;
            }else{
                pf[i]=pf[i-1];
            }
        }
    }
    int max=Integer.MIN_VALUE;
    for(int i=0;i<S.length()-k+1;i++){
        int end=i+k-1;
        if(i==0){
            max=Math.max(max,pf[end]);
        }else{
            max=Math.max(max,pf[end]-pf[i-1]);
        }
    }
    return max;
 */
