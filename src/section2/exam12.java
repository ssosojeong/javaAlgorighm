package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam12 {

    public static int solution(int N, int M, int[][] arr){

        int ans=0;
        boolean flag;

//        //1) 3중 for문으로 푸는 방법 -> 각 학생의 등수를 기록(input 조정)
//        for(int i=0; i<N; i++){
//            for(int j=0; j<N; j++){
//                flag = true;
//                if(i==j) continue;
//                for(int t=0; t<M; t++){
//                    if(arr[t][i]>arr[t][j]){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag){
//                    ans++;
//                }
//            }
//        }

        //2) 4중 for문으로 푸는 방법 -> input 그대로 각 등수의 학생을 기록(풀이대로)

        int pi, pj;

        for(int i=1; i<N+1; i++){
            for(int j=1; j<N+1; j++){
                flag = true;
                if(i==j) continue;
                for(int t=0; t<M; t++){
                    pi = 0; pj = 0;
                    for(int s=0; s<N; s++){
                        if(arr[t][s]==i){
                            pi = s;
                        }
                        if(arr[t][s]==j){
                            pj = s;
                        }
                    }
                    if(pi>pj) flag = false;
                }
                if(flag) ans++;
            }
        }

        return ans;
        
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); //4
        int M = scanner.nextInt(); //3
        int[][] inputs = new int[M][N];

//        //1) 3중 for문으로 푸는 방법 -> 각 학생의 등수를 기록(input 조정)
//        for(int i=0; i<M; i++){ //0,1,2
//            for(int j=0; j<N; j++){ //0,1,2,3
//                int tmp = scanner.nextInt();
//                inputs[i][tmp-1] = j+1;
//            }
//        }

        //2) 4중 for문으로 푸는 방법 -> input 그대로 각 등수의 학생을 기록(풀이대로)
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                inputs[i][j] = scanner.nextInt();
            }
        }


        System.out.println(solution(N,M,inputs));
    }
}
