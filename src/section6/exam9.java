package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam9 {
    public static int check(int mid, int[] arr){
        int sum = 0;
        int cnt = 1;

        for(int i:arr){
            if(sum+i>mid){
                cnt++;
                sum = 0;
            }
            sum += i;
        }

        return cnt;
    }
    public static int solution(int N, int M, int[] arr){
        int ans = -1;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(check(mid,arr)<=M) {
                ans = mid;
                rt=mid-1;
            }
            else lt=mid+1;
        }

        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, M, arr));
    }
}
