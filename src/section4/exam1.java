package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class exam1 {
    public static char solution(int N, String str){

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(char c:str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }

        int max = -1;
        char ans=0;
        for(char c: hashMap.keySet()){
            if(hashMap.get(c)>max){
                max = hashMap.get(c);
                ans = c;
            }
        }

        return ans;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        System.out.println(solution(N,input));
    }
}
