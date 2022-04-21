package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam4 {
    public static int[] solution(int S, int N, int[] arr){

        int[] cache = new int[S];

        for(int work : arr){
            int pos = S-1;
            //겹치는게 있는지 검사
            for(int i=0; i<S; i++){
                if(cache[i]==i){
                    pos=i;
                }
            }
            //복붙하기
            //미스일 경우 pos는 S-1이므로 무조건 모든 작업을 하나씩 당김
            //히트일 경우 pos는 히트난 작업이 발견된 위치이므로 거기서부터 하나씩 당김
            for(int i=pos; i>0; i--){
                cache[i] = cache[i-1];
            }
            cache[0] = work;
        }

        return cache;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i:solution(S, N, arr)){
            System.out.print(i + " ");
        }
    }
}
