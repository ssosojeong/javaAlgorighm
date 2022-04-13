package section1;

import java.util.Scanner;

public class exam9 {
    public static int solution(String str){

        int ans = 0;

//        //1) 정규식으로
//        ans = Integer.parseInt(str.replaceAll("[^0-9]",""));


//        //2)아스키 코드 활용
//        for(char c : str.toCharArray()){
//            //만약 charAt(i)가 숫자이면
//            if(c>=48 && c<=57){
//                ans += ans*10 + (c-48);
//            }
//        }

        //3) isDigit 활용
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                ans += ans*10 + (c-48);
            }
        }


        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(solution(str));

    }
}
