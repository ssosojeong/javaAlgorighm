package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam4 {
    public static int[] solution(int N){
        int[] ans = new int[N];

        ans[0] = 1;
        ans[1] = 1;
        for(int i=2; i<N; i++){
            ans[i] = ans[i-2]+ans[i-1];
        }
        return ans;

//        //*배열 안쓰고 for문만
//        int a = 1, b = 1, c;
//        System.out.print(a+ " " + b+" ");
//        for(int i=0; i<N; i++){
//            c = a+b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i:solution(N)){
            System.out.print(i + " ");
        }
    }
}
