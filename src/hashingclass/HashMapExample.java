package hashingclass;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        // hm.put(key, value);
        // key should be unique
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        System.out.println(hm);
        hm.put(3, "THREE");
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get(3));
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsKey(99));//O(1)
        System.out.println(hm.containsValue("THREE"));
        System.out.println(hm.containsValue("abcd")); // o(n)

        //iterate hashmap
        for(int i:hm.keySet()){
            System.out.println("key: "+i+" value: "+hm.get(i));
        }

        Iterator<HashMap.Entry<Integer, String>> it = hm.entrySet().iterator();
//        Iterator<HashMap.Entry<Integer, String>> it = hm.entrySet().iterator();
        //Itertera<Integre> it = li.iterator();
        while(it.hasNext()){
            HashMap.Entry<Integer, String> curr = it.next();
            System.out.println("key: "+curr.getKey()+" value: "+curr.getValue());
        }

    }
}
