package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {
    public static ArrayList<Integer> solution(int N, int[] intArr){
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(intArr[0]);
        for(int i=1; i<N; i++){
            if(intArr[i]>intArr[i-1]) ans.add(intArr[i]);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] intArr = new int[N];
        for(int i=0; i<N; i++){
            intArr[i] = scanner.nextInt();
        }

        for(int i : solution(N, intArr)){
            System.out.print(i + " ");
        }
    }
}
