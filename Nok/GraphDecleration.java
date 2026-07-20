package Nokia;
import java.util.*;
public class GraphDecleration {
    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);

        boolean[] visited = new boolean[V];

        ArrayList<Integer> start = new ArrayList<>();
        start.add(0);
        visited[0] = true;

        bfs(start, graph, visited);

    }
public static void bfs(ArrayList<Integer> s , ArrayList<ArrayList<Integer>> g, boolean[] v){
    if (s.isEmpty()) {
        return;
    }
    ArrayList<Integer> n=new ArrayList<>();
    for(int node: s){
        System.out.print(node +" ");
       for(int ve: g.get(node)){
         if(!v[ve]){
            v[ve]=true;
            n.add(ve);

         }
       }
    }
    bfs(n,g,v);
}








}
