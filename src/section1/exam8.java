package section1;

import java.util.Scanner;

public class exam8 {
    public static boolean solution(String str){
        //정규식 활용: 모든 대문자 알파벳(A-Z)이 아닌(^) 문자 한개를 ""로 대체
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return true;

        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(solution(str)?"YES":"NO");

    }
}
