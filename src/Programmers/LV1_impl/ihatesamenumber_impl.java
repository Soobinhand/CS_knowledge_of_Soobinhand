package Programmers.LV1_impl;

import Programmers.LV1.ihatesamenumber;

import java.util.Arrays;

public class ihatesamenumber_impl {
    public static void main(String[] args){
        ihatesamenumber a = new ihatesamenumber();
        int[] b = {1,1,3,3,0,1,1};
        int[] d = {4,4,4,3,3};
        System.out.println(Arrays.toString(a.solution(b)));
        System.out.println(Arrays.toString(a.solution(d)));

    }
}
