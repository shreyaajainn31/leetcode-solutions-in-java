class OrderedStream {
    
    int n;
    String[]stream;
    int ptr;
    public OrderedStream(int n) {
        this.n = n;
        stream = new String[n];
        ptr = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String>ans = new ArrayList<>();
        
        stream[idKey-1] = value;
        
        //System.out.println(Arrays.toString(stream));
        while(ptr < stream.length && stream[ptr] != null){
            ans.add(stream[ptr++]);
        }
        
        return ans;
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
