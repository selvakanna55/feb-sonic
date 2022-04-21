package hashingclass;


class Hashing{
    int size = 12;
    int hashTable[] = new int[size];

//    int hashFunction(int value){
//        return value%size;
//    }

    int hashFunction(int value, int i){
        int hashKey = value%size;
        return (hashKey + i)%size;
//        return (value%size);
    }


    void putValue(int value){
        int i= 0;
        while(true){
            int key = hashFunction(value, i);
            if(hashTable[key]==0) { // i can put, it is free
                hashTable[key] = value;
                break;
            }
            i++;
        }

    }

    boolean checkIfPresent(int value){
        int i = 0;
        while(true){
            int key = hashFunction(value, i);
            if(hashTable[key]==value) { // i can put, it is free
                return true;
            }
            else if(hashTable[key]==0){
                return  true;
            }
            i++;
        }

//        int key = hashFunction(value);
//        if(hashTable[key]==value){
//            return true;
//        }
//        return  false;
    }

}

public class SimpleHashingExample {
    public static void main(String[] args) {
        int arr[] = {8, 3, 7, 6, 13}; //13
        Hashing hh = new Hashing();
        //fill hash table
        for(int i=0;i<arr.length;i++){
            hh.putValue(arr[i]);
        }
        //searching
        System.out.println("Is 13 is Present? "+hh.checkIfPresent(13));  //O(1)
        System.out.println("Is 5 is Present? "+hh.checkIfPresent(5)); // O(1)
        System.out.println("Is 5 is Present? "+hh.checkIfPresent(11)); // O(1)
        System.out.println("Is 5 is Present? "+hh.checkIfPresent(91));
    }
}
