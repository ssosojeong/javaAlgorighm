package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam7 {
    public static boolean solution(String str1, String str2){

        Queue<Character> queue = new LinkedList<>();

        for(char c : str1.toCharArray()){
            queue.offer(c);
        }

        for(char c : str2.toCharArray()){
            if(queue.contains(c)){
                if(c!=queue.poll()) return false;
            }
        }
        if(!queue.isEmpty()) return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(solution(str1, str2)?"YES":"NO");

    }
}
