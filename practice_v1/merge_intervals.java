class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1){
            return intervals;
        }
        
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int startTime = intervals[0][0];
        int endTime = intervals[0][1];
    
        List<Integer> start = new ArrayList<>();
        start.add(startTime);
        start.add(endTime);
        ans.add(start);
        
        
        for(int i = 1; i<intervals.length; i++){
           
            int startTimeNew = intervals[i][0];
            int endTimeNew = intervals[i][1];
           
            List<Integer> merge = new ArrayList<>();
            
            if(startTimeNew <= endTime || endTimeNew <= endTime){
                ans.remove(ans.size()-1);
                // Merge
                merge.add(Math.min(startTime, startTimeNew));
                merge.add(Math.max(endTime, endTimeNew));     
            }
            else{
                merge.add(startTimeNew);
                merge.add(endTimeNew);
            }
            ans.add(merge);
            startTime = ans.get(ans.size()-1).get(0);
            endTime = ans.get(ans.size()-1).get(1);
            
        }
        
        int[][] merged = new int[ans.size()][2];
        int i = 0;
        for(List<Integer> merge : ans){
            merged[i][0] = merge.get(0);
            merged[i++][1] = merge.get(1);
        }
        
        return merged;  
    }
}
