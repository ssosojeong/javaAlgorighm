package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam5 {

    public static int solution(int[] coins, int tar){
        int[] dy = new int[tar+1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for(int coin:coins){
            for(int i=coin; i<=tar; i++){
                dy[i] = Math.min(dy[i], dy[i-coin]+1);
            }
        }

        return dy[tar];

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] coins = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            coins[i] = Integer.parseInt(st.nextToken());
        }

        int tar = Integer.parseInt(br.readLine());

        System.out.println(solution(coins, tar));

    }
}
