package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class exam8 {
    public static int solution(int N, int M, int[] arr){
        int ans = 1;

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            queue.add(new int[] {i,arr[i]});
        }
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            for(int[] tar : queue){
                if(tar[1]>tmp[1]){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp[0]==M) return ans;
                else ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] intArr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,M,intArr));

    }
}
