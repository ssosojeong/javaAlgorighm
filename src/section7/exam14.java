package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam14 {
    static ArrayList<ArrayList<Integer>> graph;
    static int N, M;
    static int[] chk ,visit;
    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        chk[v] = 1;
        queue.offer(v);
        while(!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv:graph.get(cv)){
                if(chk[nv]==0){
                    chk[nv]=1;
                    queue.offer(nv);
                    visit[nv]=visit[cv]+1;
                }
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

        chk = new int[N+1];
        visit = new int[N+1];

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        BFS(1);
        for(int i=2; i<=N; i++){
            System.out.println(i + " : " + visit[i]);
        }
    }
}
