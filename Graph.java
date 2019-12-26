import java.util.*;
class Graph
{
    int v;
    LinkedList<Integer>adj[];
    Graph(int a)
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
    void display()
    {
        for(LinkedList x:adj)
        {
            System.out.println(x);
        }
    }
    public static void main(String s[])
    {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.display();
    }
}