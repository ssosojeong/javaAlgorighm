package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Lecture implements Comparable<Lecture>{
    int money;
    int date;

    public Lecture(int m, int d){
        this.money = m;
        this.date = d;
    }

    @Override
    public int compareTo(Lecture o){
        return o.date - this.date;
    }
}

public class exam4 {
    static int max, N;

    public static int solution(ArrayList<Lecture> arr){
        int ans = 0;

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<N; j++){
                if(arr.get(j).date<i) break;
                pQueue.offer(arr.get(j).money);
            }
            if(!pQueue.isEmpty()) ans+=pQueue.poll();
        }

        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Lecture> arr = new ArrayList<>();

        max = -1;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int money = Integer.parseInt(st.nextToken());
            int date= Integer.parseInt(st.nextToken());
            max = Math.max(max,date);
            arr.add(new Lecture(money, date));
        }

        Collections.sort(arr);


        System.out.println(solution(arr));

    }
}
