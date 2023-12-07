class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            nMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(nMap.containsKey(complement) && i != nMap.get(complement)){
                return new int[]{i, nMap.get(complement)};
            }
        }
        return new int[]{};
    }
}