package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam8 {
    static int N, F;
    static int[][] memo = new int[11][11];
    static int[] chk, ans, coef;
    static boolean flag=false;

    static int combi(int n, int r){
        if(memo[n][r]!=0) return memo[n][r];
        if(n==r || r==0) return 1;
        else return memo[n][r] = combi(n-1,r-1) + combi(n-1, r);
    }

    static void solution(int L, int sum){
        if(sum>F) return;
        if(L==N && sum==F){
            flag=true;
            for(int i:ans) System.out.print(i+" ");
            return;
        } else{
            for(int i=1; i<=N; i++){
                if(chk[i]==0){
                    chk[i] = 1;
                    ans[L] = i;
                    solution(L+1, sum+(i*coef[L]));
                    if(flag) return;
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());

        chk = new int[N+1];
        ans = new int[N];
        coef = new int[N];

        for(int i=0; i<N; i++){
            coef[i] = combi(N-1,i);
        }

        solution(0,0);

    }
}
