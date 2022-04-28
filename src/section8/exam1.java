package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam1 {
    static int[] inputs;
    static int N, total=0;
    static String ans ="NO";
    static boolean flag = false;
    public static void solution(int L, int sum){
        if(flag) return;
        if(sum>total/2) return;
        if(L==N){
            if(total-sum==sum) {
                ans="YES";
                flag = true;
            }
        }
        else{
            solution(L+1, sum+inputs[L]);
            solution(L+1,sum);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i]=Integer.parseInt(st.nextToken());
            total+=inputs[i];
        }

        solution(0,0);
        System.out.println(ans);
    }
}
