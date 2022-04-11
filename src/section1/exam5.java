package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class exam5 {
    public static String solution(String str){

        String ans = "";

        char[] inputs = str.toCharArray();

        int lt = 0;
        int rt = inputs.length-1;

        while(lt<rt){
            if(!Character.isAlphabetic(inputs[lt])){
                lt++;
            } else if(!Character.isAlphabetic(inputs[rt])){
                rt--;
            } else{ //inputs[lt], inputs[rt] 둘 다 모두 알파벳일 때
                char tmp = inputs[lt];
                inputs[lt] = inputs[rt];
                inputs[rt] = tmp;
                lt++;
                rt--;
            }
        }

        ans=String.valueOf(inputs);

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        System.out.println(solution(input));


    }
}
