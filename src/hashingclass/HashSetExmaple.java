package hashingclass;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExmaple {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.add(10));
        System.out.println(hs.add(20));
        System.out.println(hs.add(30));
        System.out.println(hs);
        System.out.println(hs.add(30));
        System.out.println(hs.contains(10));
        System.out.println(hs);

//        Iterator<Integer> it = hs.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next()+ " ");
//        }
//        for(int i:hs){
//            System.out.println(i);
//        }
        System.out.println(hs.size());
        hs.remove(30);
        System.out.println(hs);
    }
}
