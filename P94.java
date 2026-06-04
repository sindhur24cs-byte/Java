// Kruskal's Algorithm in Java

import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

public class KruskalMST {

    static int[] parent;

    static int find(int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent[i]);
    }

    static void union(int x, int y) {
        int xset = find(x);
        int yset = find(y);
        parent[xset] = yset;
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

        System.out.println("Edges in Minimum Spanning Tree:");

        int count = 0;
        int i = 0;

        while (count < V - 1) {
            Edge next = edges[i++];

            int x = find(next.src);
            int y = find(next.dest);

            if (x != y) {
                System.out.println(
                    next.src + " - " + next.dest + " : " + next.weight);
                union(x, y);
                count++;
            }
        }
    }
}
