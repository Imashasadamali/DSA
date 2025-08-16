import java.util.HashSet;
import java.util.Set;

// Wrapper around HashSet that also exposes union/intersection/difference
public class HashSetSet<T> {
    private final Set<T> s = new HashSet<>();

    public boolean add(T x){ return s.add(x); }
    public boolean remove(T x){ return s.remove(x); }
    public boolean contains(T x){ return s.contains(x); }
    public int size(){ return s.size(); }
    public boolean isEmpty(){ return s.isEmpty(); }
    public Set<T> asJavaSet(){ return s; } // handy for printing
    // union (this ∪ other)
    public HashSetSet<T> union(HashSetSet<T> other){
        HashSetSet<T> out = new HashSetSet<>();
        out.s.addAll(this.s);
        out.s.addAll(other.s);
        return out;
    }
    // intersection (this ∩ other)
    public HashSetSet<T> intersection(HashSetSet<T> other){
        HashSetSet<T> out = new HashSetSet<>();
        for (T x : this.s) if (other.s.contains(x)) out.s.add(x);
        return out;
    }
    // difference (this \ other)
    public HashSetSet<T> difference(HashSetSet<T> other){
        HashSetSet<T> out = new HashSetSet<>();
        for (T x : this.s) if (!other.s.contains(x)) out.s.add(x);
        return out;
    }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashSetSet;

/**
 *
 * @author User
 */
public class java {
    
}
