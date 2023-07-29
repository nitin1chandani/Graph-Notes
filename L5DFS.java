
//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class sol {
    public static void main(String[] args) throws IOException {
        System.out.println("dfs");
    }
}

// Approach -> 1. make vis array so that we don't traverse one node or any node
// again and again.
// 2. this dfs will be done recursively, as choice tree is made like recursion
// 3. add src node to the list
// 4. then visit that node
// 5. then travese to the neighbours of that node and for each node call dfs and
// visit them if they are not visited.
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, adj, vis, list);
        return list;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> list) {
        list.add(node);
        vis[node] = true;
        for (int element : adj.get(node)) {
            if (!vis[element]) {
                dfs(element, adj, vis, list);
            }
        }
    }
}