package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end==o.end) return this.start-o.start;
        else return this.end-o.end;
    }
}

public class exam2 {

    public static int solution(Meeting[] meeting, int N){
        int cnt = 0;
        int et = 0;
        for(Meeting m : meeting){
            if(m.start>=et){
                et = m.end;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Meeting[] meeting = new Meeting[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            meeting[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(meeting);

        System.out.println(solution(meeting,N));

    }
}
