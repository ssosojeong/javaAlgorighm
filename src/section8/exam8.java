package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam8 {
    static int N, F;
    static int[][] combination = new int[11][11];
    static int[] coef, ans, chk;

    public static int combi(int n, int r){
        if(combination[n][r]!=0) return combination[n][r];
        if(n==r || r==0) return 1;
        else return combination[n][r]=combi(n-1,r-1) + combi(n-1,r);
    }

    public static void DFS(int L, int start){
        if(L==N){
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        } else{
            for(int i=start; i<=N; i++){

            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());

        coef = new int[N];
        ans = new int[N];
        chk = new int[N+1];

        //이항계수 구하기
        for(int i=0; i<N; i++){
            coef[i] = combi(N-1,i);
        }

        DFS(0,1);
    }
}
