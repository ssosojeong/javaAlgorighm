package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge>{
    int vex;
    int cost;
    public Edge(int v, int c){
        this.vex = v;
        this.cost = c;
    }

    @Override
    public int compareTo(Edge o){
        return this.cost-o.cost;
    }
}

public class exam5 {
    static int N, M;
    static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    static int[] dis;

    public static void solution(int v){
        PriorityQueue<Edge> pQueue = new PriorityQueue<>();
        pQueue.offer(new Edge(v,0));
        dis[v] = 0;
        while(!pQueue.isEmpty()){
            Edge tmp = pQueue.poll();
            int nowV = tmp.vex;
            int nowC = tmp.cost;
            if(nowC>dis[nowV]) continue;
            for(Edge e : graph.get(nowV)){
                if(dis[e.vex]>nowC+e.cost){
                    dis[e.vex] = nowC+e.cost;
                    pQueue.offer(new Edge(e.vex,nowC+e.cost));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        dis = new int[N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b,c));
        }
        solution(1);

    }
}
