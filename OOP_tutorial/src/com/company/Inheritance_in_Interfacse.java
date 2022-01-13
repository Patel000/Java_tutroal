package com.company;

interface sampleInterfaces{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterfaces{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("math1");
    }
    public void meth2(){
        System.out.println("math2");
    }
    public void meth3(){
        System.out.println("math3");
    }
    public void meth4(){
        System.out.println("math4");
    }



}
public class Inheritance_in_Interfacse {
    public static void main(String[] args) {
        MySampleClass s = new MySampleClass();
        s.meth1();
        s.meth3();
    }
}
