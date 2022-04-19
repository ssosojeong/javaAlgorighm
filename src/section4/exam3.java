package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class exam3 {
    public static String solution(int N, int K, int[] arr){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<K-1; i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }


        int lt=0;
        for(int rt=K-1; rt<N; rt++){
            hashMap.put(arr[rt],hashMap.getOrDefault(arr[rt],0)+1);
            sb.append(hashMap.size()).append(" ");
            if(hashMap.get(arr[lt])==1){
                hashMap.remove(arr[lt]);
            } else{
                hashMap.put(arr[lt],hashMap.get(arr[lt])-1);
            }
            lt++;
        }

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        int[] input = new int[N];
        for(int i=0; i<N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,K, input));

    }
}
