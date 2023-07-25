
// Adjacency List : It is also a way of representing but it is not costly as Adj matrix
// Space complexity : O(2E)
import java.util.*;

public class L2AdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // no. of nodes
        int n = sc.nextInt(); // no. of edges

        ArrayList<Integer> list[] = new ArrayList[m + 1];
        for (int i = 0; i < m + 1; i++) {
            list[i] = new ArrayList<>(); // Initializing all the ArrayList at every index of array
        }
        for (int i = 0; i < n + 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        // Input
        // 5 5
        // 1 2
        // 1 3
        // 3 4
        // 2 4
        // 2 5
        // 4 5

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " ");
            }
            System.out.println();
        }
        // Output
        // 2 3
        // 1 4 5
        // 1 4
        // 3 2 5
        // 2 4
    }
}
