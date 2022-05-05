package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3 {
    public static int solution(int[] arr){
        int ans = 0;
        int[] dy = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && dy[j]>max){
                    max = dy[j];
                }
            }
            dy[i] = max+1;
            ans = Math.max(dy[i],ans);
        }

        return ans;



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(arr));


    }
}
