class Solution {
    
    public StringBuilder removeParanthesis(String s, char open, char close){
       
        int balance = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            
            if(c != '(' && c != ')'){
                sb.append(c);
            }
            else{
                
                if(c == open){
                    balance++;
                }
                else{
                    if(balance == 0){
                        continue;
                    }
                    balance--;
                }
                
                if(balance>=0){
                    sb.append(c);
                }
            }
            
            
        }
        
        return sb;
        
    }
    
    public String minRemoveToMakeValid(String s) {
        
        if(s.length() == 0){
            return s;
        }
        
        StringBuilder s1 = removeParanthesis(s, '(', ')');
        System.out.println(s1);
        StringBuilder ans = removeParanthesis(s1.reverse().toString(), ')', '(');
        
        
        
        return ans.reverse().toString();
    }
}
