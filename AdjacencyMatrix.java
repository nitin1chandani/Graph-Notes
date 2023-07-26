
// Adjacency Matrix : way of representing graph
// here the space complexity if O(m*m) where m is number of nodes which is very costly that's why we use adj list
import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // no. of nodes
        int n = sc.nextInt(); // no. of edges
        // if number of nodes are 5 then initialize it as m+1, m+1(m = no. of nodes)
        int matrix[][] = new int[m + 1][m + 1];
        for (int i = 0; i < n; i++) { // no. of edges will be the input that's why it will take n
            int u = sc.nextInt();
            int v = sc.nextInt();
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        // TC to store the graph - O(n)
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
