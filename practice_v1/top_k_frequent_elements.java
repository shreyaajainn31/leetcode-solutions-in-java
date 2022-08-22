class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
        
        for(int num : map.keySet()){
            pq.add(num);
        }
        int[]ans = new int[k];
        int i = 0;
        while(k != 0){
           ans[i++] = pq.remove();
           k--;
        }
        
        return ans;
        
    }
}
