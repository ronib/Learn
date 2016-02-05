package Inter.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 2/3/16
 * Time: 10:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseRecur {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Start main");

        Node1 a = new Node1(1);
        Node1 b = new Node1(2);
        Node1 c = new Node1(3);
        Node1 d = new Node1(4);
        Node1 e = new Node1(5);
        Node1 f = new Node1(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        print(a);

        Node1 newRoot = reverse1(a);
        print(newRoot);
    }

    private static Node1 reverse(Node1 first) {

        // the reverse of null is null
        if (first == null){
            return null;
        }
        // the reverse of one node is itself
        if (first.next == null){
            return first;
        }

        // reverse of two elements is the second followed after the first
        Node1 second = first.next;
        // first is the last now. unlink list so we won't get a cycle
        first.next = null;
        Node1 rest = reverse(second);
        //join two lists
        second.next = first;
        return rest;
    }

    private static Node1 reverse1(Node1 head){
        // if head is null or only one node, it's reverse of itself.
        if ( (head==null) || (head.next == null) ) return head;

        // reverse the sub-list leaving the head node.
        Node1 reverse = reverse1(head.next);

        // head.next still points to the last element of reversed sub-list.
        // so move the head to end.
        head.next.next = head;

        // point last node to nil, (get rid of cycles)
        head.next = null;
        return reverse;
    }

    private static void print(Node1 curr) {
        while (curr != null){
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("");
    }
}

class Node1 {
    int value;
    Node1 next;
    public Node1(int value){
        this.value = value;

    }
}