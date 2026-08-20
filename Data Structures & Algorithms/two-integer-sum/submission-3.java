class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int soCanTim = target - nums[i];
            if(map.containsKey(soCanTim))
            {
                int[] res = new int[2];
                res[0] = map.get(soCanTim);
                res[1] = i;
                return res;
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

