import java.util.*;
class GraphBfs
{
     int v;
    LinkedList<Integer>adj[];
    GraphBfs(int a)
    {
        v=a;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    void addEdge(int a,int b)
    {
        adj[a].add(b);
        adj[b].add(a);
    }
   /*void display()
    {
        for(LinkedList x:adj)
        {
            System.out.println(x);
        }
    }
    void BFS(int src)
    {
        Queue<Integer>al=new LinkedList<>();
        boolean vis[]=new boolean[v];
        al.add(src);
        vis[src]=true;
        while(!al.isEmpty())
        {
            int t=al.poll();
            System.out.println(t);
            for(int i=0;i<adj[t].size();i++)
            {
                int x=adj[t].get(i);
                if(vis[x]!=true)
                {
                    vis[x]=true;
                    al.add(x);
                }
            }
        }
    }*/
    void Dfs(int s,boolean[]vis)
    {
      System.out.println(s);
      vis[s]=true;
      for(int i=0;i<adj[s].size();i++)
      {
          int x=adj[s].get(i);
          if(vis[x]!=true)
          {
              Dfs(x,vis);
              vis[x]=true;
          }
      }
    }
    public static void main(String s[])
    {
        GraphBfs g=new GraphBfs(8);
        g.addEdge(7,6);
        g.addEdge(7,4);
        g.addEdge(7,5);
        g.addEdge(6,1);
        g.addEdge(6,2);
        g.addEdge(1,0);
        g.addEdge(4,3);
        g.addEdge(4,5);
       

      //  g.BFS(0);
      boolean vis[]=new boolean[8];
      g.Dfs(7,vis);
    }
}
