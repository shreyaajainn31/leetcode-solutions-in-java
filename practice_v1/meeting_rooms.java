class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        if(intervals.length <=1){
            return true;
        }
        
        Arrays.sort(intervals, 
                    (a, b) -> (a[0] - b[0]));
        
        int prevEndTime = intervals[0][1];
        int count = 1;
        
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] >= prevEndTime){
                count++;
            }
           
            prevEndTime = intervals[i][1];
        }
        
        return count == intervals.length;
    
    }
}
