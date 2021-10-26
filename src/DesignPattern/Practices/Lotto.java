package DesignPattern.Practices;

import java.util.HashSet;

public class Lotto {
    HashSet<Long> set = new HashSet<>();
    public void create(){
        for (int i=0;i<=6;i++){
            set.add(Math.round(Math.random()*45));
        }
        System.out.println(set);
    }
}
