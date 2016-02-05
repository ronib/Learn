package Inter.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 2/3/16
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseIterative {

    public static void main(String[] args) {
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

        Node1 newRoot = reverse(a);
        print(newRoot);
    }

    private static Node1 reverse(Node1 node) {

        Node1 prev = node;
        Node1 curr = node.next;
        Node1 next = node.next.next;

        return null;
    }

    private static void print(Node1 curr) {
        while (curr != null){
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("");
    }
}

