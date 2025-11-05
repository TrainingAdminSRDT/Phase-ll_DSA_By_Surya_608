import java.util.*;
public class has_path {
    static class Edge
    {
        int src;int dest;int weight;
        Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }
    }
    public static boolean has(ArrayList<Edge>graph[],int src,int dest,boolean vis[])
    {
        if(src==dest)
        {
            return true;
           
        }
         vis[src]=true;
         for(int i=0;i<graph[src].size();i++)
         {
            Edge e=graph[src].get(i);
            if(!vis[e.dest]&&has(graph, e.dest, dest, vis))
            {
                return true;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        int v=5;boolean vis[]=new boolean[5];
        ArrayList<Edge>graph[]=new ArrayList[v];
        for(int i=0;i<v;i++)
    {
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
        System.out.println(has(graph,0,5,vis));
    }
}
