package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam1 {
    public static boolean solution(String str){

        Stack<Character> stack = new Stack<>();

        for(char c:str.toCharArray()){
            if(c=='(') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str)?"YES":"NO");
    }
}
