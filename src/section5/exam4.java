package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam4 {
    public static int solution(String str){
        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            } else{
                int b = stack.pop();
                int a = stack.pop();
                switch(c){
                    case('+') : stack.push(a+b); break;
                    case('-') : stack.push(a-b); break;
                    case('*') : stack.push(a*b); break;
                    case('/') : stack.push(a/b); break;

                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));

    }
}