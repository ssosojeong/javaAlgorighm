package section7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class exam10 {
    static Node root;
    public static int BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                Node cur = queue.poll();
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) queue.offer(cur.lt);
                if(cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
