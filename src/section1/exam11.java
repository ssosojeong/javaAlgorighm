package section1;

import java.util.Scanner;

public class exam11 {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        str = str+" ";
        int cnt = 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i+1)==str.charAt(i)){
                cnt++;
            } else{
                sb.append(str.charAt(i));
                if(cnt>1) sb.append(cnt);
                cnt=1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        //index error 피하기 위해 공백 하나 추가해서 보내기
        System.out.println(solution(str));

    }
}
