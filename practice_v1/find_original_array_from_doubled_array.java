class Solution {
    
    
    public int[] findOriginalArray(int[] changed) {
    
        if(changed.length % 2 != 0){
            return new int[]{};
        }
        
        Arrays.sort(changed);
     
        Set<Integer> visited = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : changed){
            map.put(num, map.getOrDefault(num, 0)+1); 
        }
         
         List<Integer>list = new ArrayList<>();
         
         for(int num : changed){
             
             if(num == 0){
                 continue;
             }
             
             int doubledNum = num * 2;
             
             if(map.containsKey(num) && map.containsKey(doubledNum)){
                 
                 map.put(doubledNum, map.get(doubledNum)-1);
                 map.put(num, map.get(num)-1);
                 visited.add(num);
                 if(map.get(num) == 0){
                     map.remove(num);
                 }
                 if(map.get(doubledNum) == 0){
                     map.remove(doubledNum);
                 }
                 
                 list.add(num);
                 
             }
             
         }
          
        
          if(map.containsKey(0)){
              for(int i =0; i<map.get(0)/2; i++){
                  list.add(0);
              }
          }
        
        
        if(list.size() != changed.length/2){
            return new int[]{};
        }
        else{
            int[]ans = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                ans[i] = list.get(i);
            }
            return ans;
        }
        
        
    }
}
