import java.util.*;


//    Breadth First Search is used to explore nodes and edges of a graph. It runs with a time complexity of O(V+E) and is often used
//    as a building block in other algorithms.

//    The BFS algorithm is particularly useful for one thing: finding the shortest path on unweighted graphs.
//    In weighted graphs, each edge ( or vertex) of G is assigned a numerical value , or weigh.
//    The edges of a road network graph might be weighted with their length, drive-time or speed limit.
//    In unweighted graphs, there is no cost distinction between various edges and vertices.

//    Depth-First Search vs Breadth-First Search Difference
//    https://miro.medium.com/v2/resize:fit:1400/1*VM84VPcCQe0gSy44l9S5yA.jpeg

//    BSF starts at arbitrary node of a graph and explores the neighbour nodes first, before moving to the next level neighbours.

    // BSF algorithm uses a queue data structure to track which node to visit next. 
    // Upon reaching a new node algorithm add is to the queue to visit later.


     
    class BreadthFirstSearch
    {
        // Perform BFS on the graph starting from vertex `v`
        public static void BFS(Graph graph, int v, boolean[] discovered)
        {
            // create a queue for doing BFS
            Queue<Integer> q = new ArrayDeque<>();
     
            // mark the source vertex as discovered
            discovered[v] = true;
     
            // enqueue source vertex
            q.add(v);
     
            // loop till queue is empty
            while (!q.isEmpty())
            {
                // dequeue front node and print it
                v = q.poll();
                System.out.print(v + " ");
     
                // do for every edge (v, u)
                for (int u: graph.adjList.get(v))
                {
                    if (!discovered[u])
                    {
                        // mark it as discovered and enqueue it
                        discovered[u] = true;
                        q.add(u);
                    }
                }
            }
        }
     
        public static void main(String[] args)
        {
            // List of graph edges as per the above diagram
            List<Edge> edges = Arrays.asList(           

                    new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                    new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                    new Edge(4, 8), new Edge(7, 11), new Edge(7, 12)
                    // vertex 0, 13, and 14 are single nodes
            );
     
            // total number of nodes in the graph (labelled from 0 to 14)
            int n = 13;
     
            // build a graph from the given edges
            // Grap    
            // https://www.techiedelight.com/wp-content/uploads/2016/11/Breadth-first-tree.svg_.png
            Graph graph = new Graph(edges, n);
     
            // to keep track of whether a vertex is discovered or not
            boolean[] discovered = new boolean[n];
     
            // Perform BFS traversal from all undiscovered nodes to
            // cover all connected components of a graph
            for (int i = 4; i < 5; i++)
            {
                if (discovered[i] == false)
                {
                    // start BFS traversal from vertex `i`
                    BFS(graph, i, discovered);
                }
            }
        }
    }
    
    class Edge
    {
        int source, dest;
     
        public Edge(int source, int dest)
        {
            this.source = source;
            this.dest = dest;
        }
    }
     
    // A class to represent a graph object
    class Graph
    {
        // A list of lists to represent an adjacency list
        List<List<Integer>> adjList = null;
     
        // Constructor
        Graph(List<Edge> edges, int n)
        {
            adjList = new ArrayList<>();
     
            for (int i = 0; i < n; i++) {
                adjList.add(new ArrayList<>());
            }
     
            // add edges to the undirected graph
            for (Edge edge: edges)
            {
                int src = edge.source;
                int dest = edge.dest;
     
                adjList.get(src).add(dest);
                adjList.get(dest).add(src);
            }
        }
    }
    

