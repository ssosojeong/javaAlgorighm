package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam6_DFS {
    static boolean[] pos, chk;
    static ArrayList<ArrayList<Integer>> graph;
    static int N,M;

    public static void DFS(int v){
        for(int f : graph.get(v)){
            if(!chk[f]){
                chk[f] = true;
                pos[f] = true;
                DFS(f);
                chk[f] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        pos = new boolean[N+1];
        chk = new boolean[N+1];

        st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        DFS(a);
        if(pos[b]) System.out.println("YES");
        else System.out.println("NO");

    }
}
