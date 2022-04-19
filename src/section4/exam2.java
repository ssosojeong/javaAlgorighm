package section4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class exam2 {
    public static boolean solution(String str1, String str2){

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c:str1.toCharArray()){
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        for(char c:str2.toCharArray()){
            if(hashMap.containsKey(c)||hashMap.get(c)==0) return false;
            hashMap.put(c,hashMap.get(c)-1);


        }

        for(char key:hashMap.keySet()){
            if(hashMap.get(key)!=0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        String input2 = br.readLine();

        System.out.println(solution(input1, input2)?"YES":"NO");
    }
}
