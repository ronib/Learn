package Inter.List;

import java.util.LinkedList;


/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/28/15
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseList {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Start main");
        LinkedList<Node> list = new LinkedList<Node>();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);

        print(list);

        list = reverse(list);
        print(list);
    }

    private static LinkedList<Node> reverse(LinkedList<Node> list) {
        LinkedList<Node> result = new LinkedList<Node>();
        while (!list.isEmpty()){
            Node l1 = list.pollLast();
            result.add(l1);
        }

        return result;
    }

    private static void print(LinkedList<Node> list) {
        for (Node item : list){
            System.out.print(item.value + "->");
        }
        System.out.println("");
    }
}

class Node {
    int value;
    public Node(int value){
        this.value = value;

    }
}
