class Solution {
    
    public int getPower(int num){
        
        int count = 0;
        
        while(num != 1){  
            if(num % 2 == 0){
                num = num / 2;
            }
            else{
                num = (num * 3) + 1;
            }
            count++;
        }
        
        return count;
        
    }
    public int getKth(int lo, int hi, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        
        for(int num = lo; num<=hi; num++){
            //get Power
            int power = getPower(num);
            map.put(num, power);
        }
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            
           @Override
            
            public int compare(Integer o1, Integer o2){
              
                int f1 = map.get(o1);
                int f2 = map.get(o2);
                
                if(f1 == f2){
                    return o1 - o2;
                }
                
                return f1 - f2;
            }
            
        });
        
        
        for(int num = lo; num<=hi; num++){
            //get Power
            pq.add(num);
        }
        
        int ans = 0;
        while(k != 0){
            ans = pq.remove();
            k--;
        }
        
        return ans;
        
        
    }
}
