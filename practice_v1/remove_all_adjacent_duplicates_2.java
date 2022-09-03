class Solution {
    public String removeDuplicates(String s, int k) {
        
        if(s.length() == 0 || k == 0){
            return s;
        }
        
        Stack<Pair<Character,Integer>> StoreFrequencies = new Stack<>();
        
        
        for(char c : s.toCharArray()){
            if(StoreFrequencies.isEmpty()){
                Pair<Character,Integer> freq = new Pair<>(c, 1);
                StoreFrequencies.add(freq);
            }
            else{
                char d = StoreFrequencies.peek().getKey();
                if(c == d){
                    Pair<Character,Integer> freq = StoreFrequencies.pop();
                    int frequency = freq.getValue() + 1;
                    
                    if(frequency == k) continue;
                    else{
                        Pair<Character,Integer> newFrequency = new Pair<>(c, frequency);
                        StoreFrequencies.add(newFrequency); 
                    }
                }
                else{
                    Pair<Character,Integer> freq = new Pair<>(c, 1);
                    StoreFrequencies.add(freq);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!StoreFrequencies.isEmpty()){
            Pair<Character,Integer> freq = StoreFrequencies.pop();
            for(int i = 0;i<freq.getValue(); i++){
                sb.append(freq.getKey());
            }
        }

        
        return sb.reverse().toString();
        
    }
}
