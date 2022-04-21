package hashingclass;

import java.util.Iterator;
import java.util.Vector;


public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        // int arr[] = new int[5];
        //arr[0] = 10;
        v.add(10);
        v.add(20);
        v.add(30);
//        System.out.println(v.get(0)); //arr[0]
//        System.out.println(v);
        // index, value
        v.set(1, 70); // arr[1] = 70;
//        System.out.println(v);
            int length = v.size();
        for(int i=0;i<length;i++){
            System.out.print(v.get(i)+" ");
        }
//        Iterator it = v.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }


//        System.out.println();
        v.add(1, 90); //O(n)
        v.remove(1);
        Integer delValue = 10;
        v.remove(delValue); // O(n)
        System.out.println(v);
        v.remove(v.size()-1);//O(n)
        System.out.println(v);

        Vector<Integer> v1 = new Vector<>();
        v1.add(99);
        v1.add(88); //O(1)
        v.addAll(v1); // O(n)
        System.out.println(v);



    }
}
