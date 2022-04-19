package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam6 {
    public static int solution(int N, int K, int[] arr){

        int lt=0, ans=0, cnt=0;

        for(int rt = 0; rt<N; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>K){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            ans = Math.max(ans, rt-lt+1);

        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        int[] inputs = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,K,inputs));


    }
}
