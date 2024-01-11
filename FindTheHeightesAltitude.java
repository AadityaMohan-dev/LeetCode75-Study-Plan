public class FindTheHeightesAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int n  = gain.length;
        int altitude = 0;
        int i = 0;
        int maxAlt = 0;
        while(i<n){
            altitude = altitude + gain[i];
            i++;
            maxAlt = Math.max(altitude, maxAlt);
        }
        return maxAlt;
    }
}
