class Solution {
   
    public boolean isStrobogrammatic(String num) {
        
        StringBuilder sb = new StringBuilder();
        
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('6','9');
        map.put('9','6');
        map.put('8','8');
        map.put('1','1');
        
        for(char c : num.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            else sb.append(map.get(c));
        }
        
        
        
        return sb.reverse().toString().equals(num);
    }
}
