package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class exam5 {
    public static int solution(int N, int K, int[] arr){

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 0;
        for(int i : set){
            cnt++;
            if(cnt==K) return i;
        }

        return -1;


    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int[] inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, K, inputs));

    }
}
