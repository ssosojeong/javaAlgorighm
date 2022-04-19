package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam4 {
    public static int solution(int N, int[] arr, int K){

        int lt=0, ans=0, sum=0;

        for(int rt = 0; rt<N; rt++){
            sum += arr[rt];
            if(sum==K) ans++;
            while(sum>=K){
                sum-=arr[lt++];
                if(sum==K) ans++;
            }
        }



        return ans;
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

