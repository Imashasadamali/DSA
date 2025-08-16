import java.util.Iterator;
import java.util.NoSuchElementException;

// Simple singly linked list with add/contains/remove + iterator
public class LinkedListCollection<T> implements Iterable<T> {
    // node structure
    private static class Node<T> { T v; Node<T> next; Node(T v){ this.v = v; } }

    private Node<T> head; // first node
    private int n;        // size

    public int size(){ return n; }
    public boolean isEmpty(){ return n == 0; }

    // add to front (O(1))
    public void add(T x){
        Node<T> p = new Node<>(x);
        p.next = head;
        head = p;
        n++;
    }

    // linear search (O(n))
    public boolean contains(T x){
        for (T v : this)
            if ((v == null && x == null) || (v != null && v.equals(x)))
                return true;
        return false;
    }

    // remove first occurrence (O(n))
    public boolean remove(T x){
        Node<T> prev = null, cur = head;
        while (cur != null){
            boolean match = (cur.v == null && x == null) || (cur.v != null && cur.v.equals(x));
            if (match){
                if (prev == null) head = cur.next; else prev.next = cur.next;
                n--;
                return true;
            }
            prev = cur; cur = cur.next;
        }
        return false;
    }

    // forward iterator to support for-each
    @Override public Iterator<T> iterator(){
        return new Iterator<T>(){
            Node<T> cur = head;
            public boolean hasNext(){ return cur != null; }
            public T next(){
                if (cur == null) throw new NoSuchElementException();
                T v = cur.v; cur = cur.next; return v;
            }
        };
    }
}