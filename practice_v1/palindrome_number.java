class Solution {
    public boolean isPalindrome(int x) {
        
        List<Integer> digits = new ArrayList<>();
        if(x < 0){
            return false;
        }
        while(x > 0){
            digits.add(x%10);
            x = x/10;
        }
        
        int i =0, j = digits.size()-1;
        
        while(i<=j){
            if(digits.get(i) != digits.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
