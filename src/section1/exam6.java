package section1;

import java.util.Scanner;

public class exam6 {
    public static String solution(String str){
        String ans = "";

        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str));

    }
}
