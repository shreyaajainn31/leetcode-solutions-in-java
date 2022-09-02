class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        if(paragraph.length() == 0){
            return "";
        }
        
        
        List<String>words = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String s : banned){
            set.add(s);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : paragraph.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
            else{
                if(sb.length() != 0 && !set.contains(sb.toString()))
                    words.add(sb.toString());
                sb = new StringBuilder();
            }
        }
       
        if(sb.length() != 0 && !set.contains(sb.toString()))
             words.add(sb.toString());
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return Integer.compare(map.get(s2), map.get(s1));
            }
        });
        
        for(String s : map.keySet()){
            pq.add(s);
        }    
        if(!pq.isEmpty()) return pq.remove();
        return "";
    }
}
