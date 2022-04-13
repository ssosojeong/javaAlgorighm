package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam5 {
    public static int solution(int N){

        int ans = 0;
        int[] intArr = new int[N+1];

        for(int i=2; i<=N; i++){
            if(intArr[i]==0){
                ans++;
                for(int j=i; j<=N; j=j+i){
                    intArr[j]++;
                }
            }
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(solution(N));
    }
}
