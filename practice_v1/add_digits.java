class Solution {
    public int addDigits(int num) {
        
        if(num < 10){
            return num;
        }
        
        int count = 0;
        
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num/10;
            count++;
        }
        
        return count == 1 ? sum : addDigits(sum);
        
    }
}
