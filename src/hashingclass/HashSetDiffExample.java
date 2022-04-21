package hashingclass;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDiffExample {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>(); // O(1) hashing, order -> cannot predicted
        TreeSet<Integer> ts= new TreeSet<>(); //O(logn) BST, order->sorted
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>(); // LinkedList, order-> insertion order
        hs.add(30);
        hs.add(40);
        hs.add(20);
        System.out.println(hs);
        ts.add(30);
        ts.add(40);
        ts.add(20);
        System.out.println(ts);
        lhs.add(30);
        lhs.add(40);
        lhs.add(20);
        System.out.println(lhs);
    }
}
