package stl_collections;

public class WrapperClasses {
    static  void primitive(){
        int age = 15;
        double percentage = 99.1;
        char gender = 'M';
        boolean isPlaced = true; // value
    }
    public static void main(String[] args) {
        // HashMap<Integer, Integer>
//        Integer age = 15;
        Integer age = 1; // by reference
        Double percentage = 99.1;
        Character gender = 'M';
        Boolean isPlaced = true;
        System.out.println(age+" "+percentage+" "+gender+" "+isPlaced);
    }
}
