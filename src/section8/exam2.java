package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam2 {
    static int[] inputs;
    static int C,N;
    static int ans =-1;
    public static void solution(int idx, int sum){
        if(sum>C) return;
        if(idx==N){
            ans = Math.max(ans,sum);
        }
        else{
            solution(idx+1, sum+inputs[idx]);
            solution(idx+1, sum);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i]=Integer.parseInt(br.readLine());
        }

        solution(0,0);
        System.out.println(ans);
    }
}
