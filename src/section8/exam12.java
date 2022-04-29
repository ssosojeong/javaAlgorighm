package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam12 {
    static int[][] map;
    static int[] dy = {1,0,-1,0};
    static int[] dx = {0,1,0,-1};
    static int N,M;
    static Queue<int[]> queue = new LinkedList<>();

    public static void solution(){
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int curY = cur[0];
            int curX = cur[1];

            for(int d=0; d<4; d++){
                int newY = curY + dy[d];
                int newX = curX + dx[d];

                if(newY>=0 && newY<M && newX>=0 && newX<N && map[newY][newX]==0){
                    map[newY][newX] = map[curY][curX]+1;
                    queue.offer(new int[] {newY,newX});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[M][N];

        for(int y=0; y<M; y++){
            st = new StringTokenizer(br.readLine()," ");
            for(int x=0; x<N; x++){
                int input = Integer.parseInt(st.nextToken());
                if(input==1){
                    queue.offer(new int[] {y,x});
                }
                map[y][x] = input;
            }
        }

        solution();

        boolean flag = true;
        int ans = -1;
        for(int y=0; y<M; y++){
            for(int x=0; x<N; x++){
                if(map[y][x]==0) flag=false;
                ans = Math.max(ans,map[y][x]);
            }
            if(!flag) break;
        }

        System.out.println(flag ? ans-1 : -1);

    }
}
