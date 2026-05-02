class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key))
            {
                ArrayList<String> value = new ArrayList<>();
                map.put(key, value);
            }
            map.get(key).add(strs[i]);
        }
        List<List<String>> list = new ArrayList<>();
        for(List<String> x : map.values())
        {
            list.add(x);
        }
        return list;
    }
}