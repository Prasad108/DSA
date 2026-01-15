class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0){
            return ans;
        }
        List<Integer> rowOne=new ArrayList<Integer>();
        rowOne.add(1);
        ans.add(rowOne);
        if(numRows==1){
            return ans;
        }
        for(int i=1; i<numRows; i++){
            List<Integer> prevRow=ans.get(i-1);
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1;j<i;j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            ans.add(currRow);
        }

        return ans;
    }
}