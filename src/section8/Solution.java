package section8;

import java.io.*;

class Solution{
    static int[][] map, visit;
    static int ans, N;
    static int[] di = {1,0,-1,0}, dj = {0,1,0,-1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visit = new int[N][N];
            ans = 0;

            for(int i=0; i<N; i++){
                char[] input = br.readLine().toCharArray();
                for(int j=0; j<N; j++){
                    map[i][j] = input[j]-'0';
                }
            }

            for(int i=0; i<N; i++){
                ans += map[0][i];
                ans += map[i][N-1];
            }


            dfs(0,0,0);

            System.out.printf("#%d %d%n",t,ans);
        }

    }

    public static void dfs(int i, int j, int cost){
        if(cost>=ans) {
            return;
        } else if(i==(N-1) && j==(N-1)){
            ans = cost;
            return;
        } else{
            for(int d=0; d<4; d++){
                int newI = i+di[d];
                int newJ = j+dj[d];

                if(newI>=0&&newI<N&&newJ>=0&&newJ<N&&visit[newI][newJ]==0){
                    visit[newI][newJ] = 1;
                    dfs(newI, newJ, cost+map[newI][newJ]);
                    visit[newI][newJ] = 0;
                }
            }
        }
    }

}