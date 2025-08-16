import java.util.LinkedHashSet;

// Set that preserves insertion order (uses LinkedHashSet)
public class LinkedHashSetSequencedSet<T> {
    private final LinkedHashSet<T> s = new LinkedHashSet<>();

    public boolean add(T x){ return s.add(x); }
    public boolean remove(T x){ return s.remove(x); }
    public boolean contains(T x){ return s.contains(x); }
    public int size(){ return s.size(); }
    public boolean isEmpty(){ return s.isEmpty(); }

    // iterate in insertion order
    public Iterable<T> items(){ return s; }
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedHashSetSequencedSet;

/**
 *
 * @author User
 */
public class java {
    
}
