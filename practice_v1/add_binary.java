class Solution {
    public String addBinary(String a, String b) {
        
        if(a.length()== 0){
            return b;
        }
        if(b.length()== 0){
            return a;
        }
        
        int carry = 0;
        
        int i =a.length()-1, j = b.length()-1;
        StringBuilder ans = new StringBuilder();
        while(i >=0 || j >=0){
            
            int n1 = i >=0 ?  a.charAt(i) - '0' : 0;
            int n2 = j >=0 ? b.charAt(j) - '0' : 0;
            
            int sum = n1 + n2 + carry;
            carry = sum / 2;
            ans.append(sum%2);
            i--;
            j--;
        }
        
        if(carry %2 == 1){
            ans.append('1');
        }
       
       
        return ans.reverse().toString();
        
        
    }
}
