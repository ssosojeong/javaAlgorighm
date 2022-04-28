package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam7 {
    static int N,R;
    static int[][] arr;
    public static int solution(int n, int r){
        if(arr[n][r]!=0) return arr[n][r];

        if(r==0 || n==r){
            arr[n][r] = 1;
            return n;
        }
        else{
            arr[n][r] = solution(n-1, r-1) + solution(n-1,r);
            return arr[n][r];
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N+1][R+1];

        System.out.println(solution(N,R));
    }
}
