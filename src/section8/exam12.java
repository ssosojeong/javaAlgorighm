package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam12 {
    static int[][] map;
    static int[] di = {1,0,-1,0};
    static int[] dj = {0,1,0,-1};
    static int N,M;
    static Queue<int[]> queue = new LinkedList<>();

    public static void solution(){
        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for(int d=0; d<4; d++){
                int newI = cur[0] + di[d];
                int newJ = cur[1] + dj[d];

                if(newI>=0&&newI<N&&newJ>=0&&newJ<M&&map[newI][newJ]==0){
                    queue.offer(new int[] {newI,newJ});
                    map[newI][newJ] = map[cur[0]][cur[1]]+1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                int input = Integer.parseInt(st.nextToken());
                if(input==1){
                    queue.offer(new int[] {i,j});
                }
                map[i][j] = input;
            }
        }

        solution();

        boolean flag = true;
        int ans = -1;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0) {
                    flag = false;
                    break;
                } else{
                    ans = Math.max(ans, map[i][j]);
                }
            }
            if(!flag) break;
        }
        System.out.println(flag?ans-1:-1);


    }
}
