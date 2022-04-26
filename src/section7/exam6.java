package section7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam6 {
    static int N;
    static boolean[] chk;

    public static void DFS(int I){
        if(I==N+1){
            String tmp = "";
            for(int i=1; i<=N; i++){
                if(chk[i]) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        } else{
            chk[I] = true;
            DFS(I+1);
            chk[I] = false;
            DFS(I+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        chk = new boolean[N+1];
        DFS(1);

    }
}
