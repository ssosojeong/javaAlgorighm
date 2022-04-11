package section1;

import java.util.Scanner;

public class exam2 {
    public static String solution(String str){
        String ans = "";

        for(char c : str.toCharArray()){
           if(c>=97 && c<=122) ans+= (char)(c-32);
           else ans+= (char)(c+32);
        }

        /*
        //또는 Character 메소드 사용
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) ans += Character.toUpperCase(c);
            else ans += Character.toLowerCase(c);
        }

         */


        return ans;



    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));

    }
}
