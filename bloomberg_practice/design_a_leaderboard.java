class Leaderboard {

    Map<Integer,Integer> map;
    PriorityQueue<Integer> pq;
    public Leaderboard() {
        map = new HashMap<>();
        pq = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
    }
    
    public void addScore(int playerId, int score) {
        map.put(playerId, map.getOrDefault(playerId,0)+score);
       
    }
    
    public int top(int K) {
       
        for(int num : map.keySet()){
            if(pq.size() < K){
                pq.add(num);
            }
            else{
                if(map.get(num) >= map.get(pq.peek())){
                    pq.remove();
                    pq.add(num);
                }
            }
        }
        
        int sum = 0;
        
        while(K != 0){
            sum+= map.get(pq.remove());
            K--;
        }
        
        return sum;
        
    }
    
    public void reset(int playerId) {
        map.remove(playerId);
        
        
    }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */
