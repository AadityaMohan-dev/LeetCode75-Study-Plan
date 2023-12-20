public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String s, String t) {
        int str1 = s.length();
        int str2 = t.length();

        if(str1 < 1) return true;
        int i = 0 ;
        int j = 0 ;

        while(i < str2){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
            if(j == str1) return true;
        }
        return false;
    }
}
