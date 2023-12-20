public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start_pointer = 0;
        int end_pointer = word.length-1;
        String vowels = "aeiouAEIOU";
        while(start_pointer < end_pointer){
            while (start_pointer < end_pointer && vowels.indexOf(word[start_pointer])==-1) {
                start_pointer++;
            }
            while (start_pointer < end_pointer && vowels.indexOf(word[end_pointer]) == -1) {
                end_pointer--;
            }

            char temp = word[start_pointer];
            word[start_pointer] = word[end_pointer];
            word[end_pointer] = temp;

            start_pointer++;
            end_pointer--;
        }
        String answer = new String(word);
        return answer;
    }
}
