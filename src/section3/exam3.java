package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3 {
    public static int solution(int N, int[] arr, int K){

        int sum = 0;

        for(int i=0; i<K; i++){
            sum += arr[i];
        }

        int max = sum;

        for(int i=K; i<N; i++){
            sum += (arr[i]-arr[i-K]);
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(solution(N,arr,K));


    }
}
