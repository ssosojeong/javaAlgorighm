package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam2 {
    static int[] dy;
    public static int solution(int N){
        dy[0] = 1;
        dy[1] = 2;

        for(int i=2; i<=N; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }

        return dy[N];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dy = new int[N+1];
        System.out.println(solution(N));

    }
}