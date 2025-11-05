import java.util.*;
public class DFS {
    static class Edge
    {
        int src;
        int dest;int weight;
        Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void DFS_traversal(ArrayList<Edge>graph[],int curr,boolean vis[])
    {
        System.out.println(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
            DFS_traversal(graph, e.dest, vis);
        }}
    }
    public static void main(String[] args) {
        int v=5; boolean vis[]=new boolean[v];
        ArrayList<Edge>graph[]=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
         graph[0].add(new Edge(0, 1, 5));
 graph[1].add(new Edge(1, 2, 2));
  graph[1].add(new Edge(1, 3, 3)); graph[2].add(new Edge(2, 1, 2));
    graph[2].add(new Edge(2, 3, 1));
     graph[2].add(new Edge(2, 4, 2));
      graph[3].add(new Edge(3, 1, 3));
       graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 2));
        DFS_traversal(graph,0,vis);
    }
    
}
