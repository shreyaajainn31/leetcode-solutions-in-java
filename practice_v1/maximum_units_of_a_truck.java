class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> b[1]- a[1]);
        
        int maxUnitCount = 0;
        
        for(int [] box : boxTypes){
            
            int numberOfUnit = box[0];
            int size = box[1];
            
            if(truckSize > 0){
                while(numberOfUnit > 0 && truckSize > 0){
                    maxUnitCount += size;
                    numberOfUnit--;
                    truckSize--;
                }
            }
            
        }
         
        return maxUnitCount;
    }
}
