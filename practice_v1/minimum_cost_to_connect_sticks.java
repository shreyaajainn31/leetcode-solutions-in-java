class Solution {
    public int connectSticks(int[] sticks) {
        
        if(sticks.length == 0){
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int stick : sticks){
            pq.add(stick);
        }
        int sum = 0;
        while(pq.size()!=1){
            int t1 = pq.remove();
            int t2 = pq.remove();
            sum += t1+t2;
            pq.add(t1+t2);
        }
        
        return sum;
    }
}
