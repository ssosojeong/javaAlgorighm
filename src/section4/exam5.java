package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class exam5 {
    public static int solution(char[] charArr, String str){
        int ans = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> tarMap = new HashMap<>();
        int len = str.length()-1;

        for(char c : str.toCharArray()){
            tarMap.put(c, tarMap.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<len; i++){
            hashMap.put(charArr[i],hashMap.getOrDefault(charArr[i],0)+1);
        }

        int lt=0;
        for(int rt=len; rt<charArr.length; rt++){
            hashMap.put(charArr[rt],hashMap.getOrDefault(charArr[rt],0)+1);
            //비교
            if(hashMap.equals(tarMap)) ans++;
            if(hashMap.get(charArr[lt])==1){
                hashMap.remove(charArr[lt]);
            } else{
                hashMap.put(charArr[lt],hashMap.get(charArr[lt])-1);
            }

            lt++;
        }


        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String str = br.readLine();

        System.out.println(solution(input.toCharArray(), str));

    }
}
