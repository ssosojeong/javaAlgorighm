package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Street implements Comparable<Street>{
    int v1;
    int v2;
    int cost;
    public Street(int v1, int v2, int cost){
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Street o){
        return this.cost-o.cost;
    }

}

public class exam10_kruskal {
    static int[] unf;
    static ArrayList<Street> graph;
    static int V,E;
    static int ans = 0;

    public static int Find(int v){
        if(unf[v]==v) return v;
        else return unf[v]=Find(unf[v]);
    }

    public static void Union(Street s){
        int fa = Find(s.v1);
        int fb = Find(s.v2);
        if(fa==fb) return;
        else {
            unf[fa]=fb;
            ans += s.cost;
        }
    }

    public static int solution(){
        for(Street s : graph){
            Union(s);
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        unf = new int[V+1];
        graph = new ArrayList<>();
        for(int i=1; i<=V; i++){
            unf[i] = i;
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph.add(new Street(A,B,C));
        }

        Collections.sort(graph);

        System.out.println(solution());
    }


}
