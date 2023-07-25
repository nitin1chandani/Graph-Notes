import java.util.*;

public class L3Weighted {

    // this is for adj list
    static class Pair {
        int E;
        int W;

        Pair(int e, int w) {
            this.E = e;
            this.W = w;
        }
    }

    public static void adjMatrix(int matrix[][], int m, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            matrix[u][v] = weight;
            matrix[v][u] = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // adj matrix
        int matrix[][] = new int[m + 1][m + 1];
        // adjMatrix(matrix, m, n);

        // Adjacency list
        ArrayList<Pair> list[] = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            list[i] = new ArrayList();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            list[u].add(new Pair(v, weight));
            list[v].add(new Pair(u, weight));
        }

    }
}
