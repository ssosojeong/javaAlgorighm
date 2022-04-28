package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam6 {
    static int N,M;
    static int[] inputs, arr;
    static boolean[] chk;
    static int ans= 501;
    public static void solution(int L){
        if(L==M){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
            for(int i=0; i<N; i++){
                if(!chk[i]){
                    chk[i] = true;
                    arr[L] = inputs[i];
                    solution(L+1);
                    chk[i] = false;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        chk = new boolean[N];
        arr = new int[M];
        solution(0);
    }
}
