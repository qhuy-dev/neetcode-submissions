class Solution {
	    public boolean hasDuplicate(int[] nums) {
	        int n = nums.length;
	        // int[] arr = new int[n*2];
	        Map<Integer,Integer> m = new LinkedHashMap<>();  
	        int i=0;
	        while(i>=n){
	        	
	        	if(m.containsKey(nums[i])) return true;
	        	m.put(nums[i], 1);
	        	++i;
	        }
	        return false;
	    }
	}