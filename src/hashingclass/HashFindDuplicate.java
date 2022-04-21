package hashingclass;

// for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i!=j && arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//        }
public class HashFindDuplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 44, 11, 10}; //10
        int n = arr.length;


        int hashTable[] = new int[101];
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(hashTable[num]>=1){
                System.out.println(num);
                break;
            }
            hashTable[num] = hashTable[num]+1;
        }

    }
}
