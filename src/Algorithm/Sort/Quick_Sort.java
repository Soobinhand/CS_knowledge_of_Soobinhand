package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Quick_Sort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if(dataList.size()<=1){
            return dataList;
        }
        int pivot = dataList.get(0);
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        for(int i=1;i< dataList.size();i++){
            if(dataList.get(i) > pivot){
                rightList.add(dataList.get(i));
            }else{
                leftList.add(dataList.get(i));
            }
        }
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(this.sort(leftList));
        mergedList.addAll(Arrays.asList(pivot));
        mergedList.addAll(this.sort(rightList));

        return mergedList;

    }

    public static void main(String[] args) {
        Quick_Sort q= new Quick_Sort();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add((int)(Math.random()*100));
        }
        System.out.println(q.sort(list));
    }
}
