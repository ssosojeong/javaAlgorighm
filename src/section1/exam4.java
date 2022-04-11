package section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class exam4 {
    public static ArrayList<String> solution(String[] strArr, int N){
        ArrayList<String> ans = new ArrayList<>();

//        //1) StringBuilder 사용
//        for(String s : strArr){
//            String tmp = new StringBuilder(s).reverse().toString();
//            ans.add(tmp);
//        }

        //2) 특정 몇개만 뒤집기 -> 실제 코드를 하나씩 구현하여
        for(String s : strArr){
            char[] charArr = s.toCharArray();
            int lt = 0;
            int rt = s.length()-1;

            while(lt<rt){
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++; rt--;
            }

            ans.add(String.valueOf(charArr));

        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];

        for(int i=0; i<N; i++){
            inputs[i] = br.readLine();
        }

        for(String s : solution(inputs,N)){
            System.out.println(s);
        }



    }
}
