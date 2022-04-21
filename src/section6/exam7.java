package section6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Point implements Comparable<Point>{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x){
            return this.y-o.y;
        } else{
            return this.x-o.x;
        }
    }
}

public class exam7 {
    public static ArrayList<Integer> solution(int N, int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<N; i++){
            if(arr[i]!=tmp[i]){
                ans.add(i+1);
            }
        }

        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            arr.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(arr);

        for(Point p : arr){
            System.out.println(p.x + " " + p.y);
        }
    }
}
