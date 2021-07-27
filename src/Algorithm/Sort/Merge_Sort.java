package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sort {
    public void splitFunc(ArrayList<Integer> dataList){
        if(dataList.size()<=1){
            return ;
        }
        int medium = dataList.size()/2;

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        leftList = new ArrayList<>(dataList.subList(0,medium));
        rightList = new ArrayList<>(dataList.subList(medium,dataList.size()));
        System.out.println(leftList);
        System.out.println(rightList);

    }

    public static void main(String[] args) {
        Merge_Sort s = new Merge_Sort();
        s.splitFunc(new ArrayList<>(Arrays.asList(4,1,2,3,4,5)));
    }
}
