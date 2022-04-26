package section7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class exam7 {
    static Node root;
    public static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while(!queue.isEmpty()){

        }
    }
    public static void main(String[] args) throws IOException {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root);

        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}
