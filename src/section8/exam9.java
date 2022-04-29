package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam9 {
    static int N, M;
    static int[] ans;

    public static void solution(int L, int last){
        if(L==M){
            for(int i:ans) System.out.print(i + " ");
            System.out.println();
        } else{
            for(int i=last; i<=N; i++){
                ans[L]=i;
                solution(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ans = new int[M];

        solution(0,1);
    }
}
