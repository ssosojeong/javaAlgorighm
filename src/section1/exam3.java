package section1;

import java.util.Scanner;

public class exam3 {
    public static String solution(String str){
        String ans = "";
        int m = -1;

//        //1) split 사용
//        String[] strArr = str.split(" ");
//
//        for(String s:strArr){
//            if(s.length()>m){
//                m=s.length();
//                ans=s;
//            }
//        }

        //2) indexOf 사용

        int pos;
        while( (pos=str.indexOf(' '))!=-1 ){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                ans = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) ans = str;

        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
}
