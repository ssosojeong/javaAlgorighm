package section5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class exam3 {
    public static int solution(int N, int[][] board, int M, int[] moves){
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for(int pos : moves){
            int tar = 0;
            for(int i=0; i<N; i++){
                if(board[i][pos-1]!=0){
                    tar = board[i][pos-1];
                    board[i][pos-1]=0;
                    break;
                }
            }
            if(!stack.isEmpty() && stack.peek()==tar){
                stack.pop();
                ans+=2;
            } else{
                stack.push(tar);
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<M; i++){
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N,board,M,moves));

    }
}
