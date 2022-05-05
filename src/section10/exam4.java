package section10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Brick implements Comparable<Brick>{
    int area;
    int height;
    int weight;

    public Brick(int a, int h, int w){
        area=a;
        height=h;
        weight=w;
    }

    @Override
    public int compareTo(Brick o){
        return o.area-this.area;
    }
}

public class exam4 {
    static int N;
    public static int solution(ArrayList<Brick> arr){
        int[] dy = new int[N];
        dy[0] = arr.get(0).height;
        int ans = dy[0];

        for(int i=1; i<N; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).weight>arr.get(i).weight && dy[j]>max){
                    max = dy[j];
                }
            }
            dy[i] = max+arr.get(i).height;
            ans = Math.max(dy[i],ans);
        }

        return ans;



    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayList<Brick> arr = new ArrayList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr.add(new Brick(a,b,c));
        }

        Collections.sort(arr);

        System.out.println(solution(arr));

    }
}
