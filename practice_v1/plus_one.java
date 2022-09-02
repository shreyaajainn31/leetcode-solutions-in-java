class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits.length == 0){
            return digits;
        }
        
        List<Integer> list = new ArrayList<>();
        
        int digit = digits[digits.length-1];
        int carry = 0;
        digit += 1;
        
        carry = digit/10;
        list.add(digit%10);
        for(int i = digits.length-2; i>=0; i--){
            int d = digits[i] + carry;
            list.add(d%10);
            carry = d / 10;
        }
        
        if(carry == 1){
            list.add(carry);
        }
       
        Collections.reverse(list);
        
        int[]ans = new int[list.size()];
       
        for(int i = 0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        
        return ans;
    }
}
