class Solution {
    private int ans;
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return dp(nums,0,target,0,memo);
    }

    private int dp(int[] nums, int currIdx, int target, int currSum, Map<String, Integer> memo){
        if(currIdx==nums.length ){
            if(currSum==target){
                return 1;
            }
                return 0;
        }
            String key= currIdx+","+currSum;
            if(memo.containsKey(key)){
                return memo.get(key);
            }
            int add=dp(nums,currIdx+1,target,currSum+nums[currIdx],memo);
            int sub=dp(nums,currIdx+1,target,currSum-nums[currIdx],memo);
            memo.put(key,add+sub);
            return memo.get(key); 
    }
}