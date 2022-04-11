package section1;

import java.util.Scanner;

public class exam1 {
    public static int solution(String str, char c){
        int ans = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : str.toCharArray()){
            if(x==c) ans++;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);


        System.out.print(solution(str,c));

    }
}
