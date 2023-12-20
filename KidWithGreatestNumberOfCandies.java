import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int [] candies =  {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> list = new ArrayList<>();
            int max = 0 ;
            for(int i = 0 ; i < candies.length; i++){
                if(max < candies[i]){
                    max = candies[i];
                }
            }
            for(int i = 0 ; i < candies.length; i++){
                if(candies[i] + extraCandies >= max){
                    list.add(true);
                }
                else{
                    list.add(false);
                }
            }
            return list;
        }
    
}
