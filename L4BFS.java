// BFS : Breadth first Search is like level order traversal. here we go one step at each node;

//Approach 
//1. visit array : in graph their is no null or no end so we have to maintain this array 
//so that we do not visit one node again and again

//2. queue : queue is imp too bcz we want to add neighbors of each node, so we make queue
//3. until the q is not empty
//4. remove front and add its neighbours if they are not visited 
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int val = q.poll();
            list.add(val);
            for (int i : adj.get(val)) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return list;
    }
}