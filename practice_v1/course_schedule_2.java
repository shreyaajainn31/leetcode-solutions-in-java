class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i<numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        
        
        int[]demand = new int[numCourses];
        int[]ans = new int[numCourses];
        Arrays.fill(ans, -1);
        for(int[]p : prerequisites){
            map.get(p[1]).add(p[0]);
            demand[p[0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        int ai = 0;
        for(int i = 0; i<numCourses; i++){
            if(demand[i] == 0){
                q.add(i);
                ans[ai++] = i;
            }
        }
        
        while(!q.isEmpty()){
            
            int course = q.remove();
            List<Integer> pre = map.get(course);
            for(int p : pre){
                demand[p]--;
                if(demand[p] == 0){
                    q.add(p);
                    ans[ai++] = p;
                }
            }
        }
        
        for(int i = 0; i<ans.length; i++){
            if(ans[i]== -1){
                return new int[0];
            }
        }
        
        return ans;
    }
}
