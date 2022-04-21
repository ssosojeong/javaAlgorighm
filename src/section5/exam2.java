package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam2 {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c==')'){
                while(stack.pop()!='(');
            } else stack.push(c);
        }

//        //1) sb.reverse()로 리턴하기
//        while(!stack.isEmpty()){
//            sb.append(stack.pop());
//        }
//
//        return sb.reverse().toString();

        //2) stack.get()써서 for문으로 만들어 리턴하기
        for(int i=0; i<stack.size();i++){
            sb.append(stack.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
