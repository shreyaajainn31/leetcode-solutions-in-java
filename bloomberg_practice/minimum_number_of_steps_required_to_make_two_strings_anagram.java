class Solution {
    
    Map<Character,Integer> getCharacterCountFromString(String s){
        Map<Character,Integer> characterCount = new HashMap<>();
        for(char c : s.toCharArray()){
            characterCount.put(c, characterCount.getOrDefault(c,0)+1);
        }
        return characterCount;
    }
    
    public int minSteps(String s, String t) {
        
        Map<Character,Integer> sCharacterCount = getCharacterCountFromString(s);
        Map<Character,Integer> tCharacterCount = getCharacterCountFromString(t);
        
        int answer = 0;
        for(char c : s.toCharArray()){
                if(!sCharacterCount.containsKey(c)) continue;
                int f1 = sCharacterCount.get(c);
                int f2 = tCharacterCount.containsKey(c) ? tCharacterCount.get(c) : 0;
                int steps = Math.abs(f1 - f2);
                if(f1 < f2) continue;
                
                answer += steps;
                sCharacterCount.put(c, sCharacterCount.get(c)-steps);
                if(sCharacterCount.get(c) == 0){
                    sCharacterCount.remove(c);    
                }
        }
        
        return answer;
    
        
    }
}
