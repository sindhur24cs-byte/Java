import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge e) {
        return this.weight - e.weight;
    }
}

public class Kruskal {
    static int[] parent;

    static int find(int i) {
        if (parent[i] == i)
            return i;
        return find(parent[i]);
    }

    static void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    public static void main(String[] args) {
        int V = 4;

        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        Arrays.sort(edges);

        parent = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        int cost = 0;

        System.out.println("Edges in MST:");
        for (Edge e : edges) {
            if (find(e.src) != find(e.dest)) {
                union(e.src, e.dest);
                System.out.println(e.src + " - " + e.dest + " : " + e.weight);
                cost += e.weight;
            }
        }

        System.out.println("Minimum Cost = " + cost);
    }
}
