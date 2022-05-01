package section8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class exam14 {
    static int N, M, ans= Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<int[]> house, pizza;

    public static void DFS(int L, int start){
        if(L==M){
            int sum = 0;
            for(int[] h:house){
                int dis = Integer.MAX_VALUE;
                for(int i: combi){
                    int[] p = pizza.get(i);
                    dis = Math.min(dis, Math.abs(h[0]-p[0])+Math.abs(h[1]-p[1]));
                }
                sum+=dis;
            }
            ans = Math.min(ans,sum);
        } else{
            for(int i = start; i<pizza.size(); i++){
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        house = new ArrayList<>();
        pizza = new ArrayList<>();
        combi = new int[M];

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                int tar = Integer.parseInt(st.nextToken());
                if(tar==1){
                    house.add(new int[] {i,j});
                } else if(tar==2){
                    pizza.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        System.out.println(ans);

    }
}
