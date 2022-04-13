package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam12 {
    public static String solution(int N, String str){
        String ans = "";

        for(int i=0; i<N; i++){
            String tmp = str.substring(7*i, 7*i+7).replace("#","1").replace("*","0");
            ans += (char)Integer.parseInt(tmp,2);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(solution(N, str));



    }
}
