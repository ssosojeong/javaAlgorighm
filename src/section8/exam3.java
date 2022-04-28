package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam3 {
    static int[] score, time;
    static int N,M;
    static int ans =-1;
    public static void solution(int idx, int tScore, int tTime){
        if(tTime>M) return;
        if(idx==N){
            ans = Math.max(ans,tScore);
        }
        else{
            solution(idx+1, tScore+score[idx], tTime+time[idx]);
            solution(idx+1,tScore,tTime);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        score = new int[N];
        time = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            score[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());

        }
        solution(0,0,0);

        System.out.println(ans);
    }
}
