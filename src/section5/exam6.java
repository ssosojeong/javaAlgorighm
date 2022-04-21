package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam6 {
    public static int solution(int N, int K){
        int ans = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=N; i++){
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            for(int i=1; i<K; i++){
                queue.offer(queue.poll());
            }
            ans = queue.poll();
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(solution(N,K));

    }
}
