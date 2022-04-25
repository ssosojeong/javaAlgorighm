package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam4 {
    public static int DFS(int N){
        if(N==1) {
            return 1;
        }
        else if(N==2){
            return 1;
        }
        else return DFS(N-2) + DFS(N-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            System.out.print(DFS(i) + " ");
        }
    }
}
