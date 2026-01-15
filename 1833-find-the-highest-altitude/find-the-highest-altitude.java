class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int currAltitude=0;
        for(int altitude:gain){
            currAltitude+= altitude;
           max= Math.max(max,currAltitude);
        }
        return max;
    }
}