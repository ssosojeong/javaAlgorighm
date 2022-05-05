package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int v;
    int cost;
    public Node(int v, int cost){
        this.v =v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o){
        return this.cost-o.cost;
    }

}

public class exam10_prim {
    static ArrayList<ArrayList<Node>> graph;
    static int[] chk;

    public static int solution(){
        int ans = 0;
        PriorityQueue<Node> pQueue = new PriorityQueue<>();
        pQueue.offer(new Node(1,0));
        while(!pQueue.isEmpty()){
            Node tmp = pQueue.poll();
            if(chk[tmp.v]==0){
                chk[tmp.v]=1;
                ans += tmp.cost;
                for(Node n:graph.get(tmp.v)){
                    if(chk[n.v]==0){
                        pQueue.offer(n);
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        chk = new int[V+1];
        for(int i=0; i<=V; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            graph.get(A).add(new Node(B,C));
            graph.get(B).add(new Node(A,C));
        }


        System.out.println(solution());
    }


}
