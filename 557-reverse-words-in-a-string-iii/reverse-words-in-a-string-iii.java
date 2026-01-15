class Solution {
    public String reverseWords(String s) {
        String[] strArray=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0; i< strArray.length; i++){
            StringBuilder sb2=new StringBuilder(strArray[i]);
            sb2.reverse();
            sb2.append(" ");
            sb.append(sb2.toString());
        }
        return sb.toString().trim();

    }
}