package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam11 {
    static int[][] map = new int[7][7];
    static int[] di = {1,0,-1,0};
    static int[] dj = {0,1,0,-1};

    public static void solution(int i, int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for(int d=0; d<4; d++){
                int newI = cur[0] + di[d];
                int newJ = cur[1] + dj[d];

                if(newI>=0&&newI<7&&newJ>=0&&newJ<7&&map[newI][newJ]==0){
                    map[newI][newJ]=map[cur[0]][cur[1]]+1;
                    queue.offer(new int[] {newI,newJ}) ;                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<7; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0,0);
        System.out.println(map[6][6]==0? -1 : map[6][6]);

    }
}
