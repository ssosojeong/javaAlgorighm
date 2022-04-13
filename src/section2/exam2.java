package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam2 {
    public static int solution(int N, int[] intArr){

        int max = -1;
        int cnt = 0;

        for(int i=0; i<N; i++){
            if(intArr[i]>max) {
                cnt++;
                max = intArr[i];
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] intArr = new int[N];
        for(int i=0; i<N; i++){
            intArr[i] = scanner.nextInt();
        }

        System.out.println(solution(N,intArr));
    }
}
