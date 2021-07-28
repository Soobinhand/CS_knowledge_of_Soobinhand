package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Sort {
    public ArrayList<Integer> splitFunc(ArrayList<Integer> dataList){
        if(dataList.size()<=1){
            return  dataList;
        }
        int medium = dataList.size()/2;

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        leftList = splitFunc(new ArrayList<Integer>(dataList.subList(0,medium)));
        rightList = splitFunc(new ArrayList<Integer>(dataList.subList(medium,dataList.size())));
        return mergeFunc(leftList,rightList);

    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList,ArrayList<Integer> rightList){
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;
        while (leftList.size() > leftPoint && rightList.size()>rightPoint){
            if(leftList.get(leftPoint) > rightList.get(rightPoint)){
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            }else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;
            }
        }

        while (leftList.size() > leftPoint){
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        while (rightList.size() > rightPoint){
            mergedList.add(rightList.get(rightPoint));
            rightPoint+=1;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Merge_Sort s = new Merge_Sort();
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0;i<100;i++){
            testData.add((int)(Math.random()*100));
        }
        System.out.println(s.splitFunc(testData));
    }
}
