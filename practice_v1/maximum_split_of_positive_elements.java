class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        
        List<Long> list = new ArrayList<>();
        
        if(finalSum % 2 != 0){
            return list;
        }
        
        long evenNum = 2; 
        long sum = 0;
       
        while(sum + evenNum <= finalSum){
           sum += evenNum;
           list.add(evenNum);
           evenNum+=2;
        }
        
        if(sum < finalSum){
            long lastEvenNum = list.remove(list.size() - 1);
            lastEvenNum += finalSum - sum;
            list.add(lastEvenNum);
        }
        
        return list;
        
    }
}
