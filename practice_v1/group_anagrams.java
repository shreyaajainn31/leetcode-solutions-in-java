class Solution {
    String sortString(String s){
        char c [] = s.toCharArray();
        Arrays.sort(c);
        return new String (c);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            String sorted = sortString(s);
            
            if(!map.containsKey(sorted)){
                map.put(sortString(s), new ArrayList<>());
            }
            map.get(sortString(s)).add(s);
        }
         List<List<String>> ans = new ArrayList<>();
        for(String s : map.keySet()){
            ans.add(map.get(s));
        }

        return ans;
    }
}
