package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam10 {

    public static int solution(int N, int[][] arr){
        int[] di = {-1,0,1,0};
        int[] dj = {0,1,0,-1};
        int ans = 0; boolean flag;

        //입력값이 50*50이기 때문에 그냥 array 1개씩 크게 받아서 연산하는게 더 빠름
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                flag = true;
                for(int d=0; d<4; d++){
                    if(i+di[d]>=0 && i+di[d]<N && j+dj[d]>=0 && j+dj[d]<N && (arr[i+di[d]][j+dj[d]]>=arr[i][j])){
                        flag=false;
                        break;
                    }
                }
                if(flag) ans++;
            }
        }

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
