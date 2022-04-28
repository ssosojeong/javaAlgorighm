package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam12_13 {
    static ArrayList<ArrayList<Integer>> graph;
    static int N, M, ans=0;
    static int[] visit;
    public static void DFS(int start){
        if(start == N){
            ans++;
        }

        for(int node:graph.get(start)){
            if(visit[node]==0){
                visit[node]=1;
                DFS(node);
                visit[node]=0;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for(int i=0; i<N+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        visit = new int[N+1];

        visit[1] = 1;
        DFS(1);

        System.out.println(ans);
    }
}
