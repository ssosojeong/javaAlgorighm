package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam3 {
    public static int DFS(int N){
        if(N==1){
            return 1;
        }
        return N*DFS(N-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(DFS(N));
    }
}
