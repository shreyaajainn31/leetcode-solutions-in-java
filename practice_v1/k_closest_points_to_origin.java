class Solution {
    
    public int distance(int[]points){
        return points[0] * points[0] + points[1] * points[1];
    }
    
    public int[][] kClosest(int[][] points, int k) {
        
        Arrays.sort(points, (a,b) -> distance(a) - distance(b));
        
        int[][]ans = new int[k][2];
       
        for(int i = 0; i<k; i++){
            ans[i][0] = points[i][0];
            ans[i][1] = points[i][1];
        }
        
        return ans;
    }
    
    
}
