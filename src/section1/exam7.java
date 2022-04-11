package section1;

import java.util.Scanner;

public class exam7 {
    public static boolean solution(String str){
        int len = str.length();

//        //1) String 사용-> 반 나눠서 비교
//        str = str.toUpperCase();
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i)!=str.charAt(len-1-i)){
//                return false;
//            }
//        }

        //2) stringbuilder & equalsIgnoreCase사용
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) return true;

        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(solution(str)?"YES":"NO");

    }
}
