package section7;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class exam9 {
    static Node root;
    public static int DFS(int L, Node root){
        if(root.lt==null && root.rt==null){
            return L;
        } else{
            return Math.min(DFS(L+1, root.lt), DFS(L+1,root.rt));
        }
    }
    public static void main(String[] args) throws IOException {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        //만약 자식노드가 1개인 노드가 있으면 error 발생
        //10줄에서 조건이 and이기 때문에 재귀에서 왼쪽/오른쪽 둘 다 검색하게됨
        //root.rt.lt = new Node(6);
        System.out.println(DFS(0,root));
    }
}
