package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class exam5 {
    public static int solution(char[] arr){
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(arr[0]);

        for(int i = 1; i<arr.length; i++) {
            if(arr[i]=='(') stack.push(arr[i]);
            else{
                stack.pop();
                //1) 직전이 '('라면 -> 레이저이다
                if(arr[i-1]=='(') ans += stack.size();
                //2) 직전이 ')'라면 -> 잘려야 하는 막대기가 끝났다
                else ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str.toCharArray()));

    }
}
