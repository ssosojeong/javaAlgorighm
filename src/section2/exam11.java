package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam11 {

    public static int solution(int N, int[][] arr){

        int cnt;
        int max = -1;
        int ans=0;

        for(int i=0; i<N; i++){
            cnt = 0;
            for(int s=0; s<N; s++){
                if(s==i) continue;
                for(int j=0; j<5; j++){
                    if(arr[i][j]==arr[s][j]){
                        cnt++;
                        break;
                    }
                }

            }
            if(cnt>max){
                max = cnt;
                ans = i;
            }



        }

        return ans+1;
        
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] inputs = new int[N][5];
        for(int i=0; i<N; i++){
            for(int j=0; j<5; j++){
                inputs[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(N,inputs));
    }
}
