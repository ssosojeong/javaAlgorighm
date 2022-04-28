package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam5 {
    static int N,M;
    static int[] coins;
    static int ans= 501;
    public static void solution(int L, int sum){
        if(sum>M) return;
        if(L>=ans) return;
        if(sum==M){
            ans = Math.min(L,ans);
        }
        else{
            for(int i=N-1; i>=0; i--){
                solution(L+1,sum+coins[i]);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        coins = new int[N];
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coins);
        M = Integer.parseInt(br.readLine());
        solution(0, 0);
        System.out.println(ans);
    }
}
