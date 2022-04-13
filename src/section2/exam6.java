package section2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exam6 {
    public static boolean isPrime(int num){
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int N, int[] arr){

        ArrayList<Integer> ans = new ArrayList<>();
        //int 뒤집기
        for(int i=0; i<N; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10 + t;
                tmp /= 10;
            }
            if(isPrime(res)) ans.add(res);
        }

//        //체 활용
//        int[] intArr = new int[100001];
//        intArr[1] = 1;
//        for(int i=2; i<100001; i++){
//            if(intArr[i]==0){
//                for(int j=2*i; j<100001; j=j+i) intArr[j]++;
//            }
//        }
//
//        for(String s:arr){
//            int tmp = Integer.parseInt(s);
//            if(intArr[tmp]==0) ans.add(tmp);
//        }


        return ans;

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

//        //String을 바로 뒤집어서 보내는 방법
//        String[] inputs = new String[N];
//        for(int i=0; i<N; i++){
//            inputs[i] = new StringBuilder(scanner.next()).reverse().toString();
//        }

        int[] inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i] = scanner.nextInt();
        }

        for(int i:solution(N,inputs)){
            System.out.print(i + " ");
        }
    }
}
