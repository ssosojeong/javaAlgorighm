package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam6 {
    public static ArrayList<Integer> solution(int N, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<N; i++){
            if(arr[i]!=tmp[i]){
                ans.add(i+1);
            }
        }

        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i : solution(N,arr)){
            System.out.print(i+" ");
        }
    }
}
