package DesignPattern.practice;

public class A implements var{
    private int a;

    public A(int a) {
        this.a = a;
    }

    public A(){}

    @Override
    public int v() {
        return a;
    }
}
