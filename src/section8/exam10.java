package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam10 {
    static int[][] chk = new int[7][7];
    static int[][] map = new int[7][7];
    static int[] di = {1,0,-1,0};
    static int[] dj = {0,1,0,-1};
    static int ans = 0;

    public static void solution(int i, int j){
        if(i==6 && j==6){
            ans++;
        } else{
            for(int d=0; d<4; d++){
                int newI = i + di[d];
                int newJ = j + dj[d];

                if(newI>=0 && newI<=6 && newJ>=0 && newJ<=6 && map[newI][newJ]==0){
                    map[newI][newJ] = 1;
                    solution(newI,newJ);
                    map[newI][newJ] = 0;
                }
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

        map[0][0] = 1;
        solution(0,0);
        System.out.println(ans);

    }
}
