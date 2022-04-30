package section9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Body implements Comparable<Body>{
    int height;
    int weight;

    public Body(int h, int w){
        this.height = h;
        this.weight = w;
    }


    @Override
    public int compareTo(Body o) {
        return o.height-this.height;
    }
}

public class exam1 {
    public static int solution(Body[] body) {
        int ans = 0;
        int max = -1;

        for(Body b : body){
            if(b.weight>max){
                ans++;
                max = b.weight;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Body[] body = new Body[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            body[i] = new Body(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(body);

        System.out.println(solution(body));

    }
}