package section1;

import java.util.Scanner;

public class exam10 {
    public static int[] solution(String str, char c){
        int[] ans = new int[str.length()];
        int d = 1000;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                d=0;
                ans[i]=d;
            }
            else{
                d++;
                ans[i]=d;
            }
        }

        d=1000;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==c){
                d=0;
            }
            else{
                d++;
                ans[i]=Math.min(ans[i],d);
            }
        }


        return ans;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        for(int x: solution(str,c)){
            System.out.print(x+" ");
        }

    }
}
