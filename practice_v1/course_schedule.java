class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i<numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        
        int[]demand = new int[numCourses];
        
        for(int[]p : prerequisites){
            map.get(p[0]).add(p[1]);
            demand[p[1]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i<numCourses; i++){
            if(demand[i] == 0){
                q.add(i);
            }
        }
        
        while(!q.isEmpty()){
            
            int course = q.remove();
            List<Integer> pre = map.get(course);
            for(int p : pre){
                demand[p]--;
                if(demand[p] == 0){
                    q.add(p);
                }
            }
        }
        
        for(int i = 0; i<numCourses; i++){
            if(demand[i]!=0){
                return false;
            }
        }
         
        return true;
        
    }
}
