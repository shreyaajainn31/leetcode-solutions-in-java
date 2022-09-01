class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums.length == 0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            // Two sum.
            for(int j = i + 1; j<nums.length; j++){
                int target = 0 - nums[i] - nums[j]; 
                if(map.containsKey(target) && map.get(target) != i && map.get(target) != j){
                    List<Integer> triplets = new ArrayList<>();
                    if(!set.contains(triplets)){
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(target);
                        Collections.sort(triplets);
                        set.add(triplets);
                    }
                    
                }
            }
            
        }
        
        list.addAll(set);
        return list;
    }
}
