package oops.packageexplain.sameclass;

public  class Test1{
    public int a;
    private int b; // atm



    protected  int c;
    int d; // default

    void setB(int b) { // setter
        this.b = b;
    }

    int getB(){ // getter
        return this.b;
    }


    public  void print(){
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
        System.out.println("d "+d);
    }
}
