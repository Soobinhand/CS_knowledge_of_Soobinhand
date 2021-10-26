package DesignPattern.practice;

public class B extends A implements var{
    private int b;

    public B(){}

    public B(int b){
        this.b = b;
    }

    @Override
    public int v() {
        return b;
    }
}
