package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam9 {

    public static int solution(int N, int[][] arr){

        int ans = -1;
        int sum1, sum2;

        //행과 열의 최대합 구하기
        for(int i=0; i<N; i++){
            sum1 = sum2 = 0;
            for(int j=0; j<N; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            ans = Math.max(ans,sum1);
            ans = Math.max(ans,sum2);
        }

        sum1 = sum2 = 0;
        // 대각선의 합 구하기
        for(int i=0; i<N; i++){
            // \방향
            sum1 += arr[i][i];
            // /방향
            sum2 += arr[i][N-1-i];
        }
        ans = Math.max(ans,sum1);
        ans = Math.max(ans,sum2);

        return ans;
        
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] inputs = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                inputs[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(N,inputs));
    }
}
