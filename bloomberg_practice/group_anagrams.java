class Solution {
    
    public String sort(String s){
        char [] c = s.toCharArray();
        Arrays.sort(c);
        return new String (c);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        
        List<List<String>> groupedAnagrams = new ArrayList<>(); 
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            
            String sorted = sort(s);
            
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(s);
        }
        
        for(String s : map.keySet()){
            groupedAnagrams.add(map.get(s));
        }
        
        return groupedAnagrams;
    }
}
