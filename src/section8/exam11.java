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
        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int q=0; q<len; q++){
                int[] cur = queue.poll();
                int curI = cur[0];
                int curJ = cur[1];
                map[curI][curJ] = L;

                for(int d=0; d<4; d++){
                    int newI = curI + di[d];
                    int newJ = curJ + dj[d];

                    if(newI>=0 && newI<=6 && newJ>=0 && newJ<=6 && map[newI][newJ]==0){
                        queue.offer(new int[] {newI,newJ});
                        map[newI][newJ] = L+1;
                    }
                }
            }
            L++;
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
