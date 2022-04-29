package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam13 {
    static int[][] map;
    static int[] di = {-1,1,0,0,-1,-1,1,1};
    static int[] dj = {0,0,-1,1,-1,1,-1,1};
    static int N, ans=0;

    public static void DFS(int i, int j){
        for(int d=0; d<8; d++){
            int newI = i+di[d];
            int newJ = j+dj[d];

            if(newI>=0 && newI<N && newJ>=0 && newJ<N && map[newI][newJ]==1){
                map[newI][newJ]=0;
                DFS(newI,newJ);
            }
        }
    }

    public static void solution(int[][] map){
        for(int i=0;i<N;i++){
            for(int j=0; j<N;j++){
                if(map[i][j]==1){
                    ans++;
                    map[i][j]=0;
                    DFS(i,j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        StringTokenizer st;
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(map);
        System.out.println(ans);
    }
}
