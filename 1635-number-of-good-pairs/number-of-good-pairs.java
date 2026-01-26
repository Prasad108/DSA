class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            int occurance=map.get(key);
            ans+=occurance*(occurance-1)/2;
        }
        return ans;
    }
}