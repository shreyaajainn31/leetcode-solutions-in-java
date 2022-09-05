class Solution {
    public void dfs(Map<Integer,List<Integer>> adj, Set<Integer> visited, int source){
        visited.add(source);
        if(adj.get(source).isEmpty()){
            return;
        }

        for(int neigh: adj.get(source)){
            if(!visited.contains(neigh)){
                dfs(adj, visited, neigh);
            }
        }

    }
    public int countComponents(int n, int[][] edges) {
        
        if(edges.length == 0){
            return n;
        }
        
        Map<Integer,List<Integer>> adj = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            adj.put(i, new ArrayList<>());
        }
        
        for(int [] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        Set<Integer> visited = new HashSet<>();
        int connectedComponents = 0;
        for(int i = 0; i<n; i++){
            if(!visited.contains(i)){
                connectedComponents++;
                dfs(adj, visited, i);
            }
        }
        
        return connectedComponents;
    }
}
