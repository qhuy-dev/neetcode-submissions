class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int needNum = target - nums[i];
            if(map.containsKey(needNum))
            {
                int[] twoSum = new int[2];
                twoSum[0] = map.get(needNum);
                twoSum[1] = i;
                return twoSum;
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
