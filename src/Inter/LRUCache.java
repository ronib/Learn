package Inter;

import java.util.HashMap;
import java.util.Map;

public class LRUCache{

    int capacity;
    HashMap<Integer, Node> map = null;
    Node head = null; // most recently used
    Node tail = null; // lru

    public static void main(String[] args){
        LRUCache cache = new LRUCache(3);
        cache.put(1,"a");
        cache.put(2,"b");
        cache.put(3,"c");
        cache.get(1);
        cache.put(4,"d");

        // b should be deleted. d,a,c
        System.out.println(cache.toString());

    }

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<Integer, Node>(capacity);
    }

    public void put(Integer key, String value){

        if (map.containsKey(key)){
            Node old = map.get(key);
            old.value = value; // set new value
            remove(old);
            insert(old);
        }else{
            Node created = new Node(key, value);
            if (map.size() == capacity){
                map.remove(tail.key);
                remove(tail);
            }
            insert(created);
            map.put(key, created);
        }

    }

    public String get(Integer key){
        if (map.containsKey(key)){
            Node curr = map.get(key);
            remove(curr);
            insert(curr);
            return curr.value;
        }else{
            return "-1";
        }
    }

    public void remove(Node curr){

        if (curr.prev == null){
            head = curr.next;
        }else{
            curr.prev.next = curr.next;

        }

        if (curr.next == null){
            tail = curr.prev;
        }else {
            curr.next.prev = curr.prev;
        }
    }

    public void insert(Node curr){

        if (head == null){
            head = curr;
            tail = curr;
        }else {
            curr.next = head;
            head.prev = curr;
            head = curr;
        }

    }

    public String toString(){
        String result = "";
        for (Map.Entry<Integer,Node> entry : map.entrySet()){
            result += entry.getKey() + ": " + entry.getValue().value + "\n";
        }

        return result;
    }


}

class Node{
    int key;
    String value;
    Node next;
    Node prev;

    public Node(Integer key, String value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}