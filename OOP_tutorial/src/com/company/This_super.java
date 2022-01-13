package com.company;

class EKClass{
    int a;

    public int getA(){
        return a;
    }

    EKClass (int a){
        this.a = a;

    }
    public int returnone(){
        return 1;
    }

}

class DoClass extends EKClass{
    DoClass(int c){
        super(c);
        System.out.println("Mau is con");
    }
}
public class This_super {
    public static void main(String[] args) {
        EKClass e = new EKClass(5);
        System.out.println(e.getA());
        System.out.println(e.getClass());
        DoClass d = new DoClass(5);
        System.out.println();
    }
}
