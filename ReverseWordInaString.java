public class ReverseWordInaString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] str = s.trim().split("//s+");
        String out = "";
        for(int i = str.length-1; i > 0; i--){
            out += str[i] + " ";
        }
        return out + str[0];
    }
}
