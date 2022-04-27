package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam8 {
    static int ans = 0;
    static int[] move = {1, -1, 5};
    static int[] chk;

    public static int BFS(int S, int E){
        Queue<Integer> queue = new LinkedList<>();
        chk = new int[1001];
        chk[S]=1;
        int L = 0;
        queue.offer(S);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int cur = queue.poll();
                for(int d=0; d<3; d++){
                    int nx = cur+move[d];
                    if(cur==E) return L+1;
                    if(nx>=1 && nx<=10001 && chk[nx]==0){
                        chk[nx]=1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }

        return L;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.println(BFS(S,E));

    }
}
