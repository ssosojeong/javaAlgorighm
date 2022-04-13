package section2;

import java.io.IOException;
import java.util.Scanner;

public class exam3 {
    public static String solution(int N, int[][] intArr){
        String ans = "";

        for(int i=0; i<N; i++){
            if(intArr[0][i]==intArr[1][i]) ans+="D" ;
            else if(intArr[0][i]==1&&intArr[1][i]==3) ans+="A";
            else if(intArr[0][i]==2&&intArr[1][i]==1) ans+="A";
            else if(intArr[0][i]==3&&intArr[1][i]==2) ans+="A";
            else ans+= "B";
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] intArr = new int[2][N];
        for(int i=0; i<2; i++){
            for(int j=0; j<N; j++){
                intArr[i][j] = scanner.nextInt();
            }
        }

        for(char c:solution(N,intArr).toCharArray()){
            System.out.println(c);
        }
    }
}
