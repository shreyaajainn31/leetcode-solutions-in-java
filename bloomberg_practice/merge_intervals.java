class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1){
            return intervals;
        }
        
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        int startTime = intervals[0][0];
        int endTime = intervals[0][1];
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> interval = new ArrayList<>();
        
        interval.add(startTime);
        interval.add(endTime);
        ans.add(interval);
        for(int i = 1; i<intervals.length; i++){
            int startTimeNew = intervals[i][0];
            int endTimeNew = intervals[i][1];
            interval = new ArrayList<>();
            if(startTimeNew <= endTime){
                //Merge
                ans.remove(ans.size()-1);
                startTime = Math.min(startTime, startTimeNew);
                endTime = Math.max(endTime, endTimeNew);
                 interval.add(startTime);
                interval.add(endTime);
            }
            else{
                interval.add(startTimeNew);
                interval.add(endTimeNew);
                startTime = startTimeNew;
                endTime = endTimeNew;
            }
            
            
            ans.add(interval);
        }
        
        int[][] merged = new int[ans.size()][2];
        
        for(int i =0; i<ans.size(); i++){
            merged[i][0] = ans.get(i).get(0);
            merged[i][1] = ans.get(i).get(1);
        }
        
        
        return merged;
        
    }
}
