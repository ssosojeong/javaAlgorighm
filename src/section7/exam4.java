package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam4 {
    static int[] fibo;

    public static int DFS(int N){
        if(fibo[N]>0) return fibo[N];
        if(N==1) return fibo[N]=1;
        else if(N==2) return fibo[N]=1;
        else return fibo[N]=DFS(N-2)+DFS(N-1);


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        fibo = new int[N+1];
        DFS(N);
        for(int i=1; i<=N; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}
