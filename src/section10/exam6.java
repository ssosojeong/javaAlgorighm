package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class exam6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dy = new int[M+1];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int qS = Integer.parseInt(st.nextToken());
            int qT = Integer.parseInt(st.nextToken());

            for(int j=M; j>=qT; j--){
                dy[j] = Math.max(dy[j], dy[j-qT]+qS);
            }
        }

        System.out.println(dy[M]);

    }
}
