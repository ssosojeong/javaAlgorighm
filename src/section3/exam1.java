package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam1 {
    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        int p1=0, p2=0;
        while(p1<N && p2<M){
            if(arr1[p1]<arr2[p2]){
                ans.add(arr1[p1++]);
            } else{
                ans.add(arr2[p2++]);
            }
        }
        while(p1<N){
            ans.add(arr1[p1++]);
        }
        while(p2<M){
            ans.add(arr2[p2++]);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i:solution(N, M, arr1, arr2)){
            System.out.print(i + " ");
        }


    }
}
