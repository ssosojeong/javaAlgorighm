package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4 {
    static int N,M;
    static int[] ans;
    public static void solution(int L){
        if(L==M){
            for(int i:ans){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        else{
            for(int i=1; i<=N; i++){
                ans[L] = i;
                solution(L+1);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ans = new int[M];
        solution(0);
    }
}
