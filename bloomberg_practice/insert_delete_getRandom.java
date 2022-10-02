class RandomizedSet {

    List<Integer> list;
    Set<Integer> set;
    Random random;
    public RandomizedSet() {
        list = new ArrayList<>();
        set = new HashSet<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        
        if(!set.contains(val)){
            list.add(val);
            set.add(val);
            return true;
        }
        else{
            
            return false;
        }
        
    }
    
    public boolean remove(int val) {
        if(!set.contains(val)){
            return false;
        }
        else{
            set.remove(val);
            int indexOf = list.indexOf(val);
            list.remove(indexOf);
            return true;
        }
    }
    
    public int getRandom() {
        int ind = random.nextInt(list.size());
        return list.get(ind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
