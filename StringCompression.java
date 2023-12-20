import java.util.HashMap;
import java.util.Map.Entry;

public class StringCompression {
    public static void main(String[] args) {
         char[] chars = {'a','a','b','b','c','c','c'};
         System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        String res = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Entry<Character, Integer> entry : map.entrySet()){
            res+=entry.getKey();
            if(entry.getValue() > 1){
                res+=entry.getValue();
            }
        }
        System.out.println(res);
        char[] out = res.toCharArray();
        return out.length;
    }
}


//solution which Work on leetcode 
/*
 * int n = chars.length;
        StringBuilder sb = new StringBuilder();
        
        int freq = 1;
        
        for (int i = 0; i < n; i++) {
            char c = chars[i];
            
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                freq++;
                i++;
            }
            
            sb.append(c);
            
            if (freq > 1) {
                sb.append(freq);
            }
            
            freq = 1;
        }
        
        String compressedStr = sb.toString();
        char[] compressedChars = compressedStr.toCharArray();
        
        for (int i = 0; i < compressedChars.length; i++) {
            chars[i] = compressedChars[i];
        }
        
        return compressedChars.length;
 */