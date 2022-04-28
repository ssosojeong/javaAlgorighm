package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam8 {
    static int N,F;
    static int[] chk, arr=new int[56];
    public static int solution(int L){
        if(L==N) {
            for(int i=0; i<N-1; i++){
                int[] tmp = new int[3];
                for(int j=0; j<N-1-i; j++){
                    int a = arr[j] + arr[j+1];
                }
            }
        }
        else{
            for(int i=1; i<=N; i++){
                chk[i] = 1;
                arr[L] = i;
                solution(L+1);
                chk[i] = 0;
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());

        chk = new int[N+1];

    }
}
