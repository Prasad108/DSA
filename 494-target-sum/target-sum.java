class Solution {
    private int ans;
    public int findTargetSumWays(int[] nums, int target) {
        dp(nums,0,target,0);
        return ans;
    }

    private void dp(int[] nums, int currIdx, int target, int currSum){
        // System.out.println("currIdx:"+currIdx+", currSum:"+currSum);
        if(currIdx==nums.length && currSum==target){
                ans++;
                return;
        }
            if(currIdx<nums.length){
                dp(nums,currIdx+1,target,currSum+nums[currIdx]);
                dp(nums,currIdx+1,target,currSum-nums[currIdx]);
            }
    }
}