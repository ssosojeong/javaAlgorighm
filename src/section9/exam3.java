package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Schedule implements Comparable<Schedule>{
    int time;
    char state;

    public Schedule(int time, char state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Schedule o) {
        if(this.time==o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}

public class exam3 {
    public static int solution(ArrayList<Schedule> arr){
        Collections.sort(arr);
        int cnt = 0;
        int ans = 0;

        for(Schedule s : arr){
            if(s.state == 'e') cnt--;
            else cnt++;
            ans = Math.max(ans, cnt);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Schedule> arr = new ArrayList<>();

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr.add(new Schedule(Integer.parseInt(st.nextToken()),'s'));
            arr.add(new Schedule(Integer.parseInt(st.nextToken()),'e'));
        }

        System.out.println(solution(arr));


    }
}
