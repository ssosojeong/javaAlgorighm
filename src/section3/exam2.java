package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam2 {
    public static ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1=0, p2=0;
        while(p1<N && p2<M){
            if(arr1[p1]==arr2[p2]){
                ans.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1]<arr2[p2]) p1++;
            else p2++;
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
