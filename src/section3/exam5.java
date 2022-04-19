package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam5 {
    public static int solution(int K){

        int lt=1, ans=0, sum=0;

        for(int rt = 1; rt<K/2+2; rt++){
            sum += rt;
            if(sum==K) ans++;
            while(sum>=K){
                sum-=lt++;
                if(sum==K) ans++;
            }
        }

        //2) 수학적으로 풀기
//        int cnt = 1;
//        K--;
//        while(K>0){
//            cnt++;
//            K=K-cnt;
//            if(K%cnt==0) ans++;
//        }



        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        System.out.println(solution(K));


    }
}
