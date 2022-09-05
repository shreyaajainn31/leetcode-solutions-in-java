class Solution {
    
    public void dfs(Map<Integer,List<Integer>> map, boolean[] visited, int source){
        
        visited[source] = true;
        if(map.get(source).isEmpty()){
            return;
        }
        for(int neigh : map.get(source)){
            if(!visited[neigh]){
                dfs(map, visited, neigh);
            }
        }
        
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        if(isConnected.length <= 1){
            return isConnected.length;
        }
        
        int totalCities = isConnected.length;
        int connectedCities = 0;
        
        boolean[]visited = new boolean[totalCities+1];
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 1; i<=totalCities; i++){
            map.put(i, new ArrayList<>());
        }
        
        
        for(int i = 0; i<isConnected.length; i++){
            int[]neighbors = isConnected[i];
            for(int j = 0; j<neighbors.length; j++){
                if(neighbors[j] == 1){
                    map.get(i+1).add(j+1);
                }
            }
        }
        
        for(int i = 1; i<= totalCities; i++){
            if(!visited[i]){
                dfs(map, visited, i);
                connectedCities++;
            }
        }
    
        return connectedCities;
    }
}
