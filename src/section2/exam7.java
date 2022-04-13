package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam7 {

    public static int solution(int N, int[] arr){

        int ans = 0;
        int sum = 0;

        for(int i=0; i<N; i++){
            if(arr[i]==1){
                sum++;
                ans+=sum;
            } else{
                sum=0;
            }
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i] = scanner.nextInt();
        }

        System.out.println(solution(N,inputs));
    }
}
