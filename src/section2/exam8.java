package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam8 {

    public static int[] solution(int N, int[] arr){

        int[] ans = new int[N];

        int cnt;
        for(int i=0; i<N; i++){
            cnt = 1;
            for(int j=0; j<N; j++){
                if(arr[i]<arr[j]) cnt++;
            }
            ans[i]=cnt;
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

        for(int i:solution(N,inputs)){
            System.out.print(i + " ");
        }
    }
}
